package com.carepay.interviewtest2025.dto;

import com.carepay.interviewtest2025.model.ClaimItemStatus;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class ClaimItemResponse {
    private Long id;
    private String description;
    private BigDecimal amount;
    private ClaimItemStatus status;
}
