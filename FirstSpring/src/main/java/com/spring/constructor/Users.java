package com.spring.constructor;

public class Users {
	private  String UserName;
	private int UserID;
	private Certificates certe;
	public Users(String userName, int userID, Certificates certe) {
		super();
		UserName = userName;
		UserID = userID;
		this.certe = certe;
	}
	@Override
	public String toString() {
		return "Users [UserName=" + UserName + ", UserID=" + UserID + ", certe=" + certe + "]";
	}
	

}
