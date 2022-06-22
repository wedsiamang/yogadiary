package model;

import dao.AccountDao;

public class LoginLogic {
		
	
	public Account execute(String userName,String pass) {
		AccountDao dao =new AccountDao();
		Account ac =dao.findByLogin(userName,pass);
			
		if(ac != null) {
			if(ac.getPass().equals(pass)) {
				
				return ac;
			}
		}
		return null;
		
	}	
}

