package com.carepay.interviewtest2025.repository;

import com.carepay.interviewtest2025.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClaimRepository extends JpaRepository<Claim, Long> { }
