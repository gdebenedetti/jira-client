package net.rcarz.jiraclient.agile;

import net.rcarz.jiraclient.JiraException;
import net.rcarz.jiraclient.RestClient;
import net.sf.json.JSONObject;

public class Configuration extends AgileResource {

	private Estimation estimation;

	public Configuration(RestClient restclient, JSONObject json) throws JiraException {
		super(restclient, json);
	}

	/**
	 * Retrieves the estimation from the given board.
	 * 
	 * @param restclient
	 *            REST client instance
	 * @param id
	 *            Internal JIRA ID of the board
	 * @return a boad configuration instance
	 * @throws JiraException
	 *             when the retrieval fails
	 */
	public static Configuration get(RestClient restclient, long id) throws JiraException {
		return AgileResource.get(restclient, Configuration.class, RESOURCE_URI + "board/" + id + "/configuration");
	}

	@Override
	protected void deserialize(JSONObject json) throws JiraException {
		super.deserialize(json);
		this.estimation = getSubResource(Estimation.class, json, "estimation");
	}

	public Estimation getEstimation() {
		return estimation;
	}

	public void setEstimation(Estimation estimation) {
		this.estimation = estimation;
	}

}
