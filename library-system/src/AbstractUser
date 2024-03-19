import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUser {
	protected User user;
	public String type;
	protected String email;
	protected String password;
	public boolean rentEligible;
	List<Item> rentedItems = new ArrayList<>();
	List<Newsletter> subscriptions = new ArrayList<>();
	
	public abstract void buildType();
	
	public abstract void buildEmail();	
	
	public abstract void buildPassword();
	
	public abstract void rentItem(Item i);
	
	public abstract void subscribe(Newsletter n);
	
	public abstract void cancel(Newsletter n);
	
	public abstract void requestItem (String s);
	
	public abstract void purchase(Item i);

	public User getUser() {
		return user;
	}
}
