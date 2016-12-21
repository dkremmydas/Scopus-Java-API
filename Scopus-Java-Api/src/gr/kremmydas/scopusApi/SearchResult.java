package gr.kremmydas.scopusApi;

import java.util.ArrayList;

public class SearchResult {
	
	private String source;
	
	private int totalResults;
	private String searchTerms;
	private ArrayList<Entry> entries;
	
	public SearchResult(String source) {
		super();
		this.source = source;
		this.parse();
	}
	
	private void parse() {
		
	}
	
	
	public String getSource() {
		return source;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public String getSearchTerms() {
		return searchTerms;
	}
	public ArrayList<Entry> getEntries() {
		return entries;
	}
	
	
	
	
	
	

}
