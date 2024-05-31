package com.hsn.profiletest.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectStatus {
    private String welcomeMsg;
    private String workMsg;
    private String frwlMsg;
    private String statusMsg;
}
