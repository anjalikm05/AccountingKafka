package org.cris.kafka.service;

import org.cris.kafka.entity.AcmisAgentEnrollmentSchemesDto;
import org.cris.kafka.entity.AcmisAgentMasterDto;
import org.cris.kafka.mapper.AcmisAgentMapper;
import org.cris.kafka.repository.AcmisAgentEnrollmentSchemesRepo;
import org.cris.kafka.repository.AcmisRtsaMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgentConsumerUtility {

    @Autowired
    private AcmisRtsaMasterRepo acmisRtsaMasterRepo;
    @Autowired
    private AcmisAgentEnrollmentSchemesRepo acmisAgentEnrollmentSchemesRepo;
    @Autowired
    private AcmisAgentMapper acmisAgentMapper;

    @KafkaListener(
            topics = "agent",
            groupId = "summary-acc-microservices",
            containerFactory = "kafkaListener"
    )
    public void AcmisAgentMasterListener(List<Object> object) {

        System.out.println("Success: From consumer: " + object);

        List<AcmisAgentMasterDto> entities = object.stream()
                .map(obj -> acmisAgentMapper.convertToEntityAgentMaster(obj))
                .collect(Collectors.toList());
        System.out.println(entities);

        acmisRtsaMasterRepo.saveAll(entities);
    }

    @KafkaListener(
            topics = "agent-1",
            groupId = "summary-acc-microservices",
            containerFactory = "kafkaListener"
    )
    public void AcmisAgentEnrollmentSchemesListener(List<Object> object) {

        System.out.println("Success: From consumer: " + object);

        List<AcmisAgentEnrollmentSchemesDto> entities = object.stream()
                .map(obj -> acmisAgentMapper.convertToEntityEnrollmentSchemes(obj))
                .collect(Collectors.toList());
        System.out.println(entities);

        acmisAgentEnrollmentSchemesRepo.saveAll(entities);
    }
}
