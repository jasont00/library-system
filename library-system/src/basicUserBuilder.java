package librarysystem;


class basicUserBuilder extends UserBuilder {
	
	public void buildType() {
		user.setType("user");
	}

	public void buildEmail() {
		user.setEmail("usersEmail");
	}

	public void buildPassword() {
		user.setPassword("usersPassword");
	}
	
}
