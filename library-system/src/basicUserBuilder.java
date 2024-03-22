package librarysystem;


class basicUserBuilder extends UserBuilder {
	
	public void buildType() throws Exception{
		user.setType("user");
	}

	public void buildEmail() throws Exception{
		user.setEmail("usersEmail");
	}

	public void buildPassword() throws Exception{
		user.setPassword("usersPassword");
	}
	
}
