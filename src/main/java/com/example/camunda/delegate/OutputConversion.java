package com.example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.example.camunda.domain.Status;

@Component("outputConversion")
public class OutputConversion implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Status status = (Status) execution.getVariable("AppStatus");
		status.setStatusMessage(status.getStatusMessage() + " - Output Conversion Completed");
		execution.setVariable("AppStatus", status);
	}

}
