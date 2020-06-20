package com.example.camunda.domain;

import java.io.Serializable;

public class Agent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String agentId;
	private String lineOfBusiness;
	private String stateCode;

	public Agent() {
	}

	public Agent(String agentId, String lineOfBusiness, String stateCode) {
		super();
		this.agentId = agentId;
		this.lineOfBusiness = lineOfBusiness;
		this.stateCode = stateCode;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

}
