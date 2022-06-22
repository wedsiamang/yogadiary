package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DiaryDao;
import dao.TeacherDao;
import model.Account;
import model.Diary;
import model.Teacher;
/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
	
		HttpSession session=request.getSession();
		Account loginAc=(Account)session.getAttribute("loginAc");
		String loginName=loginAc.getUserName();
		System.out.println(loginName+"*");
		
		
		TeacherDao dao=new TeacherDao();
		Teacher teachers=dao.select_teacher(loginName);
		
		request.setAttribute("teachers",teachers);
			
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/show.jsp");
		dispatcher.forward(request, response);
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		
		int id=0;
		String date =request.getParameter("date");
		id=Integer.parseInt(request.getParameter("id"));
		String weather=request.getParameter("weather");
		String covid19=request.getParameter("covid19");
		String BBT=request.getParameter("BBT");
		String time=request.getParameter("time");		
		String series=request.getParameter("series");
		String teacher=request.getParameter("teacher");
		String condition=request.getParameter("condition");
		String breath=request.getParameter("breath");
		String vanda=request.getParameter("vanda");
		String dristi=request.getParameter("dristi");
		String ate=request.getParameter("ate");
		String event=request.getParameter("event");
		String myName=request.getParameter("myName");
		
		String teacher1=request.getParameter("teacher1");
		String teacher2=request.getParameter("teacher2");
		String teacher3=request.getParameter("teacher3");
		String teacher4=request.getParameter("teacher4");
		String teacher5=request.getParameter("teacher5");
		
		HttpSession session=request.getSession();
		Account loginAc=(Account)session.getAttribute("loginAc");
		String loginName=loginAc.getUserName();
		System.out.println(loginName+"*");
		
		DiaryDao dao = new DiaryDao();		
		Diary day =dao.select_diary(loginName,id);
		
		
		TeacherDao d=new TeacherDao();
		Teacher teachers=d.select_teacher(loginName);
		
		request.setAttribute("day",day);
		request.setAttribute("teachers",teachers);

		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/show.jsp");
		dispatcher.forward(request, response);
	}
}
