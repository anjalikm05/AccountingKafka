package org.cris.kafka.repository;

import org.cris.kafka.entity.AcmisAgentMasterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcmisRtsaMasterRepo extends JpaRepository<AcmisAgentMasterDto, String> {
}
