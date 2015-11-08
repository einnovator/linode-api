package synapticloop.linode;

import java.util.Map;

/**
 * Linode API request, this encapsulates the action and the parameters for the action
 * 
 * @author synapticloop
 * 
 */
public class LinodeRequest {
	private String action  = null;
	private Map<String, String> parameters = null;

	/**
	 * Create a new linode request
	 * 
	 * @param action the action to perform
	 * 
	 * @param parameters a map of parameters to pass through
	 */
	public LinodeRequest(String action, Map<String, String> parameters) {
		this.action = action;
		this.parameters = parameters;
	}

	/**
	 * Return the action of this request
	 * 
	 * @return the requested action
	 */
	public String getAction() { return this.action; }

	/**
	 * Return the parameters
	 * 
	 * @return the map of the parameters
	 */
	public Map<String, String> getParameters() { return this.parameters; }
}
