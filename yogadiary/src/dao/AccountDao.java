package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Account;

public class AccountDao {
	
	//データベース接続に使用する情報
		private final String JDBC_URL="jdbc:postgresql://localhost:5432/memo";
	    private final String DB_USER= "";
	    private final String DB_PASS = "";
	    
	    //ログイン
	    public Account findByLogin(String userName,String pass) {
	    	
	    	Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
	    	
	    	Account ac=null;
	    	try {
	            Class.forName("org.postgresql.Driver");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    	
	    	try {
	    		conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
	    		//conn.setAutoCommit(false);
	    		//SELECT文の準備
	    		String sql=
	    				"SELECT * FROM account WHERE username=? AND pass = ?";
	    		st= conn.prepareStatement(sql);
	    		st.setString(1, userName);
	    		st.setString(2, pass);
	    		
	    		//SELECT文を実行
	    		rs =st.executeQuery();
	    		
	    		//一致したユーザーが存在した場合そのユーザーを表すアカウントインスタンスを生成
	    		if(rs.next()) {
	    			//結果からデータを取得
	    			int userId=rs.getInt("userId");
	    			pass=rs.getString("pass");
	    			userName=userName;
	    			
	    			ac = new Account(userId,userName,pass);
	    			//conn.commit();
	    		}
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    		
	    		return null;
	    	}finally {
	    		if(rs!=null) {
	    			try {
	    				rs.close();
	    			}catch(SQLException e) {
	    				
	    			}
	    		}
	    		if(st !=null) {
	    			try{
	    				st.close();
	    				
	    			}catch(SQLException e) {
	    			}	
	    		}
	    		if(conn !=null) {
	    			try {
	    				conn.close();
	    			
	    			}catch(SQLException e) {
	    		}
	    		}
	    	}
	    	return ac;
	    }
	    //ユーザー新規登録
	    public void insert_new_account(String userName,String pass){
			
	    	Connection conn =null;
	    	PreparedStatement st =null;
//	    	ResultSet rs=null;
//	    	
//	    	Account create=null;
			  try {
		            Class.forName("org.postgresql.Driver");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
				try{
					conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
				//	conn.setAutoCommit(false);
					String sql = "INSERT INTO account(username,pass)values(?,?)";
					
					st = conn.prepareStatement(sql);
						
						st.setString(1, userName);
						st.setString(2, pass);
						st.executeUpdate();
//						
					//	conn.commit();
				
				}catch(SQLException e) {
					System.out.println("SQLの例外が発生しました");
					e.printStackTrace();
					
				}finally {
				
		    		if(st !=null) {
		    			try{
		    				st.close();
		    				
		    			}catch(SQLException e) {
		    			}	
		    		}
		    		if(conn !=null) {
		    			try {
		    				conn.close();
		    			
		    			}catch(SQLException e) {
		    		}
		    		
		    		}
				}
		}
	    //ユーザー名一覧取得
	    public List<String>get_userName(){
	     	
	    	Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
	    	
			try {
	         Class.forName("org.postgresql.Driver");
			} catch (Exception e) {
	         e.printStackTrace();
			}
			
			List<String>userNameList = new ArrayList<String>();
			
			//データベース接続
			try {
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			//	conn.setAutoCommit(false);
				//SELECT文の準備
				String sql=
					"SELECT userName FROM account";
					st= conn.prepareStatement(sql);	
				//SELECT文を実行
					rs =st.executeQuery();
			
				//SELECT文の結果をARRAYLIST に格納
					while(rs.next()) {
				
					String userNames=rs.getString("userName");
				
					userNameList.add(userNames);
				//	conn.commit();
					}return userNameList;
			}catch(SQLException e){
				e.printStackTrace();
				return userNameList;
			}finally {
	    		if(rs!=null) {
	    			try {
	    				rs.close();
	    			}catch(SQLException e) {
	    				
	    			}
	    		}
	    		if(st !=null) {
	    			try{
	    				st.close();
	    				
	    			}catch(SQLException e) {
	    			}	
	    		}
	    		if(conn !=null) {
	    			try {
	    				conn.close();
	    			
	    			}catch(SQLException e) {
	    			
	    			}	
	    		}   
			}

	 }
}