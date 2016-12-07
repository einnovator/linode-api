package synapticloop.linode.api.response.bean;

/*
 * Copyright (c) 2016 Synapticloop.
 * 
 * All rights reserved.
 * 
 * This code may contain contributions from other parties which, where 
 * applicable, will be listed in the default build file for the project 
 * ~and/or~ in a file named CONTRIBUTORS.txt in the root of the project.
 * 
 * This source code and any derived binaries are covered by the terms and 
 * conditions of the Licence agreement ("the Licence").  You may not use this 
 * source code or any derived binaries except in compliance with the Licence.  
 * A copy of the Licence is available in the file named LICENSE.txt shipped with 
 * this source code or binaries.
 */

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import synapticloop.linode.api.helper.ResponseHelper;

public class Config extends BaseLinodeBean {


	private static final Logger LOGGER = LoggerFactory.getLogger(Config.class);

	private boolean helperDisableUpdateDb = false;
	private boolean rootDeviceRO = false;
	private String rootDeviceCustom = null;
	private String label = null;
	private List<Long> diskIds = new ArrayList<Long>();
	private Long linodeId = null;
	private String comments = null;
	private Long configId = null;
	private boolean helperXen = false;
	private String runLevel = null;
	private boolean helperDepMod = false;
	private Long kernelID = null;
	private Integer numRootDevice = null;
	private boolean helperLibTls = false;
	private Long ramLimit = null;

	/**
	 *       {
	 *          "helper_disableUpdateDB":1,
	 *          "RootDeviceRO":true,
	 *          "RootDeviceCustom":"",
	 *          "Label":"My configuration profile",
	 *          "DiskList":"55319,55590,,55591,55592,,,,",
	 *          "LinodeID":8098,
	 *          "Comments":"",
	 *          "ConfigID":31058,
	 *          "helper_xen":1,
	 *          "RunLevel":"default",
	 *          "helper_depmod":1,
	 *          "KernelID":85,
	 *          "RootDeviceNum":1,
	 *          "helper_libtls":false,
	 *          "RAMLimit":0
	 *       },
	 * 
	 * @param jsonObject the json object
	 */
	public Config(JSONObject jsonObject) {
		this.helperDisableUpdateDb = (1 == readInt(jsonObject, JSON_KEY_HELPER_DISABLE_UPDATE_DB));
		this.rootDeviceRO = readBoolean(jsonObject, JSON_KEY_ROOT_DEVICE_RO);
		this.rootDeviceCustom = readString(jsonObject, JSON_KEY_ROOT_DEVICE_CUSTOM);
		this.label = readString(jsonObject, JSON_KEY_LABEL);

		String[] diskIdList = readString(jsonObject, JSON_KEY_DISK_LIST, "").split(",");
		for (String diskId : diskIdList) {
			if(diskId.trim().length() != 0) {
				diskIds.add(Long.valueOf(diskId));
			}
		}

		this.linodeId = readLong(jsonObject, JSON_KEY_LINODE_ID);
		this.comments = readString(jsonObject, JSON_KEY_COMMENTS);
		this.configId = readLong(jsonObject, JSON_KEY_CONFIG_ID);
		this.helperXen = (1 == readInt(jsonObject, JSON_KEY_HELPER_XEN));
		this.runLevel = readString(jsonObject, JSON_KEY_RUN_LEVEL);
		this.helperDepMod = (1 == readInt(jsonObject, JSON_KEY_HELPER_DEPMOD));
		this.kernelID = readLong(jsonObject, JSON_KEY_KERNEL_ID);
		this.numRootDevice = readInt(jsonObject, JSON_KEY_ROOT_DEVICE_NUM);
		this.helperLibTls = (1 == readInt(jsonObject, JSON_KEY_HELPER_LIBTLS));
		this.ramLimit = jsonObject.getLong(JSON_KEY_RAM_LIMIT);

		ResponseHelper.warnOnMissedKeys(LOGGER, jsonObject);
	}

	public boolean getHelperDisableUpdateDb() {
		return this.helperDisableUpdateDb;
	}

	public boolean getRootDeviceRO() {
		return this.rootDeviceRO;
	}

	public String getRootDeviceCustom() {
		return this.rootDeviceCustom;
	}

	public String getLabel() {
		return this.label;
	}

	public List<Long> getDiskIds() {
		return this.diskIds;
	}

	public Long getLinodeId() {
		return this.linodeId;
	}

	public String getComments() {
		return this.comments;
	}

	public Long getConfigId() {
		return this.configId;
	}

	public boolean getHelperXen() {
		return this.helperXen;
	}

	public String getRunLevel() {
		return this.runLevel;
	}

	public boolean getHelperDepMod() {
		return this.helperDepMod;
	}

	public Long getKernelID() {
		return this.kernelID;
	}

	public Integer getNumRootDevice() {
		return this.numRootDevice;
	}

	public boolean getHelperLibTls() {
		return this.helperLibTls;
	}

	public Long getRamLimit() {
		return this.ramLimit;
	}
}
