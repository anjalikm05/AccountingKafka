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

    public String getAccountAgentCode() {
        return accountAgentCode;
    }

    public void setAccountAgentCode(String accountAgentCode) {
        this.accountAgentCode = accountAgentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentCodeSerialNo() {
        return agentCodeSerialNo;
    }

    public void setAgentCodeSerialNo(String agentCodeSerialNo) {
        this.agentCodeSerialNo = agentCodeSerialNo;
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public LocalDate getLastDepositDate() {
        return lastDepositDate;
    }

    public void setLastDepositDate(LocalDate lastDepositDate) {
        this.lastDepositDate = lastDepositDate;
    }

    public LocalTime getLastDepositTime() {
        return lastDepositTime;
    }

    public void setLastDepositTime(LocalTime lastDepositTime) {
        this.lastDepositTime = lastDepositTime;
    }

    public LocalDate getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(LocalDate validFromDate) {
        this.validFromDate = validFromDate;
    }

    public LocalDate getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(LocalDate validToDate) {
        this.validToDate = validToDate;
    }

    public Double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getBookedAmount() {
        return bookedAmount;
    }

    public void setBookedAmount(Double bookedAmount) {
        this.bookedAmount = bookedAmount;
    }

    public Double getRefundedAmount() {
        return refundedAmount;
    }

    public void setRefundedAmount(Double refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    public Integer getBookedTransactionCount() {
        return bookedTransactionCount;
    }

    public void setBookedTransactionCount(Integer bookedTransactionCount) {
        this.bookedTransactionCount = bookedTransactionCount;
    }

    public Integer getCancelledTransactionCount() {
        return cancelledTransactionCount;
    }

    public void setCancelledTransactionCount(Integer cancelledTransactionCount) {
        this.cancelledTransactionCount = cancelledTransactionCount;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getServingZone() {
        return servingZone;
    }

    public void setServingZone(String servingZone) {
        this.servingZone = servingZone;
    }

    public String getServingDivision() {
        return servingDivision;
    }

    public void setServingDivision(String servingDivision) {
        this.servingDivision = servingDivision;
    }

    public String getServingStation() {
        return servingStation;
    }

    public void setServingStation(String servingStation) {
        this.servingStation = servingStation;
    }

    public Double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(Double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Character getAccountAgentType() {
        return accountAgentType;
    }

    public void setAccountAgentType(Character accountAgentType) {
        this.accountAgentType = accountAgentType;
    }

    public Character getAccountType() {
        return accountType;
    }

    public void setAccountType(Character accountType) {
        this.accountType = accountType;
    }

    public LocalDate getLastWithdrawalDate() {
        return lastWithdrawalDate;
    }

    public void setLastWithdrawalDate(LocalDate lastWithdrawalDate) {
        this.lastWithdrawalDate = lastWithdrawalDate;
    }

    public LocalTime getLastWithdrawalTime() {
        return lastWithdrawalTime;
    }

    public void setLastWithdrawalTime(LocalTime lastWithdrawalTime) {
        this.lastWithdrawalTime = lastWithdrawalTime;
    }

    public Character getAgentType() {
        return agentType;
    }

    public void setAgentType(Character agentType) {
        this.agentType = agentType;
    }

    public String getMasterAgentCode() {
        return masterAgentCode;
    }

    public void setMasterAgentCode(String masterAgentCode) {
        this.masterAgentCode = masterAgentCode;
    }

    public Short getEnrollmentSchemeType() {
        return enrollmentSchemeType;
    }

    public void setEnrollmentSchemeType(Short enrollmentSchemeType) {
        this.enrollmentSchemeType = enrollmentSchemeType;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Short getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Short statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Double getServiceRateLowClass() {
        return serviceRateLowClass;
    }

    public void setServiceRateLowClass(Double serviceRateLowClass) {
        this.serviceRateLowClass = serviceRateLowClass;
    }

    public Double getServiceRateHighClass() {
        return serviceRateHighClass;
    }

    public void setServiceRateHighClass(Double serviceRateHighClass) {
        this.serviceRateHighClass = serviceRateHighClass;
    }

    public Double getServiceRateCancel() {
        return serviceRateCancel;
    }

    public void setServiceRateCancel(Double serviceRateCancel) {
        this.serviceRateCancel = serviceRateCancel;
    }

    public Integer getSubAgentsCount() {
        return subAgentsCount;
    }

    public void setSubAgentsCount(Integer subAgentsCount) {
        this.subAgentsCount = subAgentsCount;
    }
}
