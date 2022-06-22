package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDao;
import dao.DiaryDao;
import dao.TeacherDao;
import model.GetMyNameLogic;
import model.GetUserNameLogic;
import model.Teacher;

@WebServlet("/CreateAccountServlet")
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateAccountServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/createAccount.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		int userId=0;
		String userName=request.getParameter("userName");
		String pass=request.getParameter("pass");
		String myName=request.getParameter("myName");
		String teacher1=request.getParameter("teacher1");
		String teacher2=request.getParameter("teacher2");
		String teacher3=request.getParameter("teacher3");
		String teacher4=request.getParameter("teacher4");
		String teacher5=request.getParameter("teacher5");
		String Msg="";
		int count=0;
		int count2=0;
	
		System.out.println(userName+"##");
		if(userName.equals("") || pass.equals("")) {
		request.setAttribute("Msg", "please input name and password.");

			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/createAccount.jsp");
			dispatcher.forward(request, response);
		}else {
			GetUserNameLogic bo=new GetUserNameLogic();
			List<String> userNameList=bo.getUserName();
				for(String userNames:userNameList) {
					//ユーザーネーム重複があればカウントする
					if(userNames.equals(userName)){	
					//	System.out.println(userNames);
						count++;
					}
				}
			//	System.out.println(count+"*" + userName);
				if(count==0) {//重複がなければ
						AccountDao dao=new AccountDao();
						dao.insert_new_account(userName,pass);
						
						GetMyNameLogic bo2=new GetMyNameLogic();
						List<String>myNames=bo2.getMyName();
						for(String temp2 : myNames) {
							if(temp2==myName) {
								count2++;
							}
						}
						if(count2==0) {
							String loginName=userName;
							DiaryDao dao2=new DiaryDao();
							dao2.insert_diary_myName(loginName);
						
							//teacherテーブルにログイン名を登録し紐付け
							Teacher teacher=new Teacher();
							TeacherDao dao3 =new TeacherDao();
							dao3.insert_teacher(loginName,teacher1,teacher2,teacher3,teacher4,teacher5);
						}
							RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
							dispatcher.forward(request, response);
				}else if(count!=0) {//失敗
					request.setAttribute("Msg", "name already exists.");
					count=0;
				RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/createAccount.jsp");
				dispatcher.forward(request, response);
				}
		
		
		
		}
	}
}
		
	


