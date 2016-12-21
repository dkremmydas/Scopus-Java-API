package gr.kremmydas.scopusApi;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Entry {
	
	private String source;
	
	private String eid; private String decription; private Date coverDate;
	private String sourceType; private URL apiUrl; private String creator;
	private String keywords; private String volume; private int citedByCount;
	private String sourceSubType;private String title;private String issn;
	private String issue; private String sourceName; private String pageRange;
	private String doi; private String scopusId;
	
	
	private ArrayList<Author> authors;
	

	public Entry(String source) throws ParseException {
		super();
		this.source = source;
		this.parse();
	}
	
	public Entry(JSONObject source) throws ParseException {
		super();
		this.source = source.toString();
		this.parse();
	}
	
	


	private void parse() throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject)parser.parse(this.source);
		
		//get all fields
		
		
		//create  authors
		
		
	}

	public String getSource() {
		return source;
	}

	public String getEid() {
		return eid;
	}

	public String getDecription() {
		return decription;
	}

	public Date getCoverDate() {
		return coverDate;
	}

	public String getSourceType() {
		return sourceType;
	}

	public URL getApiUrl() {
		return apiUrl;
	}

	public String getCreator() {
		return creator;
	}

	public String getKeywords() {
		return keywords;
	}

	public String getVolume() {
		return volume;
	}

	public int getCitedByCount() {
		return citedByCount;
	}

	public String getSourceSubType() {
		return sourceSubType;
	}

	public String getTitle() {
		return title;
	}

	public String getIssn() {
		return issn;
	}

	public String getIssue() {
		return issue;
	}

	public String getSourceName() {
		return sourceName;
	}

	public String getPageRange() {
		return pageRange;
	}

	public String getDoi() {
		return doi;
	}

	public String getScopusId() {
		return scopusId;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}
	
	

}
