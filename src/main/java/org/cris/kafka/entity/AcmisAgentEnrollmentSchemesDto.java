package org.cris.kafka.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACMIS_RTSA_DIM_ENROLLMENT_SCHEMES_APOS")
@Data
public class AcmisAgentEnrollmentSchemesDto implements java.io.Serializable {
    @Id
    private Integer enrollmentSchemeCode;
    private String enrollmentSchemeModelCode;
    private String enrollmentSchemeModelType;
    private String enrollmentSchemeType;
    private String enrollmentSchemeDesc;
}
