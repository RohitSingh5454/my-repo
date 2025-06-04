package com.thinkConstructive.vendor.service.impl;

import com.thinkConstructive.vendor.model.CloudVendor;
import com.thinkConstructive.vendor.repository.CloudVendorRepository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class cloudVendorServiceImplTest {
    @Mock
    private CloudVendorRepository cloudVendorRepository;
    private cloudVendorServiceImpl cloudVendorService;
    AutoCloseable autoCloseable;
    CloudVendor cloudVendor;
    @BeforeEach
    void setUp() {
        autoCloseable= MockitoAnnotations.openMocks(this);
        cloudVendorService=new cloudVendorServiceImpl(cloudVendorRepository);
        cloudVendor=new CloudVendor("1","Amazon","Usa","+6176987122");
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void createCloudVendor() {
       mock(CloudVendor.class);
       mock(CloudVendorRepository.class);
       when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
        assertThat(cloudVendorService.createCloudVendor(cloudVendor)).isEqualTo("Success");
    }


    @Test
    void updateCloudVendor() {
        String vendorId="1";
        cloudVendor=new CloudVendor(vendorId,"Amazon","Usa","+6128958223");
        when(cloudVendorRepository.findById(vendorId)).thenReturn(Optional.of(cloudVendor));
        when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
        String result=cloudVendorService.updateCloudVendor(cloudVendor,vendorId);
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);
        assertThat(cloudVendorService.updateCloudVendor(cloudVendor,vendorId)).isEqualTo("updated successfully");
    }

    @Test
    void deleteVendor() {
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class,Mockito.CALLS_REAL_METHODS);
        doAnswer(Answers.CALLS_REAL_METHODS).when(cloudVendorRepository).deleteById(any());
        assertThat(cloudVendorService.deleteVendor("1")).isEqualTo("Successfully deleted");
    }

    @Test
    void getCloudVendor() {
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);
        when(cloudVendorRepository.findById("1")).thenReturn(Optional.ofNullable(cloudVendor));
        assertThat(cloudVendorService.getCloudVendor("1")).isEqualTo(cloudVendorRepository.findById("1").get());
    }

    @Test
    void getAllCloudVendor() {
      mock(CloudVendor.class);
      mock(CloudVendorRepository.class);
      when(cloudVendorRepository.findAll()).thenReturn(new ArrayList<>(Collections.singleton(cloudVendor)));
      assertThat(cloudVendorService.getAllCloudVendor()).isEqualTo(cloudVendorRepository.findAll());
    }
}