package com.example.camunda.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String statusMessage;
	private List<String> errors = new ArrayList<>();
	private String policyNumber;
	private String policyStatus;
	private String processInstanceId;
	private String executionId;
	
	public Status() {
	}
	
	public Status(String statusMessage) {
		super();
		this.statusMessage = statusMessage;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
