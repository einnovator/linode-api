package synapticloop.linode.api;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Avail api calls, this was automatically
 * generated from the linode api documentation.
 * 
 * @author synapticloop
 */

public class Avail {
	private static final String PARAM_CONSTANT_DISTRIBUTIONID = "DistributionID";
	private static final String PARAM_CONSTANT_ISXEN = "isXen";
	private static final String PARAM_CONSTANT_ISKVM = "isKVM";
	private static final String PARAM_CONSTANT_PLANID = "PlanID";
	private static final String PARAM_CONSTANT_DISTRIBUTIONVENDOR = "DistributionVendor";
	private static final String PARAM_CONSTANT_KEYWORDS = "keywords";

/**
 * Private constructor to deter instantiation
 */
private Avail() {}

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
	 *       }
	 *    ]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest datacenters() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("avail.datacenters", parameters));
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
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest distributions() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("avail.distributions", parameters));
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
	 * @param distributionID Limits the results to the specified DistributionID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest distributions(Long distributionID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		if(null != distributionID) {
			parameters.put(PARAM_CONSTANT_DISTRIBUTIONID, distributionID.toString());
		}
		return(new LinodeRequest("avail.distributions", parameters));
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
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest kernels() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("avail.kernels", parameters));
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
	 * @param isXen Show or hide Xen compatible kernels
	 * @param isKVM Show or hide KVM compatible kernels
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest kernels(Boolean isXen, Boolean isKVM) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		if(null != isXen) {
			parameters.put(PARAM_CONSTANT_ISXEN, isXen.toString());
		}
		if(null != isKVM) {
			parameters.put(PARAM_CONSTANT_ISKVM, isKVM.toString());
		}
		return(new LinodeRequest("avail.kernels", parameters));
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
	 *      "CORES": 2,
	 *      "PRICE": 20.00,
	 *      "RAM": 2048,
	 *      "XFER": 3000,
	 *      "PLANID": 2,
	 *      "LABEL": "Linode 2048",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500
	 *      },
	 *      "DISK": 48,
	 *      "HOURLY": 0.03
	 *    }, {
	 *      "CORES": 4,
	 *      "PRICE": 40.00,
	 *      "RAM": 4096,
	 *      "XFER": 4000,
	 *      "PLANID": 4,
	 *      "LABEL": "Linode 4096",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500
	 *      },
	 *      "DISK": 96,
	 *      "HOURLY": 0.06
	 *    }]
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest linodeplans() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("avail.linodeplans", parameters));
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
	 *      "CORES": 2,
	 *      "PRICE": 20.00,
	 *      "RAM": 2048,
	 *      "XFER": 3000,
	 *      "PLANID": 2,
	 *      "LABEL": "Linode 2048",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500
	 *      },
	 *      "DISK": 48,
	 *      "HOURLY": 0.03
	 *    }, {
	 *      "CORES": 4,
	 *      "PRICE": 40.00,
	 *      "RAM": 4096,
	 *      "XFER": 4000,
	 *      "PLANID": 4,
	 *      "LABEL": "Linode 4096",
	 *      "AVAIL": {
	 *          "3": 500,
	 *          "2": 500,
	 *          "7": 500,
	 *          "6": 500,
	 *          "4": 500,
	 *          "8": 500
	 *      },
	 *      "DISK": 96,
	 *      "HOURLY": 0.06
	 *    }]
	 * }
	 * </pre>
	 *
	 * @param planID Limits the list to the specified PlanID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest linodeplans(Long planID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		if(null != planID) {
			parameters.put(PARAM_CONSTANT_PLANID, planID.toString());
		}
		return(new LinodeRequest("avail.linodeplans", parameters));
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
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest nodebalancers() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("avail.nodebalancers", parameters));
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
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest stackscripts() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("avail.stackscripts", parameters));
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
	 * @param distributionID Limit the results to StackScripts that can be applied to this DistributionID
	 * @param distributionVendor Debian, Ubuntu, Fedora, etc.
	 * @param keywords Search terms
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest stackscripts(Long distributionID, String distributionVendor, String keywords) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		if(null != distributionID) {
			parameters.put(PARAM_CONSTANT_DISTRIBUTIONID, distributionID.toString());
		}
		if(null != distributionVendor) {
			parameters.put(PARAM_CONSTANT_DISTRIBUTIONVENDOR, distributionVendor.toString());
		}
		if(null != keywords) {
			parameters.put(PARAM_CONSTANT_KEYWORDS, keywords.toString());
		}
		return(new LinodeRequest("avail.stackscripts", parameters));
	}

};