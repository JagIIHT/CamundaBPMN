package com.example.camunda.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.camunda.bpm.engine.rest.impl.CamundaRestResources;
import org.springframework.context.annotation.Configuration;

import com.example.camunda.CamundaResourceConfig;

@ApplicationPath("/")
@Configuration
public class CamundaRestController extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();
    // add your own classes
    // add all camunda engine rest resources (or just add those that you actually need).
//    classes.add(CamundaResourceConfig.class);

    // mandatory
//    classes.addAll(CamundaRestResources.getConfigurationClasses());

    return classes;
  }
}
