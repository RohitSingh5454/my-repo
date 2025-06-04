package com.example.demoCompositeKey.repository;

import com.example.demoCompositeKey.entity.EmployeesData;
import com.example.demoCompositeKey.entity.EmployeesDataId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeesDataRepository extends JpaRepository<EmployeesData, EmployeesDataId> {
    List<EmployeesData> findByName(String name);
    EmployeesData findByEmailOrCity(String email,String city);
    @Query("select u from EmployeesData u")
    List<EmployeesData> getAllEmployeesDatasUsingJpql();
    @Query("select u from EmployeesData u where u.city=:c")
    List<EmployeesData> getEmployeesDataByCityUsingJpql(@Param("c") String city);
    @Query("select u from EmployeesData u where u.name=:n")
    List<EmployeesData> getEmployeesDataByNameUsingJpql(@Param("n") String name);
    @Query("select u from EmployeesData u where u.name=:n or u.city=:c")
    List<EmployeesData> getEmployeesDataByNameOrCityUsingJpql(@Param("n") String name,@Param("c") String city);
    @Query(value = "select emp_id,dept_id" +
            ",name,email,city from emp_data ORDER BY dept_id DESC", nativeQuery = true)
    List<EmployeesData> getAllUserUsingNativeQuery();

}
