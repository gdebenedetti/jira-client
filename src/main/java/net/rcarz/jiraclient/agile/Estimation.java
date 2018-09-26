package net.rcarz.jiraclient.agile;

import net.rcarz.jiraclient.JiraException;
import net.rcarz.jiraclient.RestClient;
import net.sf.json.JSONObject;

public class Estimation extends AgileResource {

	public Estimation(RestClient restclient, JSONObject json) throws JiraException {
		super(restclient, json);
		// TODO Auto-generated constructor stub
	}

}
