package com.thinkConstructive.vendor.repository;

import com.thinkConstructive.vendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
    List<CloudVendor> findByVendorName(String vendorName);
}
