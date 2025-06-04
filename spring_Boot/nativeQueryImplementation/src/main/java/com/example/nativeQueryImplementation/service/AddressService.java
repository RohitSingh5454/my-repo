package com.example.nativeQueryImplementation.service;

import com.example.nativeQueryImplementation.entity.Address;
import com.example.nativeQueryImplementation.repository.AddressRepo;
import com.example.nativeQueryImplementation.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AddressService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private AddressRepo addressRepo;
    public AddressResponse findAddressByEmployeesDataId(int EmployeesDataId){
        int i=0;
        Optional<Address> addressByEmployeesDataId=addressRepo.findAddressByEmployeesDataId(EmployeesDataId);
        AddressResponse addressResponse=modelMapper.map(addressByEmployeesDataId,AddressResponse.class);
        return addressResponse;
    }
}




