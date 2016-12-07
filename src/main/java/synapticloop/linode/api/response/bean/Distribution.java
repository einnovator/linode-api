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

import java.util.Date;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import synapticloop.linode.api.helper.ResponseHelper;
import synapticloop.linode.exception.ApiException;

public class Distribution extends BaseLinodeBean {
	private static final Logger LOGGER = LoggerFactory.getLogger(Distribution.class);

	private boolean is64Bit = false;
	private String label = null;
	private Long minimumImageSize = null;
	private Long distributionId = null;
	private Date createDate = null;
	private boolean requiresVOpsKernel = false;

	/**
	 *       {
	 *          "IS64BIT":0,
	 *          "LABEL":"Debian 4.0",
	 *          "MINIMAGESIZE":200,
	 *          "DISTRIBUTIONID":28,
	 *          "CREATE_DT":"2007-04-18 00:00:00.0",
	 *          "REQUIRESPVOPSKERNEL":0
	 *       },
	 * 
	 * @param jsonObject the json object to extract the data from
	 * @throws ApiException if there was an error converting the date 
	 */
	public Distribution(JSONObject jsonObject) throws ApiException {
		this.is64Bit = (1 == readInt(jsonObject, IS64BIT));
		this.label = readString(jsonObject, JSON_KEY_LABEL_UPPER);
		this.distributionId = readLong(jsonObject, DISTRIBUTIONID);
		this.createDate = readDate(jsonObject, CREATE_DT);
		this.requiresVOpsKernel = (1 == readInt(jsonObject, REQUIRESPVOPSKERNEL));
		this.minimumImageSize = readLong(jsonObject, MINIMAGESIZE);

		ResponseHelper.warnOnMissedKeys(LOGGER, jsonObject);
	}

	public boolean getIs64Bit() {
		return this.is64Bit;
	}

	public String getLabel() {
		return this.label;
	}

	public Long getMinimumImageSize() {
		return this.minimumImageSize;
	}

	public Long getDistributionId() {
		return this.distributionId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public boolean getRequiresVOpsKernel() {
		return this.requiresVOpsKernel;
	}
}
