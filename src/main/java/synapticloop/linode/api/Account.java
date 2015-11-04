package synapticloop.linode.api;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeRequest;
import synapticloop.linode.exception.ApiException;

public class Account {
	private static final String PARAM_CONSTANT_MODE = "mode";
	private static final String PARAM_CONSTANT_PAYMENTTERM = "PaymentTerm";
	private static final String PARAM_CONSTANT_PLANID = "PlanID";
	private static final String PARAM_CONSTANT_LINODEID = "LinodeID";

	/**
	 * <p>Estimates the invoice for adding a new Linode or NodeBalancer as well as resizing a Linode. 
	 * This returns two fields: PRICE which is the estimated cost of the invoice, and INVOICE_TO which is 
	 * the date invoice would be though with timezone set to America/New_York</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       INVOICE_TO: "2013-09-30 23:59:59",
	 *       PRICE: 22.31
	 *    },
	 *    ACTION: "account.estimateinvoice"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - VALIDATION
	 *
	 * @param mode This is one of the following options: 'linode_new', 'linode_resize', or 'nodebalancer_new'.
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest estimateinvoice(String mode) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		if(null != mode) {
			parameters.put(PARAM_CONSTANT_MODE, mode.toString());
		} else {
			throw new ApiException("Parameter 'mode' is required and cannot be null.");
		}
		return(new LinodeRequest("account.estimateinvoice", parameters));
	}

	/**
	 * <p>Estimates the invoice for adding a new Linode or NodeBalancer as well as resizing a Linode. 
	 * This returns two fields: PRICE which is the estimated cost of the invoice, and INVOICE_TO which is 
	 * the date invoice would be though with timezone set to America/New_York</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    ERRORARRAY: [ ],
	 *    DATA: {
	 *       INVOICE_TO: "2013-09-30 23:59:59",
	 *       PRICE: 22.31
	 *    },
	 *    ACTION: "account.estimateinvoice"
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - VALIDATION
	 *
	 * @param mode This is one of the following options: 'linode_new', 'linode_resize', or 'nodebalancer_new'.
	 * @param paymentTerm Subscription term in months. One of: 1, 12, or 24. This is required for modes 'linode_new' and 'nodebalancer_new'.
	 * @param planID The desired PlanID available from avail.LinodePlans(). This is required for modes 'linode_new' and 'linode_resize'.
	 * @param linodeID This is the LinodeID you want to resize and is required for mode 'linode_resize'.
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest estimateinvoice(String mode, Long paymentTerm, Long planID, Long linodeID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		if(null != mode) {
			parameters.put(PARAM_CONSTANT_MODE, mode.toString());
		} else {
			throw new ApiException("Parameter 'mode' is required and cannot be null.");
		}
		if(null != paymentTerm) {
			parameters.put(PARAM_CONSTANT_PAYMENTTERM, paymentTerm.toString());
		}
		if(null != planID) {
			parameters.put(PARAM_CONSTANT_PLANID, planID.toString());
		}
		if(null != linodeID) {
			parameters.put(PARAM_CONSTANT_LINODEID, linodeID.toString());
		}
		return(new LinodeRequest("account.estimateinvoice", parameters));
	}

	/**
	 * <p>Shows information about your account such as the date your account was opened as well as your 
	 * network utilization for the current month in gigabytes.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *    "ERRORARRAY":[],
	 *    "ACTION":"account.info",
	 *    "DATA":[
	 *       {
	 *          "ACTIVE_SINCE":"2011-09-23 15:08:13.0",
	 *          "TRANSFER_POOL":200,
	 *          "TRANSFER_USED":150,
	 *          "TRANSFER_BILLABLE":0,
	 *          "MANAGED":true,
	 *          "BALANCE":20
	 *       }
	 * }
	 * </pre>
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null
	 */

	public static LinodeRequest info() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("account.info", parameters));
	}

};