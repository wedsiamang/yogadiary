package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Diary;

public class GetDiaryDao {
		
		//データベース接続に使用する情報
		private final String JDBC_URL="jdbc:postgresql://localhost:5432/memo";
		   private final String DB_USER= "";
		   private final String DB_PASS = "";
	
		    
		    public List<Diary>get_diary_1(String loginName){
		     	
		    	 Connection conn =null;
			    	PreparedStatement st =null;
			    	ResultSet rs =null;
		    	
				try {
		         Class.forName("org.postgresql.Driver");
		     } catch (Exception e) {
		         e.printStackTrace();
		     }
				
				List<Diary>diaryList1 = new ArrayList<Diary>();
				Diary d;	
			//データベース接続
			try {
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			
		//		conn.setAutoCommit(false);
				//SELECT文の準備
				String sql=
						"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-01-01' AND '2022-01-31' ORDER BY date";
				st= conn.prepareStatement(sql);
				
				st.setString(1, loginName);
				
				//SELECT文を実行
				rs =st.executeQuery();
				
				//SELECT文の結果をARRAYLIST に格納
				while(rs.next()) {
					d= new Diary();
					d.setMyname(loginName);
					d.setId(rs.getInt("id"));
					d.setDate(rs.getString("date"));
					d.setWeather(rs.getString("weather"));
					d.setCovid19(rs.getString("covid19"));
					d.setBBT(rs.getString("BBT"));
					d.setTime(rs.getString("time"));
					d.setSeries(rs.getString("series"));
					d.setTeacher(rs.getString("teacher"));
					d.setCondition(rs.getString("condition"));
					d.setBreath(rs.getString("breath"));
					d.setVanda(rs.getString("vanda"));
					d.setDristi(rs.getString("dristi"));				
					d.setAte(rs.getString("ate"));
					d.setEvent(rs.getString("event"));
					
					diaryList1.add(d);
			//		conn.commit();
				}return diaryList1;
			}catch(SQLException e){
				e.printStackTrace();
				
				return diaryList1;
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
		 public List<Diary>get_diary_2(String loginName){
		 	
			 Connection conn =null;
		    	PreparedStatement st =null;
		    	ResultSet rs =null;
			 
				try {
		         Class.forName("org.postgresql.Driver");
		     } catch (Exception e) {
		         e.printStackTrace();
		     }
				
				List<Diary>diaryList2 = new ArrayList<Diary>();
				Diary d;	
			//データベース接続
			try {
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			
			//	conn.setAutoCommit(false);
				//SELECT文の準備
				String sql=
						"SELECT * FROM diary  WHERE  myName=? AND date BETWEEN '2022-02-01' AND '2022-02-28' ORDER BY date";
				st= conn.prepareStatement(sql);
				
				st.setString(1, loginName);
				//SELECT文を実行
				rs =st.executeQuery();
				
				//SELECT文の結果をARRAYLIST に格納
				while(rs.next()) {
					d= new Diary();
					d.setMyname(loginName);
					d.setId(rs.getInt("id"));
					d.setDate(rs.getString("date"));
					d.setWeather(rs.getString("weather"));
					d.setCovid19(rs.getString("covid19"));
					d.setBBT(rs.getString("BBT"));
					d.setTime(rs.getString("time"));
					d.setSeries(rs.getString("series"));
					d.setTeacher(rs.getString("teacher"));
					d.setCondition(rs.getString("condition"));
					d.setBreath(rs.getString("breath"));
					d.setVanda(rs.getString("vanda"));
					d.setDristi(rs.getString("dristi"));				
					d.setAte(rs.getString("ate"));
					d.setEvent(rs.getString("event"));
					diaryList2.add(d);
				}return diaryList2;
			}catch(SQLException e){
				e.printStackTrace();
				return diaryList2;
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
		    
		    
		 public List<Diary>get_diary_3(String loginName){
		    	
			 Connection conn =null;
		    	PreparedStatement st =null;
		    	ResultSet rs =null;
			 
				try {
		            Class.forName("org.postgresql.Driver");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
				
				List<Diary>diaryList3 = new ArrayList<Diary>();
				Diary d;	
			//データベース接続
			try {
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			
			//	conn.setAutoCommit(false);
				//SELECT文の準備
				String sql=
						"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-03-01' AND '2022-03-31' ORDER BY date";
				st= conn.prepareStatement(sql);
				
				st.setString(1, loginName);
				//SELECT文を実行
				rs =st.executeQuery();
				
				//SELECT文の結果をARRAYLIST に格納
				while(rs.next()) {
					d= new Diary();
					d.setMyname(loginName);
					d.setId(rs.getInt("id"));
					d.setDate(rs.getString("date"));
					d.setWeather(rs.getString("weather"));
					d.setCovid19(rs.getString("covid19"));
					d.setBBT(rs.getString("BBT"));
					d.setTime(rs.getString("time"));
					d.setSeries(rs.getString("series"));
					d.setTeacher(rs.getString("teacher"));
					d.setCondition(rs.getString("condition"));
					d.setBreath(rs.getString("breath"));
					d.setVanda(rs.getString("vanda"));
					d.setDristi(rs.getString("dristi"));				
					d.setAte(rs.getString("ate"));
					d.setEvent(rs.getString("event"));
					diaryList3.add(d);
				//	conn.commit();
					}return diaryList3;
			}catch(SQLException e){
				e.printStackTrace();
				return diaryList3;
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

		 public List<Diary>get_diary_4(String loginName){
		    	
			 Connection conn =null;
		    	PreparedStatement st =null;
		    	ResultSet rs =null;
			 
				try {
		            Class.forName("org.postgresql.Driver");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
				
				List<Diary>diaryList4 = new ArrayList<Diary>();
				Diary d;	
			//データベース接続
			try {
				conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			
		//		conn.setAutoCommit(false);
				//SELECT文の準備
				String sql=
						"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-04-01' AND '2022-04-30' ORDER BY date";
				st= conn.prepareStatement(sql);
				
				st.setString(1, loginName);
				//SELECT文を実行
				 rs =st.executeQuery();
				
				//SELECT文の結果をARRAYLIST に格納
				while(rs.next()) {
					d= new Diary();
					d.setMyname(loginName);
					d.setId(rs.getInt("id"));
					d.setDate(rs.getString("date"));
					d.setWeather(rs.getString("weather"));
					d.setCovid19(rs.getString("covid19"));
					d.setBBT(rs.getString("BBT"));
					d.setTime(rs.getString("time"));
					d.setSeries(rs.getString("series"));
					d.setTeacher(rs.getString("teacher"));
					d.setCondition(rs.getString("condition"));
					d.setBreath(rs.getString("breath"));
					d.setVanda(rs.getString("vanda"));
					d.setDristi(rs.getString("dristi"));				
					d.setAte(rs.getString("ate"));
					d.setEvent(rs.getString("event"));
					diaryList4.add(d);
			//		conn.commit();
				}return diaryList4;
			}catch(SQLException e){
				e.printStackTrace();
				return diaryList4;
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

	 public List<Diary>get_diary_5(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		List<Diary>diaryList5 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
				"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-05-01' AND '2022-05-31' ORDER BY date";
			st= conn.prepareStatement(sql);
		
			
			st.setString(1, loginName);
			//SELECT文を実行
			 rs =st.executeQuery();
		
				//SELECT文の結果をARRAYLIST に格納
				while(rs.next()) {
					d= new Diary();
					d.setMyname(loginName);
					d.setId(rs.getInt("id"));
					d.setDate(rs.getString("date"));
					d.setWeather(rs.getString("weather"));
					d.setCovid19(rs.getString("covid19"));
					d.setBBT(rs.getString("BBT"));
					d.setTime(rs.getString("time"));
					d.setSeries(rs.getString("series"));
					d.setTeacher(rs.getString("teacher"));
					d.setCondition(rs.getString("condition"));
					d.setBreath(rs.getString("breath"));
					d.setVanda(rs.getString("vanda"));
					d.setDristi(rs.getString("dristi"));				
					d.setAte(rs.getString("ate"));
					d.setEvent(rs.getString("event"));
					diaryList5.add(d);
		//			conn.commit();
				}return diaryList5;
		}catch(SQLException e){
				e.printStackTrace();
				return diaryList5;
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

	 public List<Diary>get_diary_6(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		List<Diary>diaryList6 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-06-01' AND '2022-06-30' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList6.add(d);
			//	conn.commit();
			}return diaryList6;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList6;
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
 
	 public List<Diary>get_diary_7(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Diary>diaryList7 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-07-01' AND '2022-07-31' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList7.add(d);
			//	conn.commit();
			}return diaryList7;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList7;	
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
 
	 public List<Diary>get_diary_8(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		List<Diary>diaryList8 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE  myName=? AND date BETWEEN '2022-08-01' AND '2022-08-31' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList8.add(d);
			//	conn.commit();
			}return diaryList8;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList8;
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
	 public List<Diary>get_diary_9(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		List<Diary>diaryList9 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE  myName=? AND date BETWEEN '2022-09-01' AND '2022-09-30' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList9.add(d);
		//		conn.commit();
			}return diaryList9;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList9;
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
 
	 public List<Diary>get_diary_10(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		List<Diary>diaryList10 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-10-01' AND '2022-10-31' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			 rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList10.add(d);
			//	conn.commit();
			}return diaryList10;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList10;
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
 
	 public List<Diary>get_diary_11(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();	
		}
		
		List<Diary>diaryList11 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-11-01' AND '2022-11-30' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			 rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList11.add(d);
			//	conn.commit();
			}return diaryList11;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList11;
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
 
	 public List<Diary>get_diary_12(String loginName){
 	
		 Connection conn =null;
	    	PreparedStatement st =null;
	    	ResultSet rs =null;
		 
		try {
         Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		List<Diary>diaryList12 = new ArrayList<Diary>();
		Diary d;	
		//データベース接続
		try {
			conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
		
		//	conn.setAutoCommit(false);
			//SELECT文の準備
			String sql=
					"SELECT * FROM diary  WHERE myName=? AND date BETWEEN '2022-12-01' AND '2022-12-31' ORDER BY date";
			st= conn.prepareStatement(sql);
			
			st.setString(1, loginName);
			//SELECT文を実行
			rs =st.executeQuery();
			
			//SELECT文の結果をARRAYLIST に格納
			while(rs.next()) {
				d= new Diary();
				d.setMyname(loginName);
				d.setId(rs.getInt("id"));
				d.setDate(rs.getString("date"));
				d.setWeather(rs.getString("weather"));
				d.setCovid19(rs.getString("covid19"));
				d.setBBT(rs.getString("BBT"));
				d.setTime(rs.getString("time"));
				d.setSeries(rs.getString("series"));
				d.setTeacher(rs.getString("teacher"));
				d.setCondition(rs.getString("condition"));
				d.setBreath(rs.getString("breath"));
				d.setVanda(rs.getString("vanda"));
				d.setDristi(rs.getString("dristi"));				
				d.setAte(rs.getString("ate"));
				d.setEvent(rs.getString("event"));
				diaryList12.add(d);
		//		conn.commit();
			}return diaryList12;
		}catch(SQLException e){
			e.printStackTrace();
			return diaryList12;
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