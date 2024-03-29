package librarysystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//checkSimilar needs work, unsure of how to get the csv files to look for all of the avaialable books to get checkSimilar Items

public class Search {

	
	public void search() {
		//return a statement asking if user wants to use the filter /
		Scanner input = new Scanner(System.in);
		System.out.println("Use the filter? Yes or No"); 
		String in = input.nextLine(); 
		
		// if the user asks for a filter then the search is filtered by type and name and accesses the filterSearch method with the 2 parameters
		if (in.equalsIgnoreCase("yes")) {
			Scanner type = new Scanner(System.in);
			System.out.println("Enter the type of the Item (Online Item or Physical)");
			String itemType = type.nextLine();
			type.close();
			Scanner name = new Scanner(System.in);
			System.out.println("Enter the name of the item");
			String key = name.nextLine(); 
			name.close(); 
			filterSearch(key, itemType); 
		}
		
		else if (in.equalsIgnoreCase("no")) {
			Scanner name = new Scanner(System.in);
			System.out.println("Enter the name of the item");
			String key = name.nextLine(); 
			name.close(); 
			search(key); 
		}
		
		

	}
//	--> can do it through Test Cases till the GUI is implemented which then this would prompt user for result through sys.out
	
	
    public String filterSearch(String key, String itemType){

		try {
			if (Database.getDatabase().checkstock(key)> 0) {
				return key
			}
			else return null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public void search(String key) {
		
		if (Database.getDatabase().checkstock(key)>0) {
			Database.getDatabase().search(key, "search"); 
		}
		
		if (Database.getDatabase().checkstock(key)>1) {
			ArrayList<Item> similarList = checkSimilar(key); 
			//return options
		}

	}
	
	public ArrayList<Item> checkSimilar(String key){
	//words that are less than 3-5 letters different than key is considered "similar"
		ArrayList<String> similarItem = new ArrayList<String>;
		for (Item i: Database.getDatabase()).item) //items is a list in the library database
			if(levenshteinDistance(key, i.getName()) <= 5) {
				similarItem.add(i); 
			}
		return similarItem;	
		
	}
	public int levenshteinDistance(String key, String word) {
		int[][]dist = new int[word.length()+1][word.length()+1]; 
		
		for (int i =0; i<= key.length(); i++) {
			for(int j=0; j<=word.length(); j++) {
				if(i==0) {
					dist[i][j] = j;
				} 
				else if(j==0) {
					dist[i][j] = i;
				} 
				else {
					dist[i][j] = key.charAt(i-1) == word.charAt(j-1) ? dist[i-1][j-1] : 
							1+ Math.min(dist[i-1][j-1], Math.min(dist[i-1][j],  dist[i][j-1]));
				}
			}
		}
		return dist[key.length()][word.length()];
	}

	

}


