package model;

import java.io.Serializable;

public class Login implements Serializable {
	private int entryId;
	private String entryName;
	private String entryPass;
	
	public Login() {};
	public Login(int entryId,String entryName,String entryPass) {
		this.entryId=entryId;
		this.entryName=entryName;
		this.entryPass=entryPass;
	}
	public int getEntryId() {return entryId;}
	public void setEntryId(int entryId) {this.entryId=entryId;}
	public String getEntryName() {return entryName;}
	public void setEntryName(String entryName) {this.entryName=entryName;}
	public String getEntryPass() {return entryPass;}
	public void setEntryPass(String entryPass) {this.entryPass=entryPass;}
}
