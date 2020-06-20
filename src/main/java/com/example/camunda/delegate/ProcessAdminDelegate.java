package com.example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.example.camunda.domain.Status;

@Component("processAdmin")
public class ProcessAdminDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String policyStatus = (String)execution.getVariable("adminMessage");
		Status status = (Status) execution.getVariable("AppStatus");
		status.setPolicyStatus(policyStatus);
		execution.setVariable("AppStatus", status);
	}
}
