package librarysystem;

class FacultyBuilder extends UserBuilder {

	public void buildType() throws Exception{
		user.setType("faculty");
	}

	public void buildEmail() throws Exception{
		user.setEmail("facultyEmail");
	}

	public void buildPassword() throws Exception{
		user.setPassword("facultysPassword");
	}
	
}
