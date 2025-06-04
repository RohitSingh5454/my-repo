package com.thinkConstructive.vendor.service.impl;

import com.thinkConstructive.vendor.exception.cloudVendorNotFoundException;
import com.thinkConstructive.vendor.model.CloudVendor;
import com.thinkConstructive.vendor.repository.CloudVendorRepository;
import com.thinkConstructive.vendor.service.cloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class cloudVendorServiceImpl implements cloudVendorService {
    @Autowired
    private CloudVendorRepository cloudVendorRepository;
    public cloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository){
        this.cloudVendorRepository=cloudVendorRepository;
    }
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor,String vendorId) {
        CloudVendor vendor=cloudVendorRepository.findById(vendorId).get();
        vendor.setVendorId(cloudVendor.getVendorId());
        vendor.setVendorName(cloudVendor.getVendorName());
        vendor.setVendorAddress(cloudVendor.getVendorAddress());
        vendor.setVendorPhone(cloudVendor.getVendorPhone());
        cloudVendorRepository.save(vendor);
        return "updated successfully";
    }

    @Override
    public String deleteVendor(String vendorId) {
       cloudVendorRepository.deleteById(vendorId);
       return "Successfully deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if (cloudVendorRepository.findById(vendorId).isEmpty()){
            throw new cloudVendorNotFoundException("Request cloud vendor does not exist");
        }
       return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
