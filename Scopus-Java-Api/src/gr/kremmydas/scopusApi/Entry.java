package gr.kremmydas.scopusApi;

import java.util.ArrayList;
import java.util.HashMap;

public class Entry {
	
	private String source;
	
	private HashMap<String,String> properties;
	
	private ArrayList<Author> authors;
	

	public Entry(String source) {
		super();
		this.source = source;
		this.parse();
	}


	private void parse() {
		
	}

}
