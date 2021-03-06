package synapticloop.linode.api.request;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeApiRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Api api calls, this was automatically
 * generated from the linode api documentation - which can be found here:
 * <a href="http://www.linode.com/api/utility">http://www.linode.com/api/utility</a>
 * 
 * @author synapticloop
 */

public class ApiRequest extends ApiBaseRequest {

	private static final String ACTION_API_SPEC = "api.spec";
	/**
	 * Private constructor to deter instantiation
	 */
	private ApiRequest() {}

	/**
	 * <p>Returns a data structure of the entire Linode API specification. This method does not 
	 * require authorization.<br><br>For example: <a target="_blank" 
	 * href="https://api.linode.com/?api_action=api.spec">https://api.linode.com/?api_action=api.spec</a></p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *  "ERRORARRAY":[],
	 *  "ACTION":"account.info",
	 *  "DATA":{
	 *   "METHODS":{
	 *    "account.info":{
	 *     "DESCRIPTION":"Shows information about your account such as
	 *      the date your account was opened as well as your network
	 *      utilization for the current month in gigabytes.",
	 *      "PARAMETERS":{},
	 *      "THROWS":""
	 *     },
	 *     "api.spec":{
	 *     "DESCRIPTION" : "Returns a data structure of the entire
	 *      Linode API specification.",
	 *      "PARAMETERS":{},
	 *      "THROWS":""
	 *    }
	 *   }
	 *  }
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest spec() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_API_SPEC, parameters));
	}

};