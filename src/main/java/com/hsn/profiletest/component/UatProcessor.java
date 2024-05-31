package com.hsn.profiletest.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class UatProcessor implements Processor{
    public String getWorkStatus() {
        return "All the end users have tested the features, they have reported few minor bugs. Developers are assigned to fix them!";
    }
}
