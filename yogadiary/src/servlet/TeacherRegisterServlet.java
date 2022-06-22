package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TeacherDao;
import model.Account;
import model.Teacher;

@WebServlet("/TeacherRegisterServlet")
public class TeacherRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TeacherRegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/teacher.jsp");
		dispatcher.forward(request, response);	
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		int id=0;
		//id=Integer.parseInt(request.getParameter("id"));
		String myName=request.getParameter("myName");
		String teacher1=request.getParameter("teacher1");
		String teacher2=request.getParameter("teacher2");
		String teacher3=request.getParameter("teacher3");
		String teacher4=request.getParameter("teacher4");
		String teacher5=request.getParameter("teacher5");
		
			//Teacher teacher =new Teacher();
		HttpSession session=request.getSession();
		Account loginAc=(Account)session.getAttribute("loginAc");
		String loginName=loginAc.getUserName();
			TeacherDao dao =new TeacherDao();
			//先生新規登録
			dao.regist_teacher(myName,teacher1,teacher2,teacher3,teacher4,teacher5);
			//先生一覧取得
			Teacher teachers=dao.select_teacher(loginName);
			System.out.println(teacher4);
	
			request.setAttribute("teachers",teachers);
			
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/teacher.jsp");
		dispatcher.forward(request, response);
	
	}

}
