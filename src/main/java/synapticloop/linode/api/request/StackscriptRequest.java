package synapticloop.linode.api.request;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeApiRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Stackscript api calls, this was automatically
 * generated from the linode api documentation - which can be found here:
 * <a href="http://www.linode.com/api/stackscript">http://www.linode.com/api/stackscript</a>
 * 
 * @author synapticloop
 */

public class StackscriptRequest extends ApiBaseRequest {
	private static final String PARAM_CONSTANT_LABEL = "Label";
	private static final String PARAM_CONSTANT_DESCRIPTION = "Description";
	private static final String PARAM_CONSTANT_DISTRIBUTIONIDLIST = "DistributionIDList";
	private static final String PARAM_CONSTANT_ISPUBLIC = "isPublic";
	private static final String PARAM_CONSTANT_REV_NOTE = "rev_note";
	private static final String PARAM_CONSTANT_SCRIPT = "script";
	private static final String PARAM_CONSTANT_STACKSCRIPTID = "StackScriptID";

	private static final String ACTION_STACKSCRIPT_CREATE = "stackscript.create";
	private static final String ACTION_STACKSCRIPT_DELETE = "stackscript.delete";
	private static final String ACTION_STACKSCRIPT_LIST = "stackscript.list";
	private static final String ACTION_STACKSCRIPT_UPDATE = "stackscript.update";
	/**
	 * Private constructor to deter instantiation
	 */
	private StackscriptRequest() {}

	/**
	 * <p>Create a StackScript.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       StackScriptID: 3
	 *    },
	 *    ACTION: "stackscript.create"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 * <ul>
	 *   <li>NOACCESS</li>
	 *   <li>VALIDATION</li>
	 * </ul>
	 *
	 * @param label <strong>(REQUIRED)</strong>   The Label for this StackScript
	 * @param distributionIDList <strong>(REQUIRED)</strong>   Comma delimited list of DistributionIDs that this script works on
	 * @param script <strong>(REQUIRED)</strong>   The actual script
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest create(String label, String distributionIDList, String script) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, false);
		addParameterSafely(parameters, PARAM_CONSTANT_DISTRIBUTIONIDLIST, distributionIDList, false);
		addParameterSafely(parameters, PARAM_CONSTANT_SCRIPT, script, false);
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_CREATE, parameters));
	}

	/**
	 * <p>Create a StackScript.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       StackScriptID: 3
	 *    },
	 *    ACTION: "stackscript.create"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOACCESS
	 *   - VALIDATION
	 *
	 * @param label <strong>(REQUIRED)</strong> The Label for this StackScript
	 * @param description  <em>(OPTIONAL)</em> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param distributionIDList <strong>(REQUIRED)</strong> Comma delimited list of DistributionIDs that this script works on
	 * @param isPublic  <em>(OPTIONAL)</em> Whether this StackScript is published in the Library, for everyone to use
	 * @param rev_note  <em>(OPTIONAL)</em> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param script <strong>(REQUIRED)</strong> The actual script
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest create(String label, String description, String distributionIDList, Boolean isPublic, String rev_note, String script) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, false);
		addParameterSafely(parameters, PARAM_CONSTANT_DESCRIPTION, description, true);
		addParameterSafely(parameters, PARAM_CONSTANT_DISTRIBUTIONIDLIST, distributionIDList, false);
		addParameterSafely(parameters, PARAM_CONSTANT_ISPUBLIC, isPublic, true);
		addParameterSafely(parameters, PARAM_CONSTANT_REV_NOTE, rev_note, true);
		addParameterSafely(parameters, PARAM_CONSTANT_SCRIPT, script, false);
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_CREATE, parameters));
	}

	/**
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       StackScriptID: 3
	 *    },
	 *    ACTION: "stackscript.delete"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 * <ul>
	 *   <li>NOTFOUND</li>
	 * </ul>
	 *
	 * @param stackScriptID <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest delete(Long stackScriptID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_STACKSCRIPTID, stackScriptID, false);
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_DELETE, parameters));
	}

	/**
	 * <p>Lists StackScripts you have access to.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          SCRIPT: "#!/bin/bash
	 *                   # this is the content of the first StackScript",
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
	 *                   # this is the content of the other script",
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
	 *    ACTION: "stackscript.list"
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest list() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_LIST, parameters));
	}

	/**
	 * <p>Lists StackScripts you have access to.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: [
	 *       {
	 *          SCRIPT: "#!/bin/bash
	 *                   # this is the content of the first StackScript",
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
	 *                   # this is the content of the other script",
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
	 *    ACTION: "stackscript.list"
	 * }
	 * </pre>
	 *
	 * @param stackScriptID  <em>(OPTIONAL)</em> Limits the list to the specified StackScriptID
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest list(Long stackScriptID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_STACKSCRIPTID, stackScriptID, true);
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_LIST, parameters));
	}

	/**
	 * <p>Update a StackScript.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       StackScriptID: 3718
	 *    },
	 *    ACTION: "stackscript.update"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 * <ul>
	 *   <li>NOTFOUND</li>
	 *   <li>VALIDATION</li>
	 * </ul>
	 *
	 * @param stackScriptID <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */
	public static LinodeApiRequest update(Long stackScriptID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_STACKSCRIPTID, stackScriptID, false);
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_UPDATE, parameters));
	}

	/**
	 * <p>Update a StackScript.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       StackScriptID: 3718
	 *    },
	 *    ACTION: "stackscript.update"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param stackScriptID <strong>(REQUIRED)</strong> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param label  <em>(OPTIONAL)</em> The Label for this StackScript
	 * @param description  <em>(OPTIONAL)</em> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param distributionIDList  <em>(OPTIONAL)</em> Comma delimited list of DistributionIDs that this script works on
	 * @param isPublic  <em>(OPTIONAL)</em> Whether this StackScript is published in the Library, for everyone to use
	 * @param rev_note  <em>(OPTIONAL)</em> (<strong>SORRY</strong> - there was no description provided in the documentation)
	 * @param script  <em>(OPTIONAL)</em> The actual script
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */
	public static LinodeApiRequest update(Long stackScriptID, String label, String description, String distributionIDList, Boolean isPublic, String rev_note, String script) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_STACKSCRIPTID, stackScriptID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, true);
		addParameterSafely(parameters, PARAM_CONSTANT_DESCRIPTION, description, true);
		addParameterSafely(parameters, PARAM_CONSTANT_DISTRIBUTIONIDLIST, distributionIDList, true);
		addParameterSafely(parameters, PARAM_CONSTANT_ISPUBLIC, isPublic, true);
		addParameterSafely(parameters, PARAM_CONSTANT_REV_NOTE, rev_note, true);
		addParameterSafely(parameters, PARAM_CONSTANT_SCRIPT, script, true);
		return(new LinodeApiRequest(ACTION_STACKSCRIPT_UPDATE, parameters));
	}

};