package com.thinkConstructive.vendor.service;

import com.thinkConstructive.vendor.model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface cloudVendorService {
    String createCloudVendor(CloudVendor cloudVendor);
    String updateCloudVendor(CloudVendor cloudVendor,String vendorId);
    String deleteVendor(String vendorId);
    CloudVendor getCloudVendor(String vendorId);
    List<CloudVendor> getAllCloudVendor();
}
