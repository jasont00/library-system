package librarysystem;

class FacultyBuilder extends UserBuilder {

	public void buildType() {
		user.setType("faculty");
	}

	public void buildEmail() {
		user.setEmail("facultyEmail");
	}

	public void buildPassword() {
		user.setPassword("facultysPassword");
	}
	
}
