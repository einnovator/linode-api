package synapticloop.linode.api.response;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import synapticloop.linode.exception.ApiException;


/**
 * This is a generated test class for the Avail api calls, this was 
 * automatically generated from the linode api documentation - which can be 
 * found here:
 * <a href="http://www.linode.com/api/utility">http://www.linode.com/api/utility</a>
 * 
 * @author synapticloop
 */

public class AvailGeneratedResponseTest {

	@Test
	public void testAvailDatacenters_datacenters() throws JSONException, ApiException {

		new AvailDatacentersResponse(new JSONObject("{" + 
				"   \"ERRORARRAY\":[]," + 
				"   \"ACTION\":\"avail.datacenters\"," + 
				"   \"DATA\":[" + 
				"      {" + 
				"         \"DATACENTERID\":2," + 
				"         \"LOCATION\":\"Dallas, TX, USA\"," + 
				"         \"ABBR\":\"dallas\"" + 
				"      }," + 
				"      {" + 
				"         \"DATACENTERID\":3," + 
				"         \"LOCATION\":\"Fremont, CA, USA\"," + 
				"         \"ABBR\":\"fremont\"" + 
				"      }," + 
				"      {" + 
				"         \"DATACENTERID\":4," + 
				"         \"LOCATION\":\"Atlanta, GA, USA\"," + 
				"         \"ABBR\":\"atlanta\"" + 
				"      }," + 
				"      {" + 
				"         \"DATACENTERID\":6," + 
				"         \"LOCATION\":\"Newark, NJ, USA\"," + 
				"         \"ABBR\":\"newark\"" + 
				"      }," + 
				"      {" + 
				"         \"DATACENTERID\":7," + 
				"         \"LOCATION\":\"London, England, UK\"," + 
				"         \"ABBR\":\"london\"" + 
				"      }," + 
				"      {" + 
				"         \"DATACENTERID\":8," + 
				"         \"LOCATION\":\"Tokyo, JP\"," + 
				"         \"ABBR\":\"tokyo\"" + 
				"      }," + 
				"      {" + 
				"          \"DATACENTERID\":9," + 
				"          \"LOCATION\":\"Singapore, SG\"," + 
				"          \"ABBR\":\"singapore\"" + 
				"      }," + 
				"      {" + 
				"          \"DATACENTERID\":10," + 
				"          \"LOCATION\":\"Frankfurt, DE\"," + 
				"          \"ABBR\":\"frankfurt\"" + 
				"      }," + 
				"      {" + 
				"          \"DATACENTERID\":11," + 
				"          \"LOCATION\":\"Tokyo 2, JP\"," + 
				"          \"ABBR\":\"shinagawa1\"" + 
				"      }" + 
				"   ]" + 
				"}"));

	}


	@Test
	public void testAvailDistributions_distributions() throws JSONException, ApiException {

		new AvailDistributionsResponse(new JSONObject("{" + 
				"   \"ERRORARRAY\":[]," + 
				"   \"ACTION\":\"avail.distributions\"," + 
				"   \"DATA\":[" + 
				"      {" + 
				"         \"IS64BIT\":0," + 
				"         \"LABEL\":\"Debian 4.0\"," + 
				"         \"MINIMAGESIZE\":200," + 
				"         \"DISTRIBUTIONID\":28," + 
				"         \"CREATE_DT\":\"2007-04-18 00:00:00.0\"," + 
				"         \"REQUIRESPVOPSKERNEL\":0" + 
				"      }," + 
				"      {" + 
				"         \"IS64BIT\":0," + 
				"         \"LABEL\":\"Ubuntu 9.10\"," + 
				"         \"MINIMAGESIZE\":400," + 
				"         \"DISTRIBUTIONID\":64," + 
				"         \"CREATE_DT\":\"2009-10-31 15:11:29.0\"," + 
				"         \"REQUIRESPVOPSKERNEL\":1" + 
				"      }," + 
				"      {" + 
				"         \"IS64BIT\":1," + 
				"         \"LABEL\":\"Ubuntu 8.10 64bit\"," + 
				"         \"MINIMAGESIZE\":230," + 
				"         \"DISTRIBUTIONID\":49," + 
				"         \"CREATE_DT\":\"2008-12-02 00:00:00.0\"," + 
				"         \"REQUIRESPVOPSKERNEL\":0" + 
				"      }" + 
				"   ]" + 
				"}"));

	}


	@Test
	public void testAvailKernels_kernels() throws JSONException, ApiException {

		new AvailKernelsResponse(new JSONObject("{" + 
				"   \"ERRORARRAY\":[]," + 
				"   \"ACTION\":\"avail.kernels\"," + 
				"   \"DATA\":[" + 
				"      {" + 
				"         \"LABEL\":\"Latest Legacy (2.6.18.8-linode22)\"," + 
				"         \"ISXEN\":1," + 
				"         \"ISKVM\":0," + 
				"         \"ISPVOPS\":0," + 
				"         \"KERNELID\":60" + 
				"      }," + 
				"      {" + 
				"         \"LABEL\":\"2.6.32.16-linode28\"," + 
				"         \"ISXEN\":1," + 
				"         \"ISKVM\":0," + 
				"         \"ISPVOPS\":1," + 
				"         \"KERNELID\":123" + 
				"      }," + 
				"      {" + 
				"         \"LABEL\":\"pv-grub-x86_32\"," + 
				"         \"ISXEN\":1," + 
				"         \"ISKVM\":0," + 
				"         \"ISPVOPS\":0," + 
				"         \"KERNELID\":92" + 
				"      }," + 
				"      {" + 
				"         \"LABEL\":\"4.0.2-x86_64-linode56\"," + 
				"         \"ISKVM\":1," + 
				"         \"ISXEN\":1," + 
				"         \"ISPVOPS\":1," + 
				"         \"KERNELID\":215" + 
				"      }," + 
				"   ]" + 
				"}"));

	}


	@Test
	public void testAvailLinodePlans_linodeplans() throws JSONException, ApiException {

		new AvailLinodePlansResponse(new JSONObject("{" + 
				"   \"ERRORARRAY\":[]," + 
				"   \"ACTION\":\"avail.linodeplans\"," + 
				"   \"DATA\": [{" + 
				"     \"CORES\": 2," + 
				"     \"PRICE\": 20.00," + 
				"     \"RAM\": 2048," + 
				"     \"XFER\": 3000," + 
				"     \"PLANID\": 2," + 
				"     \"LABEL\": \"Linode 2048\"," + 
				"     \"AVAIL\": {" + 
				"         \"3\": 500," + 
				"         \"2\": 500," + 
				"         \"7\": 500," + 
				"         \"6\": 500," + 
				"         \"4\": 500," + 
				"         \"8\": 500" + 
				"     }," + 
				"     \"DISK\": 48," + 
				"     \"HOURLY\": 0.03" + 
				"   }, {" + 
				"     \"CORES\": 4," + 
				"     \"PRICE\": 40.00," + 
				"     \"RAM\": 4096," + 
				"     \"XFER\": 4000," + 
				"     \"PLANID\": 4," + 
				"     \"LABEL\": \"Linode 4096\"," + 
				"     \"AVAIL\": {" + 
				"         \"3\": 500," + 
				"         \"2\": 500," + 
				"         \"7\": 500," + 
				"         \"6\": 500," + 
				"         \"4\": 500," + 
				"         \"8\": 500" + 
				"     }," + 
				"     \"DISK\": 96," + 
				"     \"HOURLY\": 0.06" + 
				"   }]" + 
				"}"));

	}


	@Test
	public void testAvailNodeBalancers_nodebalancers() throws JSONException, ApiException {

		new AvailNodeBalancersResponse(new JSONObject("{" + 
				"    \"ERRORARRAY\": []," + 
				"    \"ACTION\": \"avail.nodebalancers\"," + 
				"    \"DATA\": [{" + 
				"        \"MONTHLY\": 20.00," + 
				"        \"HOURLY\": 0.0300," + 
				"        \"CONNECTIONS\": 10000" + 
				"    }]" + 
				"}"));

	}


	@Test
	public void testAvailStackscripts_stackscripts() throws JSONException, ApiException {

		new AvailStackscriptsResponse(new JSONObject("{" + 
				"   ERRORARRAY: [ ]," + 
				"   DATA: [" + 
				"      {" + 
				"         SCRIPT: \"#!/bin/bash" + 
				"" + 
				"         #this is the content of the first StackScript\"," + 
				"         DESCRIPTION: \"\"," + 
				"         DISTRIBUTIONIDLIST: \"77,78\"," + 
				"         LABEL: \"StackScript001\"," + 
				"         DEPLOYMENTSTOTAL: 1," + 
				"         LATESTREV: 1," + 
				"         CREATE_DT: \"2012-05-22 16:35:42.0\"," + 
				"         DEPLOYMENTSACTIVE: 1," + 
				"         STACKSCRIPTID: 1," + 
				"         REV_NOTE: \"Initial import\"," + 
				"         REV_DT: \"2012-05-22 16:35:42.0\"," + 
				"         ISPUBLIC: 1," + 
				"         USERID: 91886" + 
				"      }," + 
				"      {" + 
				"         SCRIPT: \"#!/bin/bash" + 
				"         # this is the content of the other script\"," + 
				"         DESCRIPTION: \"\"," + 
				"         DISTRIBUTIONIDLIST: \"77,78\"," + 
				"         LABEL: \"StackScript002\"," + 
				"         DEPLOYMENTSTOTAL: 0," + 
				"         LATESTREV: 2," + 
				"         CREATE_DT: \"2012-05-22 17:12:48.0\"," + 
				"         DEPLOYMENTSACTIVE: 0," + 
				"         STACKSCRIPTID: 2," + 
				"         REV_NOTE: \"Initial import\"," + 
				"         REV_DT: \"2012-05-22 17:12:48.0\"," + 
				"         ISPUBLIC: 1," + 
				"         USERID: 91886" + 
				"      }" + 
				"   ]," + 
				"   ACTION: \"avail.stackscripts\"" + 
				"}"));

	}

};