package librarysystem;

public class UserDecorator extends UserBuilder{
	public UserDecorator(User u) {
		super(u);
	}
	
	@Override
	public void assemble() {
		super.assemble();
	}
}
