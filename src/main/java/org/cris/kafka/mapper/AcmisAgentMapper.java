package org.cris.kafka.mapper;


import org.cris.kafka.entity.AcmisAgentEnrollmentSchemesDto;
import org.cris.kafka.entity.AcmisAgentMasterDto;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;

@Service
public class AcmisAgentMapper {

    public AcmisAgentMasterDto convertToEntityAgentMaster(Object obj) {
        if (!(obj instanceof List<?>)) {
            throw new IllegalArgumentException("Object is not a List");
        }

        List<?> list = (List<?>) obj;
        if (list.size() != 34) {
            throw new IllegalArgumentException("List size does not match the number of fields in AcmisAgentMasterDto");
        }

        AcmisAgentMasterDto dto = new AcmisAgentMasterDto();
        dto.setAccountAgentCode((String) list.get(0));
        dto.setAgentName((String) list.get(1));
        dto.setAgentCodeSerialNo((String) list.get(2));
        dto.setAgentAddress((String) list.get(3));
        dto.setRegisteredDate(convertToLocalDate(list.get(4)));
        dto.setLastDepositDate(convertToLocalDate(list.get(5)));
        dto.setLastDepositTime(convertToLocalTime(list.get(6)));
        dto.setValidFromDate(convertToLocalDate(list.get(7)));
        dto.setValidToDate(convertToLocalDate(list.get(8)));
        dto.setOpeningBalance((Double) list.get(9));
        dto.setDepositAmount((Double) list.get(10));
        dto.setBookedAmount((Double) list.get(11));
        dto.setRefundedAmount((Double) list.get(12));
        dto.setBookedTransactionCount((Integer) list.get(13));
        dto.setCancelledTransactionCount((Integer) list.get(14));
        dto.setCurrentBalance((Double) list.get(15));
        dto.setMinimumBalance((Double) list.get(16));
        dto.setServingZone((String) list.get(17));
        dto.setServingDivision((String) list.get(18));
        dto.setServingStation((String) list.get(19));
        dto.setWithdrawalAmount((Double) list.get(20));
        dto.setAccountAgentType(list.get(21)==null?null:list.get(21).toString().charAt(0));
        dto.setAccountType(list.get(22)==null?null:list.get(22).toString().charAt(0));
        dto.setLastWithdrawalDate(convertToLocalDate(list.get(23)));
        dto.setLastWithdrawalTime(convertToLocalTime(list.get(24)));
        dto.setAgentType(list.get(25)==null?null:list.get(25).toString().charAt(0));
        dto.setMasterAgentCode((String) list.get(26));
        dto.setEnrollmentSchemeType(list.get(27)==null?null:((Integer)list.get(27)).shortValue());
        dto.setContactNo((String) list.get(28));
        dto.setStatusFlag(list.get(29)==null?null:((Integer)list.get(29)).shortValue());
        dto.setServiceRateLowClass((Double) list.get(30));
        dto.setServiceRateHighClass((Double) list.get(31));
        dto.setServiceRateCancel((Double) list.get(32));
        dto.setSubAgentsCount((Integer) list.get(33));

        return dto;
    }

    public AcmisAgentEnrollmentSchemesDto convertToEntityEnrollmentSchemes(Object obj) {
        AcmisAgentEnrollmentSchemesDto dto = new AcmisAgentEnrollmentSchemesDto();

        return dto;
    }

    private LocalDate convertToLocalDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return Instant.ofEpochMilli((Long) obj).atZone(ZoneId.systemDefault()).toLocalDate();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                return null;
            }
            return LocalDate.parse(str);
        }
        throw new IllegalArgumentException("Unsupported object type for conversion to LocalDate");
    }

    private LocalTime convertToLocalTime(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return Instant.ofEpochMilli((Long) obj).atZone(ZoneId.systemDefault()).toLocalTime();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                return null;
            }
            return LocalTime.parse(str);
        }
        throw new IllegalArgumentException("Unsupported object type for conversion to LocalTime");
    }

    private Double convertToDouble(Object obj) {
        return obj instanceof Number ? ((Number) obj).doubleValue() : null;
    }

    private Integer convertToInteger(Object obj) {
        return obj instanceof Number ? ((Number) obj).intValue() : null;
    }

    private Character convertToCharacter(Object obj) {
        return obj instanceof String ? ((String) obj).charAt(0) : (Character) obj;
    }

    private Short convertToShort(Object obj) {
        return obj instanceof Number ? ((Number) obj).shortValue() : null;
    }
}
