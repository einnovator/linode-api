package synapticloop.linode.api;

// - - - - thoughtfully generated by synapticloop linode-api - - - - 
//     with the use of synapticloop templar templating language
//               (java-create-api.templar)

import java.util.HashMap;
import java.util.Map;

import synapticloop.linode.LinodeRequest;
import synapticloop.linode.exception.ApiException;

/**
 * This is the interaction class for the Image api calls, this was automatically
 * generated from the linode api documentation - which can be found here:
 * <a href="http://www.linode.com/api/image/image.delete">http://www.linode.com/api/image/image.delete</a>
 * 
 * @author synapticloop
 */

public class Image extends ApiBase {
	private static final String PARAM_CONSTANT_IMAGEID = "ImageID";
	private static final String PARAM_CONSTANT_PENDING = "pending";
	private static final String PARAM_CONSTANT_LABEL = "label";
	private static final String PARAM_CONSTANT_DESCRIPTION = "description";

/**
 * Private constructor to deter instantiation
 */
	private Image() {}

	/**
	 * <p>Deletes a gold-master image</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *     "ACTION": "image.delete",
	 *     "DATA": [
	 *         {
	 *             "CREATE_DT": "2014-10-08 09:39:07.0",
	 *             "CREATOR": "",
	 *             "DESCRIPTION": "",
	 *             "FS_TYPE": "ext4",
	 *             "IMAGEID": 42490,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "linode675085 - Arch Linux 2014.10 Disk Image",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 641,
	 *             "STATUS": "deleted",
	 *             "TYPE": "automatic"
	 *         }
	 *     ],
	 *     "ERRORARRAY": []
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *
	 * @param imageID   The ID of the gold-master image to delete
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */

	public static LinodeRequest delete(Long imageID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_IMAGEID, imageID, false);
		return(new LinodeRequest("image.delete", parameters));
	}

	/**
	 * <p>Lists available gold-master images</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *     "ACTION": "image.list",
	 *     "DATA": [
	 *         {
	 *             "CREATE_DT": "2014-07-30 13:15:16.0",
	 *             "CREATOR": "kbar",
	 *             "DESCRIPTION": "",
	 *             "FS_TYPE": "ext3",
	 *             "IMAGEID": 258,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "test-disk",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 9783,
	 *             "STATUS": "available",
	 *             "TYPE": "manual"
	 *         },
	 *         {
	 *             "CREATE_DT": "2014-08-27 23:06:56.0",
	 *             "CREATOR": "",
	 *             "DESCRIPTION": "",
	 *             "FS_TYPE": "ext4",
	 *             "IMAGEID": 3729,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "test - [620092] Arch Linux 2014.04 Disk Image",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 686,
	 *             "STATUS": "available",
	 *             "TYPE": "automatic"
	 *         }
	 *     ],
	 *     "ERRORARRAY": []
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */

	public static LinodeRequest list() throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		return(new LinodeRequest("image.list", parameters));
	}

	/**
	 * <p>Lists available gold-master images</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *     "ACTION": "image.list",
	 *     "DATA": [
	 *         {
	 *             "CREATE_DT": "2014-07-30 13:15:16.0",
	 *             "CREATOR": "kbar",
	 *             "DESCRIPTION": "",
	 *             "FS_TYPE": "ext3",
	 *             "IMAGEID": 258,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "test-disk",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 9783,
	 *             "STATUS": "available",
	 *             "TYPE": "manual"
	 *         },
	 *         {
	 *             "CREATE_DT": "2014-08-27 23:06:56.0",
	 *             "CREATOR": "",
	 *             "DESCRIPTION": "",
	 *             "FS_TYPE": "ext4",
	 *             "IMAGEID": 3729,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "test - [620092] Arch Linux 2014.04 Disk Image",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 686,
	 *             "STATUS": "available",
	 *             "TYPE": "automatic"
	 *         }
	 *     ],
	 *     "ERRORARRAY": []
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *
	 * @param pending Show images currently being created.
	 * @param imageID Request information for a specific gold-master image
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */

	public static LinodeRequest list(Long pending, Long imageID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_PENDING, pending, true);
		addParameterSafely(parameters, PARAM_CONSTANT_IMAGEID, imageID, true);
		return(new LinodeRequest("image.list", parameters));
	}

	/**
	 * <p>Update an Image record.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *     "ACTION": "image.update",
	 *     "DATA": [
	 *         {
	 *             "CREATE_DT": "2014-10-08 09:39:07.0",
	 *             "CREATOR": "",
	 *             "DESCRIPTION": "new description",
	 *             "FS_TYPE": "ext4",
	 *             "IMAGEID": 42490,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "linode123123 - Arch Linux 2014.10 Disk Image",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 641,
	 *             "STATUS": "available",
	 *             "TYPE": "manual"
	 *         }
	 *     ],
	 *     "ERRORARRAY": []
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param imageID   The ID of the Image to modify.
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there was an error with the call
	 */

	public static LinodeRequest update(Long imageID) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_IMAGEID, imageID, false);
		return(new LinodeRequest("image.update", parameters));
	}

	/**
	 * <p>Update an Image record.</p> 
	 * 
	 * Example response:
	 * 
	 * <pre>
	 * {
	 *     "ACTION": "image.update",
	 *     "DATA": [
	 *         {
	 *             "CREATE_DT": "2014-10-08 09:39:07.0",
	 *             "CREATOR": "",
	 *             "DESCRIPTION": "new description",
	 *             "FS_TYPE": "ext4",
	 *             "IMAGEID": 42490,
	 *             "ISPUBLIC": 0,
	 *             "LABEL": "linode123123 - Arch Linux 2014.10 Disk Image",
	 *             "LAST_USED_DT": "",
	 *             "MINSIZE": 641,
	 *             "STATUS": "available",
	 *             "TYPE": "manual"
	 *         }
	 *     ],
	 *     "ERRORARRAY": []
	 * }
	 * </pre>
	 * 
	 * Possible return error codes:
	 * 
	 *   - NOTFOUND
	 *   - VALIDATION
	 *
	 * @param imageID The ID of the Image to modify.
	 * @param label The label of the Image.
	 * @param description An optional description of the Image.
	 *
	 * @return the linode request object
	 *
	 * @throws ApiException if a required parameter is null, or there is an error with the call
	 */

	public static LinodeRequest update(Long imageID, String label, String description) throws ApiException {
		Map<String, String> parameters = new HashMap<String, String>();
		addParameterSafely(parameters, PARAM_CONSTANT_IMAGEID, imageID, false);
		addParameterSafely(parameters, PARAM_CONSTANT_LABEL, label, true);
		addParameterSafely(parameters, PARAM_CONSTANT_DESCRIPTION, description, true);
		return(new LinodeRequest("image.update", parameters));
	}

};