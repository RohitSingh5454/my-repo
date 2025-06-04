package com.example.nativeQueryImplementation.repository;

import com.example.nativeQueryImplementation.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AddressRepo extends JpaRepository<Address,Integer> {
    @Query(nativeQuery = true,value = "select ea.id, ea.city,ea.state from userDb.address ea join userDb.EmployeesData e on e.id=ea.EmployeesData_id where ea.EmployeesData_id=:EmployeesDataId")
    Optional<Address> findAddressByEmployeesDataId(@Param("EmployeesDataId") int EmployeesDataId);
}
