package com.group.librarysystemgui.Model;

/**
 * @Author Jayznn
 */
public class User {

	private String type = "";
	private String email = "";
	private String password = "";

	public void setType(String s) {
		this.type = s;
	}

	public void setEmail(String s) {
		this.email = s;

	}

	public void setPassword(String s) {
		this.password = s;
	}

	public String getEmail(){
		return this.email;
	}

	public String getType(){
		return this.type;
	}
	
}
