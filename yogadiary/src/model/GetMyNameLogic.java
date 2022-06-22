package model;

import java.util.List;

import dao.DiaryDao;

public class GetMyNameLogic {

public List<String>getMyName(){
		
		DiaryDao dao=new DiaryDao();
		List<String>myNameList=dao.get_myName();
		return myNameList;
	}
	
}
