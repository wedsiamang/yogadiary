package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import model.LoginLogic;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
	dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		int userId=0;
		String userName=request.getParameter("userName");
		String pass=request.getParameter("pass");
	
		//空白か、そうではないか
		if(userName.equals("") || pass.equals("")) {
		request.setAttribute("Msg","please input");
		request.setAttribute("Msg", "Wrong name or password");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);	
		
//			
		}else {
			
				//ログイン処理の実行
			Account  loginAc= new Account(userId,userName,pass);
			LoginLogic bo = new LoginLogic();
			loginAc = bo.execute(userName,pass);

			if(loginAc!=null) {
				//ログイン成功
				HttpSession session=request.getSession();
				session.setAttribute("loginAc", loginAc);
				request.setAttribute("Msg","success!");
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/loginOK.jsp");
				dispatcher.forward(request, response);
						
				}else {
					//ログイン失敗時 
					request.setAttribute("Msg", "Wrong name or password");
					RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
					dispatcher.forward(request, response);
				}
			
		}
	}
}
