package librarysystem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Database {
	public ArrayList<Item> items = new ArrayList<Item>();
	public ArrayList<User> users = new ArrayList<User>();
	public static int IDS =0;
	public String path;
	private static Database instance;
	
	//contructors for the singleton pattern
	private Database() {
	}
	
	public static Database getDatabase() {
		if(instance==null) {
			instance = new Database();
		}
		return instance;
	}
	
	//adding an item to the arraylist
	public void loaditem(Item item){
		item.setId(++IDS);
		items.add(item);
		
	}
	//adding an user to the arraylist
	public void loaduser(User user){
		users.add(user);
	}
	
	//Searching within the database
	//either for just searching or for getting the price of an item
	public String search(String path, String book,String func) throws Exception{
		CsvReader reader = new CsvReader(path); 
		String result = " ";
		reader.readHeaders();

		//reading through the file and creating a string message of the info of the book
		if(func.equalsIgnoreCase("search")) {
			while(reader.readRecord()){ 
				if(reader.get("name").equalsIgnoreCase(book)) {
					result = "Search result: User [name=" + reader.get("name") + ", id=" + Integer.valueOf(reader.get("id")) + ", type=" + reader.get("type") + ", price=" + Double.valueOf(reader.get("price"))+"]";
					return result;
				}
			}
		}
		//getting the price of the book and searching for it using it's name
		else if(func.equalsIgnoreCase("pay")) {
			while(reader.readRecord()){ 
				if(reader.get("name").equalsIgnoreCase(book)) {
					result = (reader.get("price"));
					return result;
				}
			}
		}
		//finding if an email is already in the database
		else if(func.equalsIgnoreCase("email")) {
			while(reader.readRecord()){ 
				if(reader.get("email").equalsIgnoreCase(book)) {
					result="false";
					return result;
				}
			}
			return "true";
		}
		
		return "don't got it";
	}
	
	public void updateitem(String path) throws Exception{
		try {		
			
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
				//this writes the headers into the file (name,id,email,password)
				csvOutput.write("name");
				csvOutput.write("id");
		    	csvOutput.write("type");
				csvOutput.write("price");
				csvOutput.write("publisher");
				csvOutput.write("rentable");

				csvOutput.endRecord();

				// else assume that the file already has the correct header line
				// write out a few records
				//going through the arraylist and writing the info to the file
				for(Item u: items){
					if(u.getClass().equals(OnlineItem.class) || u.getClass().equals(Newsletter.class)|| u.getClass().equals(Textbook.class)) {
						csvOutput.write(u.getName());
						csvOutput.write(String.valueOf(u.getId()));
						csvOutput.write(u.getType());
						csvOutput.write(String.valueOf(u.getPrice()));
						csvOutput.write((u.getPublisher()));
						csvOutput.endRecord();
					}
					else if(u.getClass().equals(PhysicalItem.class)) {
						csvOutput.write(u.getName());
						csvOutput.write(String.valueOf(u.getId()));
						csvOutput.write(u.getType());
						csvOutput.write(String.valueOf(u.getPrice()));
						csvOutput.write("N/A");
						csvOutput.write(String.valueOf(u.getRentable()));
						csvOutput.endRecord();
					}
					
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	///basically the same thing as the updateitem one
	public void updateuser(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
				//name,id,email,password
		    	csvOutput.write("type");
				csvOutput.write("email");
				csvOutput.write("password");
				csvOutput.write("rent eligible");

				csvOutput.endRecord();

				// else assume that the file already has the correct header line
				// write out a few records
				for(User u: users){
					csvOutput.write(u.getType());
					csvOutput.write(u.getEmail());
					csvOutput.write(u.getPassword());
					csvOutput.write(String.valueOf(u.getRE()));
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	//searches the csv for occurances of a book and sends back the amount of them
	public int checkstock(String path, String name) throws IOException {
		CsvReader reader = new CsvReader(path); 
		int result=0;
		reader.readHeaders();		

			while(reader.readRecord()){ 
				if(reader.get("name").equalsIgnoreCase("gatsby")) {
					result++;
				}
			}
		return result;
	}
	
}
