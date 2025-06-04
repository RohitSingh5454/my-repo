package com.thinkConstructive.vendor.controller;

import com.thinkConstructive.vendor.model.CloudVendor;
import com.thinkConstructive.vendor.response.ResponseHandler;
import com.thinkConstructive.vendor.service.cloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/vendorApi")
public class vendorController {
    @Autowired
    cloudVendorService cloudVendorService;
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getDetails(@PathVariable String vendorId){
       return ResponseHandler.responseBuilder("requested vendor details ",
               HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));
    }
    @PostMapping("/saveVendor")
    public String createVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "vendor created successfully";
    }
    @PutMapping("/update/{vendorId}")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor,@PathVariable String vendorId){
        cloudVendorService.updateCloudVendor(cloudVendor,vendorId);
        return "vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable String vendorId){
        cloudVendorService.deleteVendor(vendorId);
        return "Cloud vendor deleted";
    }
    @GetMapping("/getAll")
    public List<CloudVendor> getAllCloudVendor(){
        return cloudVendorService.getAllCloudVendor();
    }
}
