package gr.kremmydas.scopusApi;

import org.json.simple.JSONObject;

public class Author {
	
	private String source;
	
	
	public Author(String source) {
		super();
		this.source = source;
		this.parse();
	}
	
	public Author(JSONObject source) {
		super();
		this.source = source.toString();
		this.parse();
	}

	
	private void parse() {
		System.out.println(this.source);
	}

}
