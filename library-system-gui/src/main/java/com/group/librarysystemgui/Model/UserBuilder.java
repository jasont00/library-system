package com.group.librarysystemgui.Model;

public abstract class UserBuilder {
	protected User user;
	
	public void createNewUser() {
		user = new User("user", "usersEmail", "usersPassword");
	}
	
	public abstract void buildType()throws Exception;
	
	public abstract void buildEmail() throws Exception;
	
	public abstract void buildPassword()throws Exception;

	public User getUser() {
		return user;
	}
	
}
