package com.example.camunda.domain;

import java.io.Serializable;

public class PolicyApplication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Customer customer;
	private Agent agent;
	private String policyType;
	private String premiumAmount;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
