package librarysystem;

class StudentBuilder extends UserBuilder {
	
	public void buildType() {
		user.setType("student");
	}

	public void buildEmail() throws Exception {
		user.setEmail("studentsEmail");
	}

	public void buildPassword() {
		user.setPassword("studentsPassword");
	}

}
