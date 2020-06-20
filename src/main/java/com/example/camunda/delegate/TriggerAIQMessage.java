package com.example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.example.camunda.domain.Status;

@Component("triggerAIQMessage")
public class TriggerAIQMessage implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Status status = (Status) execution.getVariable("AppStatus");
		status.setStatusMessage(status.getStatusMessage() + " - Message triggered to AIQ");
		execution.setVariable("AppStatus", status);
	}

}
