package synapticloop.linode.api.response;

/*
 * Copyright (c) 2016-2017 Synapticloop.
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

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import synapticloop.linode.api.helper.ResponseHelper;
import synapticloop.linode.api.response.bean.Linode;
import synapticloop.linode.exception.ApiException;

public class LinodeListResponse extends BaseResponse {
	private static final Logger LOGGER = LoggerFactory.getLogger(LinodeListResponse.class);
	List<Linode> linodes = new ArrayList<Linode>();

	public LinodeListResponse(JSONObject jsonObject) throws ApiException {
		super(jsonObject);
		if(!hasErrors()) {
			JSONArray dataArray = jsonObject.getJSONArray(JSON_KEY_DATA);
			for (Object object : dataArray) {
				linodes.add(new Linode((JSONObject)object));
			}
		}
		jsonObject.remove(JSON_KEY_DATA);

		ResponseHelper.warnOnMissedKeys(LOGGER, jsonObject);
	}

	public List<Linode> getLinodes() {
		return this.linodes;
	}

}
