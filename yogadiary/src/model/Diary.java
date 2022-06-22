package model;

import java.io.Serializable;

public class Diary implements Serializable {
	
	private String myName; 
	private int id;
	private String date;
	private String weather;
	private String covid19;
	private String BBT;
	private String time;
	private String series;
	private String teacher;
	private String condition;
	private String breath;
	private String vanda;
	private String dristi;
	private String ate;
	private String event;
	
	public Diary() {}
	
	public Diary(String myName,String date,String weather,String covid19,String BBT,String time,String series,String teacher,String condition,String breath,String vanda,String dristi,String ate,String event) {
		
		this.myName=myName;
		this.date=date;
		this.weather=weather;
		this.covid19=covid19;
		this.BBT=BBT;
		this.time=time;
		this.series=series;
		this.teacher=teacher;
		this.condition=condition;
		this.breath=breath;
		this.vanda=vanda;
		this.dristi=dristi;
		this.ate=ate;
		this.event=event;
	}
	
	public Diary(String myName,int id,String date,String weather,String covid19,String BBT,String time,String series,String teacher,String condition,String breath,String vanda,String dristi,String ate,String event) {
		
		this.myName=myName;
		this.id=id;
		this.date=date;
		this.weather=weather;
		this.covid19=covid19;
		this.BBT=BBT;
		this.time=time;
		this.series=series;
		this.teacher=teacher;
		this.condition=condition;
		this.breath=breath;
		this.vanda=vanda;
		this.dristi=dristi;
		this.ate=ate;
		this.event=event;
		
	}
	
	public String getMyname() {return myName;}
	public int getId() {return id;}
	public String getDate() {return date;}
	public String getWeather() {return weather;}
	public String getCovid19() {return covid19;}
	public String getBBT() {return BBT;}
	public String getTime() {return time;}
	public String getSeries() {return series;}
	public String getTeacher() {return teacher;}
	public String getCondition() {return condition;}
	public String getBreath() {return breath;}
	public String getVanda() {return vanda;}
	public String getDristi() {return dristi;}
	public String getAte() {return ate;}
	public String getEvent() {return event;}
	
	
	public void setMyname(String myName) {this.myName=myName;}
	public void setId(int id) {this.id=id;}
	public void setDate(String date) {this.date=date;}
	public void setWeather(String weather) {this.weather=weather;}
	public void setCovid19(String covid19) {this.covid19=covid19;}
	public void setBBT(String BBT) {this.BBT=BBT;}
	public void setTime(String time) {this.time=time;}
	public void setSeries(String series) {this.series=series;}
	public void setTeacher(String teacher) {this.teacher=teacher;}
	public void setCondition(String condition) {this.condition=condition;}
	public void setBreath(String breath) {this.breath=breath;}
	public void setVanda(String vanda) {this.vanda=vanda;}
	public void setDristi(String dristi) {this.dristi=dristi;}
	public void setAte(String ate) {this.ate=ate;}
	public void setEvent(String event) {this.event=event;}
	
	
}
