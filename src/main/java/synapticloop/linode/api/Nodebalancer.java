package synapticloop.linode.api;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Nodebalancer api calls, this was automatically
 * generated from the linode api documentation - which can be found here:
 * <a href="http://www.linode.com/api/nodebalancer">http://www.linode.com/api/nodebalancer</a>
 * 
 * @author synapticloop
 */

public class Nodebalancer extends ApiBase {
	private static final String PARAM_CONSTANT_NODEBALANCERID = "NodeBalancerID";
	private static final String PARAM_CONSTANT_PORT = "Port";
	private static final String PARAM_CONSTANT_PROTOCOL = "Protocol";
	private static final String PARAM_CONSTANT_ALGORITHM = "Algorithm";
	private static final String PARAM_CONSTANT_STICKINESS = "Stickiness";
	private static final String PARAM_CONSTANT_CHECK = "check";
	private static final String PARAM_CONSTANT_CHECK_INTERVAL = "check_interval";
	private static final String PARAM_CONSTANT_CHECK_TIMEOUT = "check_timeout";
	private static final String PARAM_CONSTANT_CHECK_ATTEMPTS = "check_attempts";
	private static final String PARAM_CONSTANT_CHECK_PATH = "check_path";
	private static final String PARAM_CONSTANT_CHECK_BODY = "check_body";
	private static final String PARAM_CONSTANT_CHECK_PASSIVE = "check_passive";
	private static final String PARAM_CONSTANT_SSL_CERT = "ssl_cert";
	private static final String PARAM_CONSTANT_SSL_KEY = "ssl_key";
	private static final String PARAM_CONSTANT_CIPHER_SUITE = "cipher_suite";
	private static final String PARAM_CONSTANT_CONFIGID = "ConfigID";
	private static final String PARAM_CONSTANT_DATACENTERID = "DatacenterID";
	private static final String PARAM_CONSTANT_LABEL = "Label";
	private static final String PARAM_CONSTANT_CLIENTCONNTHROTTLE = "ClientConnThrottle";
	private static final String PARAM_CONSTANT_ADDRESS = "Address";
	private static final String PARAM_CONSTANT_WEIGHT = "Weight";
	private static final String PARAM_CONSTANT_MODE = "Mode";
	private static final String PARAM_CONSTANT_NODEID = "NodeID";

	/**
	 * Private constructor to deter instantiation
	 */
	private Nodebalancer() {}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       ConfigID: 38
	 *    },
	 *    ACTION: "nodebalancer.config.create"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong>   The parent NodeBalancer's ID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest configcreate(Long nodeBalancerID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		return(new LinodeRequest("nodebalancer.config.create", parameters));
	}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       ConfigID: 38
	 *    },
	 *    ACTION: "nodebalancer.config.create"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong> The parent NodeBalancer's ID
	 * @param port  <em>(OPTIONAL)</em> Port to bind to on the public interfaces. 1-65534
	 * @param protocol  <em>(OPTIONAL)</em> Either 'tcp', 'http', or 'https'
	 * @param algorithm  <em>(OPTIONAL)</em> Balancing algorithm. One of 'roundrobin', 'leastconn', 'source'
	 * @param stickiness  <em>(OPTIONAL)</em> Session persistence. One of 'none', 'table', 'http_cookie'
	 * @param check  <em>(OPTIONAL)</em> Perform active health checks on the backend nodes. One of 'connection', 'http', 'http_body'
	 * @param check_interval  <em>(OPTIONAL)</em> Seconds between health check probes. 2-3600
	 * @param check_timeout  <em>(OPTIONAL)</em> Seconds to wait before considering the probe a failure. 1-30. Must be less than check_interval.
	 * @param check_attempts  <em>(OPTIONAL)</em> Number of failed probes before taking a node out of rotation. 1-30
	 * @param check_path  <em>(OPTIONAL)</em> When check=http, the path to request
	 * @param check_body  <em>(OPTIONAL)</em> When check=http, a regex to match within the first 16,384 bytes of the response body
	 * @param check_passive  <em>(OPTIONAL)</em> Enable passive checks based on observing communication with back-end nodes.
	 * @param ssl_cert  <em>(OPTIONAL)</em> SSL certificate served by the NodeBalancer when the protocol is 'https'
	 * @param ssl_key  <em>(OPTIONAL)</em> Unpassphrased private key for the SSL certificate when protocol is 'https'
	 * @param cipher_suite  <em>(OPTIONAL)</em> SSL cipher suite to enforce. One of 'recommended', 'legacy'
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest configcreate(Long nodeBalancerID, Long port, String protocol, String algorithm, String stickiness, String check, Long check_interval, String check_timeout, String check_attempts, String check_path, String check_body, Boolean check_passive, String ssl_cert, String ssl_key, String cipher_suite) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_PORT, port, true);
		addParameterSafely(parameters, PARAM_CONSTANT_PROTOCOL, protocol, true);
		addParameterSafely(parameters, PARAM_CONSTANT_ALGORITHM, algorithm, true);
		addParameterSafely(parameters, PARAM_CONSTANT_STICKINESS, stickiness, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK, check, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_INTERVAL, check_interval, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_TIMEOUT, check_timeout, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_ATTEMPTS, check_attempts, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_PATH, check_path, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_BODY, check_body, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_PASSIVE, check_passive, true);
		addParameterSafely(parameters, PARAM_CONSTANT_SSL_CERT, ssl_cert, true);
		addParameterSafely(parameters, PARAM_CONSTANT_SSL_KEY, ssl_key, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CIPHER_SUITE, cipher_suite, true);
		return(new LinodeRequest("nodebalancer.config.create", parameters));
	}

	/**
	 * <p>Deletes a NodeBalancer's Config</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       ConfigID: 38
	 *    },
	 *    ACTION: "nodebalancer.config.delete"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param configID  <strong>(REQUIRED)</strong>   The ConfigID to delete
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest configdelete(Long nodeBalancerID, Long configID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		return(new LinodeRequest("nodebalancer.config.delete", parameters));
	}

	/**
	 * <p>Returns a list of NodeBalancers this user has access or delete to, including their 
	 * properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          STICKINESS: "table",
	 *          CHECK_PATH: "/",
	 *          PORT: 80,
	 *          CHECK_BODY: "",
	 *          CHECK: "connection",
	 *          CHECK_INTERVAL: 5,
	 *          PROTOCOL: "http",
	 *          CONFIGID: 38,
	 *          ALGORITHM: "roundrobin",
	 *          CHECK_TIMEOUT: 3,
	 *          NODEBALANCERID: 714,
	 *          CHECK_ATTEMPTS: 2,
	 *          CHECK_PASSIVE: 1
	 *       },
	 *       {
	 *          STICKINESS: "table",
	 *          CHECK_PATH: "/",
	 *          PORT: 443,
	 *          CHECK_BODY: "",
	 *          CHECK: "connection",
	 *          CHECK_INTERVAL: 5,
	 *          PROTOCOL: "https",
	 *          CONFIGID: 39,
	 *          ALGORITHM: "roundrobin",
	 *          CHECK_TIMEOUT: 3,
	 *          NODEBALANCERID: 714,
	 *          CHECK_ATTEMPTS: 2,
	 *          CHECK_PASSIVE: 1,
	 *          SSL_FINGERPRINT: "00:11:22:33:44:55:66:77:88:99:AA:BB:CC:DD:EE:FF:00:11:22:33",
	 *          SSL_COMMONNAME: "www.example.com"
	 *       }
	 *    ],
	 *    ACTION: "nodebalancer.config.list"
	 * }
	 * </pre>
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest configlist(Long nodeBalancerID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		return(new LinodeRequest("nodebalancer.config.list", parameters));
	}

	/**
	 * <p>Returns a list of NodeBalancers this user has access or delete to, including their 
	 * properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          STICKINESS: "table",
	 *          CHECK_PATH: "/",
	 *          PORT: 80,
	 *          CHECK_BODY: "",
	 *          CHECK: "connection",
	 *          CHECK_INTERVAL: 5,
	 *          PROTOCOL: "http",
	 *          CONFIGID: 38,
	 *          ALGORITHM: "roundrobin",
	 *          CHECK_TIMEOUT: 3,
	 *          NODEBALANCERID: 714,
	 *          CHECK_ATTEMPTS: 2,
	 *          CHECK_PASSIVE: 1
	 *       },
	 *       {
	 *          STICKINESS: "table",
	 *          CHECK_PATH: "/",
	 *          PORT: 443,
	 *          CHECK_BODY: "",
	 *          CHECK: "connection",
	 *          CHECK_INTERVAL: 5,
	 *          PROTOCOL: "https",
	 *          CONFIGID: 39,
	 *          ALGORITHM: "roundrobin",
	 *          CHECK_TIMEOUT: 3,
	 *          NODEBALANCERID: 714,
	 *          CHECK_ATTEMPTS: 2,
	 *          CHECK_PASSIVE: 1,
	 *          SSL_FINGERPRINT: "00:11:22:33:44:55:66:77:88:99:AA:BB:CC:DD:EE:FF:00:11:22:33",
	 *          SSL_COMMONNAME: "www.example.com"
	 *       }
	 *    ],
	 *    ACTION: "nodebalancer.config.list"
	 * }
	 * </pre>
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param configID  <em>(OPTIONAL)</em> Limits the list to the specified ConfigID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest configlist(Long nodeBalancerID, Long configID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, true);
		return(new LinodeRequest("nodebalancer.config.list", parameters));
	}

	/**
	 * <p>Updates a Config's properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       ConfigID: 38
	 *    },
	 *    ACTION: "nodebalancer.config.update"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param configID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest configupdate(Long configID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		return(new LinodeRequest("nodebalancer.config.update", parameters));
	}

	/**
	 * <p>Updates a Config's properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       ConfigID: 38
	 *    },
	 *    ACTION: "nodebalancer.config.update"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param configID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param port  <em>(OPTIONAL)</em> Port to bind to on the public interfaces. 1-65534
	 * @param protocol  <em>(OPTIONAL)</em> Either 'tcp', 'http', or 'https'
	 * @param algorithm  <em>(OPTIONAL)</em> Balancing algorithm. One of 'roundrobin', 'leastconn', 'source'
	 * @param stickiness  <em>(OPTIONAL)</em> Session persistence. One of 'none', 'table', 'http_cookie'
	 * @param check  <em>(OPTIONAL)</em> Perform active health checks on the backend nodes. One of 'connection', 'http', 'http_body'
	 * @param check_interval  <em>(OPTIONAL)</em> Seconds between health check probes. 2-3600
	 * @param check_timeout  <em>(OPTIONAL)</em> Seconds to wait before considering the probe a failure. 1-30. Must be less than check_interval.
	 * @param check_attempts  <em>(OPTIONAL)</em> Number of failed probes before taking a node out of rotation. 1-30
	 * @param check_path  <em>(OPTIONAL)</em> When check=http, the path to request
	 * @param check_body  <em>(OPTIONAL)</em> When check=http, a regex to match within the first 16,384 bytes of the response body
	 * @param check_passive  <em>(OPTIONAL)</em> Enable passive checks based on observing communication with back-end nodes.
	 * @param ssl_cert  <em>(OPTIONAL)</em> SSL certificate served by the NodeBalancer when the protocol is 'https'
	 * @param ssl_key  <em>(OPTIONAL)</em> Unpassphrased private key for the SSL certificate when protocol is 'https'
	 * @param cipher_suite  <em>(OPTIONAL)</em> SSL cipher suite to enforce. One of 'recommended', 'legacy'
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest configupdate(Long configID, Long port, String protocol, String algorithm, String stickiness, String check, Long check_interval, String check_timeout, String check_attempts, String check_path, String check_body, Boolean check_passive, String ssl_cert, String ssl_key, String cipher_suite) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_PORT, port, true);
		addParameterSafely(parameters, PARAM_CONSTANT_PROTOCOL, protocol, true);
		addParameterSafely(parameters, PARAM_CONSTANT_ALGORITHM, algorithm, true);
		addParameterSafely(parameters, PARAM_CONSTANT_STICKINESS, stickiness, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK, check, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_INTERVAL, check_interval, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_TIMEOUT, check_timeout, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_ATTEMPTS, check_attempts, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_PATH, check_path, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_BODY, check_body, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CHECK_PASSIVE, check_passive, true);
		addParameterSafely(parameters, PARAM_CONSTANT_SSL_CERT, ssl_cert, true);
		addParameterSafely(parameters, PARAM_CONSTANT_SSL_KEY, ssl_key, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CIPHER_SUITE, cipher_suite, true);
		return(new LinodeRequest("nodebalancer.config.update", parameters));
	}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.create",
	 *    "DATA":[
	 *       {
	 *          "NodeBalancerID":75
	 *       }
	 *    ]
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - CCFAILED
	 *   - VALIDATION
	 *
	 * @param datacenterID  <strong>(REQUIRED)</strong>   The DatacenterID from avail.datacenters() where you wish to place this new NodeBalancer
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest create(Long datacenterID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_DATACENTERID, datacenterID, false);
		return(new LinodeRequest("nodebalancer.create", parameters));
	}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.create",
	 *    "DATA":[
	 *       {
	 *          "NodeBalancerID":75
	 *       }
	 *    ]
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - CCFAILED
	 *   - VALIDATION
	 *
	 * @param datacenterID  <strong>(REQUIRED)</strong> The DatacenterID from avail.datacenters() where you wish to place this new NodeBalancer
	 * @param label  <em>(OPTIONAL)</em> This NodeBalancer's label
	 * @param clientConnThrottle  <em>(OPTIONAL)</em> To help mitigate abuse, throttle connections per second, per client IP. 0 to disable. Max of 20.
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest create(Long datacenterID, String label, Long clientConnThrottle) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_DATACENTERID, datacenterID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CLIENTCONNTHROTTLE, clientConnThrottle, true);
		return(new LinodeRequest("nodebalancer.create", parameters));
	}

	/**
	 * <p>Immediately removes a NodeBalancer from your account and issues a pro-rated credit back to 
	 * your account, if applicable.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.delete",
	 *    "DATA":[
	 *       {
	 *          "NodeBalancerID":75
	 *       }
	 *    ]
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong>   The NodeBalancerID to delete
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest delete(Long nodeBalancerID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		return(new LinodeRequest("nodebalancer.delete", parameters));
	}

	/**
	 * <p>Returns a list of NodeBalancers this user has access or delete to, including their 
	 * properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.list",
	 *    "DATA":[
	 *       {
	 *          "NODEBALANCERID":53,
	 *          "LABEL":"awesomebal",
	 *          "DATACENTERID":6,
	 *          "HOSTNAME":"nb-69-164-223-4.newark.nodebalancer.linode.com",
	 *          "ADDRESS4":"69.164.223.4",
	 *          "ADDRESS6":"2600:3c03:1::45a4:df04",
	 *          "CLIENTCONNTHROTTLE":4203
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
	public static LinodeRequest list() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("nodebalancer.list", parameters));
	}

	/**
	 * <p>Returns a list of NodeBalancers this user has access or delete to, including their 
	 * properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.list",
	 *    "DATA":[
	 *       {
	 *          "NODEBALANCERID":53,
	 *          "LABEL":"awesomebal",
	 *          "DATACENTERID":6,
	 *          "HOSTNAME":"nb-69-164-223-4.newark.nodebalancer.linode.com",
	 *          "ADDRESS4":"69.164.223.4",
	 *          "ADDRESS6":"2600:3c03:1::45a4:df04",
	 *          "CLIENTCONNTHROTTLE":4203
	 *       }
	 *    ]
	 * }
	 * </pre>
	 *
	 * @param nodeBalancerID  <em>(OPTIONAL)</em> Limits the list to the specified NodeBalancerID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest list(Long nodeBalancerID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, true);
		return(new LinodeRequest("nodebalancer.list", parameters));
	}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       NodeID: 47
	 *    },
	 *    ACTION: "nodebalancer.node.create"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param configID  <strong>(REQUIRED)</strong>   The parent ConfigID to attach this Node to
	 * @param label  <strong>(REQUIRED)</strong>   This backend Node's label
	 * @param address  <strong>(REQUIRED)</strong>   The address:port combination used to communicate with this Node
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest nodecreate(Long configID, String label, String address) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, false);
		addParameterSafely(parameters, PARAM_CONSTANT_ADDRESS, address, false);
		return(new LinodeRequest("nodebalancer.node.create", parameters));
	}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       NodeID: 47
	 *    },
	 *    ACTION: "nodebalancer.node.create"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param configID  <strong>(REQUIRED)</strong> The parent ConfigID to attach this Node to
	 * @param label  <strong>(REQUIRED)</strong> This backend Node's label
	 * @param address  <strong>(REQUIRED)</strong> The address:port combination used to communicate with this Node
	 * @param weight  <em>(OPTIONAL)</em> Load balancing weight, 1-255. Higher means more connections.
	 * @param mode  <em>(OPTIONAL)</em> The connections mode for this node. One of 'accept', 'reject', or 'drain'
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest nodecreate(Long configID, String label, String address, Long weight, String mode) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, false);
		addParameterSafely(parameters, PARAM_CONSTANT_ADDRESS, address, false);
		addParameterSafely(parameters, PARAM_CONSTANT_WEIGHT, weight, true);
		addParameterSafely(parameters, PARAM_CONSTANT_MODE, mode, true);
		return(new LinodeRequest("nodebalancer.node.create", parameters));
	}

	/**
	 * <p>Deletes a Node from a NodeBalancer Config</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       NodeID: 47
	 *    },
	 *    ACTION: "nodebalancer.node.delete"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *
	 * @param nodeID  <strong>(REQUIRED)</strong>   The NodeID to delete
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest nodedelete(Long nodeID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEID, nodeID, false);
		return(new LinodeRequest("nodebalancer.node.delete", parameters));
	}

	/**
	 * <p>Returns a list of Nodes associated with a NodeBalancer Config</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          WEIGHT: 100,
	 *          ADDRESS: "192.168.42.42:80",
	 *          LABEL: "Node001",
	 *          NODEID: 47,
	 *          MODE: "accept",
	 *          CONFIGID: 39,
	 *          STATUS: "Unknown",
	 *          NODEBALANCERID: 714
	 *       }
	 *    ],
	 *    ACTION: "nodebalancer.node.List"
	 * }
	 * </pre>
	 *
	 * @param configID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest nodelist(Long configID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		return(new LinodeRequest("nodebalancer.node.list", parameters));
	}

	/**
	 * <p>Returns a list of Nodes associated with a NodeBalancer Config</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          WEIGHT: 100,
	 *          ADDRESS: "192.168.42.42:80",
	 *          LABEL: "Node001",
	 *          NODEID: 47,
	 *          MODE: "accept",
	 *          CONFIGID: 39,
	 *          STATUS: "Unknown",
	 *          NODEBALANCERID: 714
	 *       }
	 *    ],
	 *    ACTION: "nodebalancer.node.List"
	 * }
	 * </pre>
	 *
	 * @param configID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param nodeID  <em>(OPTIONAL)</em> Limits the list to the specified NodeID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest nodelist(Long configID, Long nodeID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_CONFIGID, configID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_NODEID, nodeID, true);
		return(new LinodeRequest("nodebalancer.node.list", parameters));
	}

	/**
	 * <p>Updates a Node's properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       NodeID: 47
	 *    },
	 *    ACTION: "nodebalancer.node.update"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param nodeID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest nodeupdate(Long nodeID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEID, nodeID, false);
		return(new LinodeRequest("nodebalancer.node.update", parameters));
	}

	/**
	 * <p>Updates a Node's properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       NodeID: 47
	 *    },
	 *    ACTION: "nodebalancer.node.update"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param nodeID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param label  <em>(OPTIONAL)</em> This backend Node's label
	 * @param address  <em>(OPTIONAL)</em> The address:port combination used to communicate with this Node
	 * @param weight  <em>(OPTIONAL)</em> Load balancing weight, 1-255. Higher means more connections.
	 * @param mode  <em>(OPTIONAL)</em> The connections mode for this node. One of 'accept', 'reject', or 'drain'
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest nodeupdate(Long nodeID, String label, String address, Long weight, String mode) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEID, nodeID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, true);
		addParameterSafely(parameters, PARAM_CONSTANT_ADDRESS, address, true);
		addParameterSafely(parameters, PARAM_CONSTANT_WEIGHT, weight, true);
		addParameterSafely(parameters, PARAM_CONSTANT_MODE, mode, true);
		return(new LinodeRequest("nodebalancer.node.update", parameters));
	}

	/**
	 * <p>Updates a NodeBalancer's properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.update",
	 *    "DATA":[
	 *       {
	 *          "NodeBalancerID":75
	 *       }
	 *    ]
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeRequest update(Long nodeBalancerID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		return(new LinodeRequest("nodebalancer.update", parameters));
	}

	/**
	 * <p>Updates a NodeBalancer's properties</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"nodebalancer.update",
	 *    "DATA":[
	 *       {
	 *          "NodeBalancerID":75
	 *       }
	 *    ]
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param nodeBalancerID  <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param label  <em>(OPTIONAL)</em> This NodeBalancer's label
	 * @param clientConnThrottle  <em>(OPTIONAL)</em> To help mitigate abuse, throttle connections per second, per client IP. 0 to disable. Max of 20.
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeRequest update(Long nodeBalancerID, String label, Long clientConnThrottle) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_NODEBALANCERID, nodeBalancerID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, true);
		addParameterSafely(parameters, PARAM_CONSTANT_CLIENTCONNTHROTTLE, clientConnThrottle, true);
		return(new LinodeRequest("nodebalancer.update", parameters));
	}

};