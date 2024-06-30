package org.cris.kafka.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "ACMIS_RTSA_MASTER_APOS")
@Data
public class AcmisAgentMasterDto implements java.io.Serializable {

    @Id
    private String accountAgentCode;
    private String agentName;
    private String agentCodeSerialNo;
    private String agentAddress;
    private LocalDate registeredDate;
    private LocalDate lastDepositDate;
    private LocalTime lastDepositTime;
    private LocalDate validFromDate;
    private LocalDate validToDate;
    private Double openingBalance;
    private Double depositAmount;
    private Double bookedAmount;
    private Double refundedAmount;
    private Integer bookedTransactionCount;
    private Integer cancelledTransactionCount;
    private Double currentBalance;
    private Double minimumBalance;
    private String servingZone;
    private String servingDivision;
    private String servingStation;
    private Double withdrawalAmount;
    private Character accountAgentType;
    private Character accountType;
    private LocalDate lastWithdrawalDate;
    private LocalTime lastWithdrawalTime;
    private Character agentType;
    private String masterAgentCode;
    private Short enrollmentSchemeType;
    private String contactNo;
    private Short statusFlag;
    private Double serviceRateLowClass;
    private Double serviceRateHighClass;
    private Double serviceRateCancel;
    private Integer subAgentsCount;
}
