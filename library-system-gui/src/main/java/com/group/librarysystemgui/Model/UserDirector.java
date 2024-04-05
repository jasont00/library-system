package com.group.librarysystemgui.Model;

class UserDirector {
	private UserBuilder userBuilder;
	
	public void setUserBuilder(UserBuilder ub) {
		this.userBuilder = ub;
	}
	
	public UserBuilder getUserBuilder() {
		return this.userBuilder;
	}
	
	public User getUser() {
		return userBuilder.getUser();
	}
	
	public void createUser() throws Exception {
		userBuilder.createNewUser();
		userBuilder.buildType();
		userBuilder.buildEmail();
		userBuilder.buildPassword();
		System.out.println("Build complete");
		Database.getDatabase().loadUserData();
		Database.getDatabase().updateuser();

	}
}
