package org.cris.kafka.controller;

import cris.apos.acc.utility.AgentStreamingUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/updateAgent")
public class AgentStreamingRest {

    @Autowired
    private AgentStreamingUtility agentStreamingUtility;

    @GetMapping("/streamAgent")
    public void addMasterAgent() {
        agentStreamingUtility.AcmisAgentMasterProducer();
    }
}
