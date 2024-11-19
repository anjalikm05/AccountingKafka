package org.cris.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class AgentStreamingUtility {

    @Autowired
    KafkaTemplate<String, List<Object>> kafkaTemplate;
    @Autowired
    private EntityManager em;

    @Value("${acmisAgentMasterQuery}")
    private String acmisAgentMasterQuery;
    @Value("${acmisAgentEnrollmentSchemesQuery}")
    private String acmisAgentEnrollmentSchemesQuery;
    @Value("${acmisAgentDynFactQuery}")
    private String acmisAgentDynFactQuery;

    static Logger log = LoggerFactory.getLogger(AgentStreamingUtility.class);


    public void AcmisAgentMasterProducer() {
        List<Object> recordList;

        try {
            Query query = em.createNativeQuery(acmisAgentMasterQuery);
            recordList = query.getResultList();
            em.close();

            kafkaTemplate.send("agent", recordList);

        } catch(Exception e) {
            log.error("Error: Agent stream producer service: {}", e.getMessage());
        }
    }

    public void AcmisAgentEnrollmentSchemesProducer() {
        List<Object> recordList;

        try {
            Query query = em.createNativeQuery(acmisAgentEnrollmentSchemesQuery);
            recordList = query.getResultList();
            em.close();

            kafkaTemplate.send("agent", recordList);

        } catch(Exception e) {
            log.error("Error: Agent stream producer service: {}", e.getMessage());
        }
    }

    public void AcmisAgentDynFactProducer() {
        List<Object> recordList;

        try {
            Query query = em.createNativeQuery(acmisAgentDynFactQuery);
            recordList = query.getResultList();
            em.close();

            log.info("{}",recordList.get(0));
            kafkaTemplate.send("agent", recordList.subList(1,1));

        } catch(Exception e) {
            log.error("Error: Agent stream producer service: {}", e.getMessage());
        }
    }

    public void AcmisAgentBalanceSummaryProducer() {
        List<Object> recordList;

        try {
            Query query = em.createNativeQuery("");
            recordList = query.getResultList();
            em.close();

            kafkaTemplate.send("agent", recordList.subList(1,1));

        } catch(Exception e) {
            log.error("Error: Agent stream producer service: {}", e.getMessage());
        }
    }
}
