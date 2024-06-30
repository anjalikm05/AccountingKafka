package org.cris.kafka.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AcmisAgentDynFactDto implements java.io.Serializable {
    private Integer txnType;
    private LocalDate uSessionDate;
    private Integer uTerminalNo;
    private Integer uOperSessionNo;
    private LocalDate txnDate;
    private LocalTime txnTime;
    private Integer shiftNo;
    private Integer operNo;
    private String operId;
    private Integer windowNo;
    private Integer trmlNo;
    private Integer tbAccAgentInfoMasterId;
    private String agentCode;
    private String agentType;
    private String operSiteId;
    private String operLocId;
    private String operRlyId;
    private String operDivId;
    private String operAccId;
    private String srcAgentCode;
    private String dstAgentCode;
    private Double amount;
    private Integer pmntMode;
    private String receiptId;
    private String authority;
    private LocalDate regDate;
    private Double prevBalSrc;
    private Double prevBalDst;
    private Double curBalSrc;
    private Double curBalDst;
    private Integer noOfTopUp;
    private String reason;
    private String eventType;
    private String servingZone;
    private String servingDiv;
    private String servingStn;
    private String agentName;
    private String address;
    private String contactNo;
    private Integer statusFlag;
    private Double minBalance;
    private LocalDate vldFromDate;
    private LocalDate vldToDate;
    private String prevServingZone;
    private String prevServingDiv;
    private String prevServingStn;
    private String prevName;
    private String prevAddress;
    private String prevContactNo;
    private Integer prevStatusFlag;
    private Double prevMinBalance;
    private LocalDate prevVldFromDate;
    private LocalDate prevVldToDate;
    private String masterAgentCode;
    private Integer enrollmentSchemeType;
    private Integer tbAccAgentAccountMasterId;
}
