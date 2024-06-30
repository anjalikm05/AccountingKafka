package org.cris.kafka.repository;

import org.cris.kafka.entity.AcmisAgentEnrollmentSchemesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcmisAgentEnrollmentSchemesRepo extends JpaRepository<AcmisAgentEnrollmentSchemesDto, Integer> {
}
