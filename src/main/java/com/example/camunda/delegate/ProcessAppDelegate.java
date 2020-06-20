package com.example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.example.camunda.domain.Status;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component("processAIQMessage")
public class ProcessAppDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		Status status = (Status) execution.getVariable("AppStatus");
		status.setStatusMessage(status.getStatusMessage() + " - Application Completed");
		execution.setVariable("AppStatus", status);
		System.out.println(new ObjectMapper().writeValueAsString(status));
	}

}
