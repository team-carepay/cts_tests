package com.carepay.interviewtest2025.dto;

import com.carepay.interviewtest2025.model.ClaimStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class ClaimCreateRequest {
    @NotBlank
    private String policyNumber;

    @NotBlank
    private String patientName;
    private final ClaimStatus status = ClaimStatus.OPEN;


    @Valid
    private List<ClaimItemCreateRequest> items = new ArrayList<>();

}
