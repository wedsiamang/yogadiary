package model;

import java.io.Serializable;

public class Teacher implements Serializable{
	private String myName;
	private String teacher1;
	private String teacher2;
	private String teacher3;
	private String teacher4;
	private String teacher5;
	
	public Teacher() {}
	
	public Teacher(String myName,String teacher1,String teacher2, String teacher3, String teacher4,String teacher5) {
		this.myName=myName;
		this.teacher1=teacher1;
		this.teacher2=teacher2;
		this.teacher3=teacher3;
		this.teacher4=teacher4;
		this.teacher5=teacher5;
	}
	public Teacher(String teacher1,String teacher2, String teacher3, String teacher4,String teacher5) {
	
		this.teacher1=teacher1;
		this.teacher2=teacher2;
		this.teacher3=teacher3;
		this.teacher4=teacher4;
		this.teacher5=teacher5;
	}
	public String getMyName() {return myName;}
	public void setMyName(String myName) {this.myName=myName;}
	public String getTeacher1() {return teacher1;}
	public void setTeacher1(String teacher1) {this.teacher1=teacher1;}
	public String getTeacher2() {return teacher2;}
	public void setTeacher2(String teacher2) {this.teacher2=teacher2;}
	public String getTeacher3() {return teacher3;}
	public void setTeacher3(String teacher3) {this.teacher3=teacher3;}
	public String getTeacher4() {return teacher4;}
	public void setTeacher4(String teacher4) {this.teacher4=teacher4;}
	public String getTeacher5() {return teacher5;}
	public void setTeacher5(String teacher5) {this.teacher5=teacher5;}
	
}
