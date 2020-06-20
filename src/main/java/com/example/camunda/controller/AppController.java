package com.example.camunda.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.camunda.domain.Status;

@RestController
public class AppController {

	@Autowired
	private RuntimeService runtimeService;

	@GetMapping(value = "start/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> startCamunda(@PathVariable String id) {

		Map<String, Object> variables = new HashMap<>();
		variables.put("AppStatus", new Status("App Started"));
		variables.put("id", id);
		ProcessInstanceWithVariables processInstance = (ProcessInstanceWithVariables) this.runtimeService
				.startProcessInstanceByKey("Process_0mhuk6t", variables);
		Status response = processInstance.getVariables().getValue("AppStatus", Status.class);
		response.setProcessInstanceId(processInstance.getProcessInstanceId());
		response.setExecutionId(null);
		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/message/trigger/{policyStatus}/{processInstanceId}")
	public void triggerMessage(@PathVariable String policyStatus, @PathVariable String processInstanceId) {
		Map<String, Object> variables = new HashMap<>();
		variables.put("adminMessage", policyStatus);
		this.runtimeService.createMessageCorrelation("AdminMessage").processInstanceId(processInstanceId)
				.setVariables(variables).correlate();
	}
	
	@GetMapping(value = "/message/trigger/aiq/{processInstanceId}")
	public void listenAIQMessage(@PathVariable String processInstanceId) {
		Map<String, Object> variables = new HashMap<>();
		this.runtimeService.createMessageCorrelation("AIQMessage").processInstanceId(processInstanceId)
				.correlate();
	}
}
