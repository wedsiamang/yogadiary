package model;

import java.util.List;

import dao.AccountDao;

public class GetUserNameLogic {

	public List<String>getUserName(){
		
		AccountDao dao=new AccountDao();
		List<String>userNameList=dao.get_userName();
		return userNameList;
	}
	
}
