package synapticloop.linode.api.response;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api-test.templar)

import java.util.Map;

import synapticloop.linode.LinodeApiRequest;
import synapticloop.linode.exception.ApiException;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import synapticloop.linode.exception.ApiException;


/**
 * This is a generated test class for the Test api calls, this was 
 * automatically generated from the linode api documentation - which can be 
 * found here:
 * <a href="http://www.linode.com/api/utility">http://www.linode.com/api/utility</a>
 * 
 * @author synapticloop
 */

public class TestGeneratedResponseTest {

	@Test
	public void testTestEcho_echo() throws JSONException, ApiException {

		new TestEchoResponse(new JSONObject("{" + 
				"   \"ERRORARRAY\":[]," + 
				"   \"ACTION\":\"test.echo\"," + 
				"   \"DATA\":{" + 
				"      \"foo\": \"bar\"" + 
				"   }" + 
				"}"));

	}

};