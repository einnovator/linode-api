package synapticloop.linode.api.request;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeApiRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Avail api calls, this was automatically
 * generated from the linode api documentation - which can be found here:
 * <a href="http://www.linode.com/api/utility">http://www.linode.com/api/utility</a>
 * 
 * @author synapticloop
 */

public class AvailRequest extends ApiBaseRequest {
	private static final String PARAM_CONSTANT_DISTRIBUTIONID = "DistributionID";
	private static final String PARAM_CONSTANT_ISXEN = "isXen";
	private static final String PARAM_CONSTANT_ISKVM = "isKVM";
	private static final String PARAM_CONSTANT_PLANID = "PlanID";
	private static final String PARAM_CONSTANT_DISTRIBUTIONVENDOR = "DistributionVendor";
	private static final String PARAM_CONSTANT_KEYWORDS = "keywords";

	private static final String ACTION_AVAIL_DATACENTERS = "avail.datacenters";
	private static final String ACTION_AVAIL_DISTRIBUTIONS = "avail.distributions";
	private static final String ACTION_AVAIL_KERNELS = "avail.kernels";
	private static final String ACTION_AVAIL_LINODEPLANS = "avail.linodeplans";
	private static final String ACTION_AVAIL_NODEBALANCERS = "avail.nodebalancers";
	private static final String ACTION_AVAIL_STACKSCRIPTS = "avail.stackscripts";
	/**
	 * Private constructor to deter instantiation
	 */
	private AvailRequest() {}

	/**
	 * <p>Returns a list of Linode data center facilities.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.datacenters",
	 *    "DATA":[
	 *       {
	 *          "DATACENTERID":2,
	 *          "LOCATION":"Dallas, TX, USA",
	 *          "ABBR":"dallas"
	 *       },
	 *       {
	 *          "DATACENTERID":3,
	 *          "LOCATION":"Fremont, CA, USA",
	 *          "ABBR":"fremont"
	 *       },
	 *       {
	 *          "DATACENTERID":4,
	 *          "LOCATION":"Atlanta, GA, USA",
	 *          "ABBR":"atlanta"
	 *       },
	 *       {
	 *          "DATACENTERID":6,
	 *          "LOCATION":"Newark, NJ, USA",
	 *          "ABBR":"newark"
	 *       },
	 *       {
	 *          "DATACENTERID":7,
	 *          "LOCATION":"London, England, UK",
	 *          "ABBR":"london"
	 *       },
	 *       {
	 *          "DATACENTERID":8,
	 *          "LOCATION":"Tokyo, JP",
	 *          "ABBR":"tokyo"
	 *       },
	 *       {
	 *           "DATACENTERID":9,
	 *           "LOCATION":"Singapore, SG",
	 *           "ABBR":"singapore"
	 *       },
	 *       {
	 *           "DATACENTERID":10,
	 *           "LOCATION":"Frankfurt, DE",
	 *           "ABBR":"frankfurt"
	 *       },
	 *       {
	 *           "DATACENTERID":11,
	 *           "LOCATION":"Tokyo 2, JP",
	 *           "ABBR":"shinagawa1"
	 *       }
	 *    ]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest datacenters() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_AVAIL_DATACENTERS, parameters));
	}

	/**
	 * <p>Returns a list of available Linux Distributions.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.distributions",
	 *    "DATA":[
	 *       {
	 *          "IS64BIT":0,
	 *          "LABEL":"Debian 4.0",
	 *          "MINIMAGESIZE":200,
	 *          "DISTRIBUTIONID":28,
	 *          "CREATE_DT":"2007-04-18 00:00:00.0",
	 *          "REQUIRESPVOPSKERNEL":0
	 *       },
	 *       {
	 *          "IS64BIT":0,
	 *          "LABEL":"Ubuntu 9.10",
	 *          "MINIMAGESIZE":400,
	 *          "DISTRIBUTIONID":64,
	 *          "CREATE_DT":"2009-10-31 15:11:29.0",
	 *          "REQUIRESPVOPSKERNEL":1
	 *       },
	 *       {
	 *          "IS64BIT":1,
	 *          "LABEL":"Ubuntu 8.10 64bit",
	 *          "MINIMAGESIZE":230,
	 *          "DISTRIBUTIONID":49,
	 *          "CREATE_DT":"2008-12-02 00:00:00.0",
	 *          "REQUIRESPVOPSKERNEL":0
	 *       }
	 *    ]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest distributions() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_AVAIL_DISTRIBUTIONS, parameters));
	}

	/**
	 * <p>Returns a list of available Linux Distributions.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.distributions",
	 *    "DATA":[
	 *       {
	 *          "IS64BIT":0,
	 *          "LABEL":"Debian 4.0",
	 *          "MINIMAGESIZE":200,
	 *          "DISTRIBUTIONID":28,
	 *          "CREATE_DT":"2007-04-18 00:00:00.0",
	 *          "REQUIRESPVOPSKERNEL":0
	 *       },
	 *       {
	 *          "IS64BIT":0,
	 *          "LABEL":"Ubuntu 9.10",
	 *          "MINIMAGESIZE":400,
	 *          "DISTRIBUTIONID":64,
	 *          "CREATE_DT":"2009-10-31 15:11:29.0",
	 *          "REQUIRESPVOPSKERNEL":1
	 *       },
	 *       {
	 *          "IS64BIT":1,
	 *          "LABEL":"Ubuntu 8.10 64bit",
	 *          "MINIMAGESIZE":230,
	 *          "DISTRIBUTIONID":49,
	 *          "CREATE_DT":"2008-12-02 00:00:00.0",
	 *          "REQUIRESPVOPSKERNEL":0
	 *       }
	 *    ]
	 * }
	 * </pre>
	 *
	 * @param distributionID  <em>(OPTIONAL)</em> Limits the results to the specified DistributionID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest distributions(Long distributionID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_DISTRIBUTIONID, distributionID, true);
		return(new LinodeApiRequest(ACTION_AVAIL_DISTRIBUTIONS, parameters));
	}

	/**
	 * <p>List available kernels.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.kernels",
	 *    "DATA":[
	 *       {
	 *          "LABEL":"Latest Legacy (2.6.18.8-linode22)",
	 *          "ISXEN":1,
	 *          "ISKVM":0,
	 *          "ISPVOPS":0,
	 *          "KERNELID":60
	 *       },
	 *       {
	 *          "LABEL":"2.6.32.16-linode28",
	 *          "ISXEN":1,
	 *          "ISKVM":0,
	 *          "ISPVOPS":1,
	 *          "KERNELID":123
	 *       },
	 *       {
	 *          "LABEL":"pv-grub-x86_32",
	 *          "ISXEN":1,
	 *          "ISKVM":0,
	 *          "ISPVOPS":0,
	 *          "KERNELID":92
	 *       }
	 *       {
	 *          "LABEL":"4.0.2-x86_64-linode56",
	 *          "ISKVM":1,
	 *          "ISXen":1,
	 *          "ISPVOPS":1,
	 *          "KERNELID":215
	 *       },
	 *    ]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest kernels() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_AVAIL_KERNELS, parameters));
	}

	/**
	 * <p>List available kernels.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.kernels",
	 *    "DATA":[
	 *       {
	 *          "LABEL":"Latest Legacy (2.6.18.8-linode22)",
	 *          "ISXEN":1,
	 *          "ISKVM":0,
	 *          "ISPVOPS":0,
	 *          "KERNELID":60
	 *       },
	 *       {
	 *          "LABEL":"2.6.32.16-linode28",
	 *          "ISXEN":1,
	 *          "ISKVM":0,
	 *          "ISPVOPS":1,
	 *          "KERNELID":123
	 *       },
	 *       {
	 *          "LABEL":"pv-grub-x86_32",
	 *          "ISXEN":1,
	 *          "ISKVM":0,
	 *          "ISPVOPS":0,
	 *          "KERNELID":92
	 *       }
	 *       {
	 *          "LABEL":"4.0.2-x86_64-linode56",
	 *          "ISKVM":1,
	 *          "ISXen":1,
	 *          "ISPVOPS":1,
	 *          "KERNELID":215
	 *       },
	 *    ]
	 * }
	 * </pre>
	 *
	 * @param isXen  <em>(OPTIONAL)</em> Show or hide Xen compatible kernels
	 * @param isKVM  <em>(OPTIONAL)</em> Show or hide KVM compatible kernels
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest kernels(Boolean isXen, Boolean isKVM) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_ISXEN, isXen, true);
		addParameterSafely(parameters, PARAM_CONSTANT_ISKVM, isKVM, true);
		return(new LinodeApiRequest(ACTION_AVAIL_KERNELS, parameters));
	}

	/**
	 * <p>Returns a structure of Linode PlanIDs containing the Plan label and the availability in 
	 * each Datacenter.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.linodeplans",
	 *    "DATA": [{
	 *      "CORES": 1,
	 *      "PRICE": 5.0,
	 *      "RAM": 1024,
	 *      "XFER": 1000,
	 *      "PLANID": 1,
	 *      "LABEL": "Linode 1024",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500,
	 *          "9": 500,
	 *          "10": 500,
	 *          "11": 500
	 *      },
	 *      "DISK": 20,
	 *      "HOURLY": 0.0075
	 *    }, {
	 *      "CORES": 1,
	 *      "PRICE": 10.0,
	 *      "RAM": 2048,
	 *      "XFER": 2000,
	 *      "PLANID": 2,
	 *      "LABEL": "Linode 2048",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500,
	 *          "9": 500,
	 *          "10": 500,
	 *          "11": 500
	 *          },
	 *      "DISK": 30,
	 *      "HOURLY": 0.015
	 *    }]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest linodeplans() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_AVAIL_LINODEPLANS, parameters));
	}

	/**
	 * <p>Returns a structure of Linode PlanIDs containing the Plan label and the availability in 
	 * each Datacenter.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"avail.linodeplans",
	 *    "DATA": [{
	 *      "CORES": 1,
	 *      "PRICE": 5.0,
	 *      "RAM": 1024,
	 *      "XFER": 1000,
	 *      "PLANID": 1,
	 *      "LABEL": "Linode 1024",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500,
	 *          "9": 500,
	 *          "10": 500,
	 *          "11": 500
	 *      },
	 *      "DISK": 20,
	 *      "HOURLY": 0.0075
	 *    }, {
	 *      "CORES": 1,
	 *      "PRICE": 10.0,
	 *      "RAM": 2048,
	 *      "XFER": 2000,
	 *      "PLANID": 2,
	 *      "LABEL": "Linode 2048",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500,
	 *          "9": 500,
	 *          "10": 500,
	 *          "11": 500
	 *          },
	 *      "DISK": 30,
	 *      "HOURLY": 0.015
	 *    }]
	 * }
	 * </pre>
	 *
	 * @param planID  <em>(OPTIONAL)</em> Limits the list to the specified PlanID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest linodeplans(Long planID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_PLANID, planID, true);
		return(new LinodeApiRequest(ACTION_AVAIL_LINODEPLANS, parameters));
	}

	/**
	 * <p>Returns NodeBalancer pricing information.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *     "ERRORARRAY": [],
	 *     "ACTION": "avail.nodebalancers",
	 *     "DATA": [{
	 *         "MONTHLY": 20.00,
	 *         "HOURLY": 0.0300,
	 *         "CONNECTIONS": 10000
	 *     }]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest nodebalancers() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_AVAIL_NODEBALANCERS, parameters));
	}

	/**
	 * <p>Returns a list of available public StackScripts.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          SCRIPT: "#!/bin/bash
	 * 
	 *          #this is the content of the first StackScript",
	 *          DESCRIPTION: "",
	 *          DISTRIBUTIONIDLIST: "77,78",
	 *          LABEL: "StackScript001",
	 *          DEPLOYMENTSTOTAL: 1,
	 *          LATESTREV: 1,
	 *          CREATE_DT: "2012-05-22 16:35:42.0",
	 *          DEPLOYMENTSACTIVE: 1,
	 *          STACKSCRIPTID: 1,
	 *          REV_NOTE: "Initial import",
	 *          REV_DT: "2012-05-22 16:35:42.0",
	 *          ISPUBLIC: 1,
	 *          USERID: 91886
	 *       },
	 *       {
	 *          SCRIPT: "#!/bin/bash
	 *          # this is the content of the other script",
	 *          DESCRIPTION: "",
	 *          DISTRIBUTIONIDLIST: "77,78",
	 *          LABEL: "StackScript002",
	 *          DEPLOYMENTSTOTAL: 0,
	 *          LATESTREV: 2,
	 *          CREATE_DT: "2012-05-22 17:12:48.0",
	 *          DEPLOYMENTSACTIVE: 0,
	 *          STACKSCRIPTID: 2,
	 *          REV_NOTE: "Initial import",
	 *          REV_DT: "2012-05-22 17:12:48.0",
	 *          ISPUBLIC: 1,
	 *          USERID: 91886
	 *       }
	 *    ],
	 *    ACTION: "avail.stackscripts"
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest stackscripts() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_AVAIL_STACKSCRIPTS, parameters));
	}

	/**
	 * <p>Returns a list of available public StackScripts.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          SCRIPT: "#!/bin/bash
	 * 
	 *          #this is the content of the first StackScript",
	 *          DESCRIPTION: "",
	 *          DISTRIBUTIONIDLIST: "77,78",
	 *          LABEL: "StackScript001",
	 *          DEPLOYMENTSTOTAL: 1,
	 *          LATESTREV: 1,
	 *          CREATE_DT: "2012-05-22 16:35:42.0",
	 *          DEPLOYMENTSACTIVE: 1,
	 *          STACKSCRIPTID: 1,
	 *          REV_NOTE: "Initial import",
	 *          REV_DT: "2012-05-22 16:35:42.0",
	 *          ISPUBLIC: 1,
	 *          USERID: 91886
	 *       },
	 *       {
	 *          SCRIPT: "#!/bin/bash
	 *          # this is the content of the other script",
	 *          DESCRIPTION: "",
	 *          DISTRIBUTIONIDLIST: "77,78",
	 *          LABEL: "StackScript002",
	 *          DEPLOYMENTSTOTAL: 0,
	 *          LATESTREV: 2,
	 *          CREATE_DT: "2012-05-22 17:12:48.0",
	 *          DEPLOYMENTSACTIVE: 0,
	 *          STACKSCRIPTID: 2,
	 *          REV_NOTE: "Initial import",
	 *          REV_DT: "2012-05-22 17:12:48.0",
	 *          ISPUBLIC: 1,
	 *          USERID: 91886
	 *       }
	 *    ],
	 *    ACTION: "avail.stackscripts"
	 * }
	 * </pre>
	 *
	 * @param distributionID  <em>(OPTIONAL)</em> Limit the results to StackScripts that can be applied to this DistributionID
	 * @param distributionVendor  <em>(OPTIONAL)</em> Debian, Ubuntu, Fedora, etc.
	 * @param keywords  <em>(OPTIONAL)</em> Search terms
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest stackscripts(Long distributionID, String distributionVendor, String keywords) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_DISTRIBUTIONID, distributionID, true);
		addParameterSafely(parameters, PARAM_CONSTANT_DISTRIBUTIONVENDOR, distributionVendor, true);
		addParameterSafely(parameters, PARAM_CONSTANT_KEYWORDS, keywords, true);
		return(new LinodeApiRequest(ACTION_AVAIL_STACKSCRIPTS, parameters));
	}

};