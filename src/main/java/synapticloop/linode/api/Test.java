package synapticloop.linode.api;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Test api calls, this was automatically
 * generated from the linode api documentation - which can be found here:
 * <a href="http://www.linode.com/api/utility/test.echo">http://www.linode.com/api/utility/test.echo</a>
 * 
 * @author synapticloop
 */

public class Test extends ApiBase {

	/**
	 * Private constructor to deter instantiation
	 */
	private Test() {}

	/**
	 * <p>Echos back parameters that were passed in.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"test.echo",
	 *    "DATA":{
	 *       "foo": "bar"
	 *    }
	 * }
	 * </pre>
	 *
	 * @param parameters the map of parameters (String:String) to echo back
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest echo(Map<String, String> parameters) throws ApiException {
		return(new LinodeRequest("test.echo", parameters));
	}

};