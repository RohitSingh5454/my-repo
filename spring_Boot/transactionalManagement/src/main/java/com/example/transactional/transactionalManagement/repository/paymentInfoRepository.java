package com.example.transactional.transactionalManagement.repository;

import com.example.transactional.transactionalManagement.entity.paymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentInfoRepository extends JpaRepository<paymentInfo,String> {
}
