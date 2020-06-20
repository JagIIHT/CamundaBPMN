package com.example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.example.camunda.domain.Status;

@Component("nbo")
public class NewBusinessOrchestration implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Status status = (Status) execution.getVariable("AppStatus");
		String id = (String) execution.getVariable("idop");
		if (id.equals("111")) {
			status.getErrors().add("Error in NBO");
			status.setStatusMessage(status.getStatusMessage() + " - Submission sent to Admin system and policy Placed");
		} else {
			status.setStatusMessage(status.getStatusMessage() + " - Submission sent to Admin system and policy Issued");
		}
		execution.setVariable("AppStatus", status);
	}

}
