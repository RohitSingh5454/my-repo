package com.example.EmployeesDataResignation.controller;

import com.example.EmployeesDataResignation.dto.EmployeesDataDto;
import com.example.EmployeesDataResignation.dto.EmployeesDataFilterDto;
import com.example.EmployeesDataResignation.entity.EmployeesData;
import com.example.EmployeesDataResignation.exception.GenericException;
import com.example.EmployeesDataResignation.payload.ResponseMessage;
import com.example.EmployeesDataResignation.service.EmployeesDataService;
import com.example.EmployeesDataResignation.service.impl.EmployeesDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EmployeesData")
public class EmployeesDataController {
    @Autowired
    private EmployeesDataServiceImpl EmployeesDataService;
    @PostMapping("save")
    public ResponseMessage<String> saveEmployeesData(@RequestBody EmployeesDataDto EmployeesData){
        try {
            String str=EmployeesDataService.saveEmployeesData(EmployeesData);
            return new ResponseMessage<>(HttpStatus.OK.value(),"success",str);
        }catch (GenericException e){
            throw new GenericException(e.message,e.code,e.exceptionIdentifier);
        }
        catch (Exception e){
            throw new GenericException(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/saveList")
    public ResponseMessage<String> saveEmployeesDataList(@RequestBody List<EmployeesDataDto> EmployeesDatas){
        try {
            String str=EmployeesDataService.saveListEmployeesData(EmployeesDatas);
            return new ResponseMessage<>(HttpStatus.OK.value(),"success",str);
        }catch (GenericException e){
            throw new GenericException(e.message,e.code,e.exceptionIdentifier);
        }
        catch (Exception e){
            throw new GenericException(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    @PutMapping
//    @DeleteMapping
     @GetMapping("EmployeesDataResignation")
     public ResponseMessage<List<EmployeesData>> EmployeesDataResign(){
         try {
             List<EmployeesData> EmployeesDatas=EmployeesDataService.filterEmployeesDataBasedOnAgeAndLeave();
             return new ResponseMessage<>(HttpStatus.OK.value(),"success",EmployeesDatas);
         }catch (GenericException e){
             throw new GenericException(e.message,e.code,e.exceptionIdentifier);
         }
         catch (Exception e){
             throw new GenericException(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
    @GetMapping("EmployeesDataResignationMail")
      public ResponseMessage<String> EmployeesDataResignMail() {
       try {
        EmployeesDataService.sendResignationEmail();
        return new ResponseMessage<>(HttpStatus.OK.value(), "Resignation email sent successfully.", "Email process completed");

    } catch (GenericException e) {
        throw new GenericException(e.message, e.code, e.exceptionIdentifier);
    } catch (Exception e) {
        throw new GenericException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

    @GetMapping("findBy/{id}")
    public ResponseMessage<EmployeesDataFilterDto> findEmployeesDataById(@PathVariable Integer id){
        try {
            //String str=EmployeesDataService.filterEmployeesDataBasedOnAgeAndLeave(age,leave);
            EmployeesDataFilterDto EmployeesDataFilterDto=EmployeesDataService.filterEmployeesData(id);
            return new ResponseMessage<>(HttpStatus.OK.value(),"success",EmployeesDataFilterDto);
        }catch (GenericException e){
            throw new GenericException(e.message,e.code,e.exceptionIdentifier);
        }
        catch (Exception e){
            throw new GenericException(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
