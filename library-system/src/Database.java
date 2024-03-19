package librarysystem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Database {
	public ArrayList<Item> items = new ArrayList<Item>();
	public String path;
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		while(reader.readRecord()){ 
			Item it = new PhysicalItem();
			//name,id,email,password
			it.setName(reader.get("name"));
			it.setId(Integer.valueOf(reader.get("id")));
			it.setType(reader.get("type"));
			it.setPrice(Double.valueOf(reader.get("price")));
			items.add(it);
		}
	}
	
	public String search(String path, String book,String func) throws Exception{
		CsvReader reader = new CsvReader(path); 
		String result = " ";
		reader.readHeaders();

		if(func.equalsIgnoreCase("search")) {
			while(reader.readRecord()){ 
				Item it = new PhysicalItem();
				//name,id,email,password
				it.setName(reader.get("name"));
				if(reader.get("name").equalsIgnoreCase("gatsby")) {
					result = "Search result: User [name=" + reader.get("name") + ", id=" + Integer.valueOf(reader.get("id")) + ", type=" + reader.get("type") + ", price=" + Double.valueOf(reader.get("price"))+"]";
					return result;
				}
			}
		}
		else if(func.equalsIgnoreCase("pay")) {
			while(reader.readRecord()){ 
				Item it = new PhysicalItem();
				//name,id,email,password
				it.setName(reader.get("name"));
				if(reader.get("name").equalsIgnoreCase("gatsby")) {
					result = (reader.get("price"));
					return result;
				}
			}
		}
		
		return "don't got it";
	}
	
	public void update(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
				//name,id,email,password
				csvOutput.write("name");
				csvOutput.write("id");
		    	csvOutput.write("type");
				csvOutput.write("price");
				csvOutput.endRecord();

				// else assume that the file already has the correct header line
				// write out a few records
				for(Item u: items){
					csvOutput.write(u.getName());
					csvOutput.write(String.valueOf(u.getId()));
					csvOutput.write(u.getType());
					csvOutput.write(String.valueOf(u.getPrice()));
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public int checkstock(String path, String name) throws IOException {
		CsvReader reader = new CsvReader(path); 
		int result=0;
		reader.readHeaders();		

			while(reader.readRecord()){ 
				Item it = new PhysicalItem();
				//name,id,email,password
				it.setName(reader.get("name"));
				if(reader.get("name").equalsIgnoreCase("gatsby")) {
					result++;
				}
			}
		
		return result;
	}
	
	public static void main(String [] args) throws Exception{
		String path = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\user.csv";
		Database maintain = new Database();
		maintain.load(path);
		for(Item u: maintain.items){
			System.out.println(u.toString());
		}
		
		Item newUser = new PhysicalItem("gatsby", "book",19.99,false);
		maintain.items.add(newUser);
		
		maintain.update(path);
		System.out.println(maintain.search(path, "gatsby","search"));
	}
}
