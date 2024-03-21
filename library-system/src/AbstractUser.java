package librarysystem;

import java.util.ArrayList;
import java.util.List;

/* AbstractUser and UserDirector is done.
 * Fix UserDecorator - look at slides
 * Requesting goes to admin, fix rentItem(see if its rentable with item.getRentable(), then rent it if it is).
 * Finish all methods in User, StudentBuilder, UserBuilder, FacultyBuilder
 * 
 */

public abstract class AbstractUsasder {
	protected User user;
	public String type;
	protected String email;
	protected String password;
	public boolean rentEligible;
	List<Item> rentedItems = new ArrayList<>();
	List<Newsletter> subscriptions = new ArrayList<>();
	List<Item> purchasedItems = new ArrayList<>();
	
	public void createNewUser() {
		user = new User(); 
	}
	
	public abstract void assemble();
	
	public abstract void buildType();
	
	public abstract void buildEmail();
	
	public abstract void buildPassword();
	
	public abstract void rentItem(Item i);
	
	public abstract void subscribe(Newsletter n);
	
	public abstract void cancel(Newsletter n);
	
	public abstract void requestItem (String s);
	
	public abstract void purchase(Item i) throws Exception;

	public User getUser() {
		return user;
	}
	
}
