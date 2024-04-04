package com.group.librarysystemgui.Model;

class StudentBuilder extends UserBuilder {
	
	public void buildType() throws Exception{
		user.setType("student");
	}

	public void buildEmail() throws Exception {
		user.setEmail("studentsEmail");
	}

	public void buildPassword() throws Exception{
		user.setPassword("studentsPassword");
	}

}
