package dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Teacher;

public class TeacherDao {
	
	//データベース接続に使用する情報
	private final String JDBC_URL="jdbc:postgresql://localhost:5432/memo";
   private final String DB_USER= "";
  private final String DB_PASS = "";
	
	
	
	 public void regist_teacher(String loginName,String teacher1, String teacher2, String teacher3,String teacher4,String teacher5){
			
		 Connection conn =null;
			PreparedStatement st =null;
		 
		  try {
	            Class.forName("org.postgresql.Driver");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
			String sql = "update  teacher set teacher1=?,teacher2=?,teacher3=?,teacher4=?,teacher5=? where myName=?";
			
			try{
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			
		//		conn.setAutoCommit(false);
				st = conn.prepareStatement(sql);
					
				int count=1;
				String a =("");
					if(teacher1.equals("")==false){
						st.setString(count, teacher1);
						count++;
					}
					if(teacher2.equals("")==false){
						st.setString(count, teacher2);
						count++;
					}else {
						st.setString(count,a );
						count++;
					}
					if(teacher3.equals("")==false){
						st.setString(count, teacher3);
						count++;
					}else {
						st.setString(count, a);
						count++;
					}
					if(teacher4.equals("")==false){
						st.setString(count, teacher4);
						count++;
					}else {
						st.setString(count,a);
						count++;
					}
					if(teacher5.equals("")==false){
						st.setString(count, teacher5);
						count++;
					}else {
						st.setString(count,a);
						count++;
					}
						st.setString(count, loginName);
					
					
					st.executeUpdate();
			//		conn.commit();
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
	 //アカウント新規作成時にマイネームをテーブルに登録しアカウントを紐付ける
	 public void insert_teacher(String loginName,String teacher1, String teacher2, String teacher3,String teacher4,String teacher5)throws FileNotFoundException{
			
		 Connection conn =null;
			PreparedStatement st =null;
		 
		  try {
	            Class.forName("org.postgresql.Driver");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			try{
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			
			//	conn.setAutoCommit(false);
				String sql = "INSERT INTO teacher(myName,teacher1,teacher2,teacher3,teacher4,teacher5)values(?,?,?,?,?,?)";
				
				st = conn.prepareStatement(sql);
	
					int count=1;
					String a =("");
							st.setString(count,loginName);
							count++;
							if(teacher1==null) {
								st.setString(count, a);
								count++;
								}
							if(teacher2==null) {
							st.setString(count, a);
							count++;
							}
							if(teacher3==null) {
							st.setString(count, a);
							count++;
							}
							if(teacher4==null) {
							st.setString(count, a);
							count++;
							}
							if(teacher5==null) {
							st.setString(count, a);
							}
					st.executeUpdate();
			//		conn.commit();
				
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
	 //一覧	
	 public Teacher select_teacher(String loginName){
	    	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
			try {
	            Class.forName("org.postgresql.Driver");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
			Teacher teachers=new Teacher();	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM teacher WHERE myName=?";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);			//SELECT文を実行
			rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				String myName=loginName;
				String teacher1=rs.getString("teacher1");
				String teacher2=rs.getString("teacher2");					
				String teacher3=rs.getString("teacher3");				
				String teacher4=rs.getString("teacher4");
				String teacher5=rs.getString("teacher5");
				
				teachers=new Teacher(myName,teacher1,teacher2,teacher3,teacher4,teacher5);
			//	conn.commit();
			}return teachers;
		}catch(SQLException e){
			e.printStackTrace();
			return teachers;
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
}
