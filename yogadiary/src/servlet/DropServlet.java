package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DiaryDao;
import dao.GetDiaryDao;
import model.Account;
import model.Diary;

@WebServlet("/DropServlet")
public class DropServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DropServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//	HttpSession session=request.getSession();
	//	Account loginAc=(Account)session.getAttribute("loginAc");
	//	String loginName=loginAc.getUserName();
	//	System.out.println(loginName+"*");
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=0;	
		id=Integer.parseInt(request.getParameter("id"));
		
		String myName=request.getParameter("myName");
		String date =request.getParameter("date");
		String weather=request.getParameter("weather");
		String BBT=request.getParameter("BBT");//id=oneCustomer.getId();
		String time=request.getParameter("time");		
		String series=request.getParameter("series");//id=oneCustomer.getId();
		String teacher=request.getParameter("teacher");//id=oneCustomer.getId();
		String condition=request.getParameter("condition");//id=oneCustomer.getId();
		String breath=request.getParameter("breath");//id=oneCustomer.getId();
		String vanda=request.getParameter("vanda");//id=oneCustomer.getId();
		String dristi=request.getParameter("dristi");//id=oneCustomer.getId();
		String ate=request.getParameter("ate");
		String event=request.getParameter("event");
		
		HttpSession session=request.getSession();
		Account loginAc=(Account)session.getAttribute("loginAc");
		String loginName=loginAc.getUserName();
		System.out.println(loginName+"*");
		
			Diary diary = new Diary();
			DiaryDao dao = new DiaryDao();
			dao.drop_diary(id,loginName);
			
			System.out.println(id+series+myName);
			
			GetDiaryDao dao1= new GetDiaryDao();
			List <Diary>diaryList1 =dao1.get_diary_1(loginName);
			request.setAttribute("diaryList1", diaryList1);	
			
			List <Diary>diaryList2 =dao1.get_diary_2(loginName);
			request.setAttribute("diaryList2", diaryList2);
	
			List <Diary>diaryList3 =dao1.get_diary_3(loginName);
			request.setAttribute("diaryList3", diaryList3);	
			
			List <Diary>diaryList4 =dao1.get_diary_4(loginName);
			request.setAttribute("diaryList4", diaryList4);	
			
			List <Diary>diaryList5 =dao1.get_diary_5(loginName);
			request.setAttribute("diaryList5", diaryList5);	
			
			List <Diary>diaryList6 =dao1.get_diary_6(loginName);
			request.setAttribute("diaryList6", diaryList6);	
			
			List <Diary>diaryList7 =dao1.get_diary_7(loginName);
			request.setAttribute("diaryList7", diaryList7);	
			
			List <Diary>diaryList8 =dao1.get_diary_8(loginName);
			request.setAttribute("diaryList8", diaryList8);	
			
			List <Diary>diaryList9 =dao1.get_diary_9(loginName);
			request.setAttribute("diaryList9", diaryList9);	
			
			List <Diary>diaryList10 =dao1.get_diary_10(loginName);
			request.setAttribute("diaryList10", diaryList10);	
			
			List <Diary>diaryList11 =dao1.get_diary_11(loginName);
			request.setAttribute("diaryList11", diaryList11);	
			
			List <Diary>diaryList12 =dao1.get_diary_12(loginName);
			request.setAttribute("diaryList12", diaryList12);	
			
			
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/dlist.jsp");
			dispatcher.forward(request, response);
			
	
	}

}
