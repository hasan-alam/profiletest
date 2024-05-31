package com.hsn.profiletest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hsn.profiletest.component.Processor;
import com.hsn.profiletest.entity.ProjectStatus;
import com.hsn.profiletest.service.ProfileService;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Data
public class ProfileController {
    @Autowired
    ProfileService service;

    @Value("${custom.welcome.message}")
    private String welcomeString;
    @Value("${custom.work.message}")
    private String workString; 
    @Value("${custom.farewell.message}")
    private String fareWellString;
    @Autowired
    Processor processor;

    @GetMapping("/")
    public ProjectStatus getProjectStatus() {
        return ProjectStatus.builder().welcomeMsg(welcomeString).workMsg(workString).statusMsg(processor.getWorkStatus()).frwlMsg(fareWellString).build();
    }
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    
}
