package com.example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.example.camunda.domain.Status;

@Component("inputValidation")
public class InputValidationDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Status status = (Status) execution.getVariable("AppStatus");
		status.setStatusMessage(status.getStatusMessage() + " - Input Validation Completed");
		 	execution.setVariable("AppStatus", status);
	}

}
