package com.hsn.profiletest.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevPocessor implements Processor{
    public String getWorkStatus() {
        return "Developers has written code and the QA is testing, No bug!!! Ready for UAT deployment!";
    }
}
