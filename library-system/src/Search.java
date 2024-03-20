package librarysystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	
//	public void search() {
//		//prompt user to search somehow? get input then call filter in this method
//		--> delete since we do not need this
//	}
	public Boolean filter() {
		//return a statement asking if user wants to use the filter /
		Scanner input = new Scanner(System.in);
		System.out.println("Use the filter? Yes or No"); 
		String in = input.nextLine(); 
		
		
		
		
		return true;
	}
//	--> can do it through Test Cases till the GUI is implemented which then this would prompt user for result through sys.out
	
	public String filterSearch(String key) {
		
		
		return null; 
	}
	public ArrayList<String> search(String key) {
		// access database
		
		if (checkStock(key)>1) {
			ArrayList<String> similarList = checkSimilar(key); 
			//return options
		}
		else return "This item is currently Not in Stock";
				
		return null; 	
	}
	
	public ArrayList<String> checkSimilar(String key){
		//words that are less than 3-5 letters different than key is considered "similar"
		
		ArrayList<String> similarItem = new ArrayList<String>;
		for (String word: Inventory) //inventory is a list in the library databse
			if(levenshteinDistance(key, word) <= 5) {
				similarItem.add(word); 
			}
		
		return null;	
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

class testSearch extends Search {
	
}

