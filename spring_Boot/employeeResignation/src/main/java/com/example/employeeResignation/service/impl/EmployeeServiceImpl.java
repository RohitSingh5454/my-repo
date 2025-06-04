package com.example.EmployeesDataResignation.service.impl;

import com.example.EmployeesDataResignation.dto.EmployeesDataDto;
import com.example.EmployeesDataResignation.dto.EmployeesDataFilterDto;
import com.example.EmployeesDataResignation.entity.EmployeesData;
import com.example.EmployeesDataResignation.payload.ResponseMessage;
import com.example.EmployeesDataResignation.repositoty.EmployeesDataRepository;
import com.example.EmployeesDataResignation.service.EmailService;
import com.example.EmployeesDataResignation.service.EmployeesDataService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class EmployeesDataServiceImpl implements EmployeesDataService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EmployeesDataRepository EmployeesDataRepository;
    @Autowired
    private EmailService emailService;
    @Override
    public String saveEmployeesData(EmployeesDataDto EmployeesDataDto) {
        EmployeesData emp=modelMapper.map(EmployeesDataDto,EmployeesData.class);
        EmployeesDataRepository.save(emp);
        return "EmployeesData saved";
    }

    @Override
    public EmployeesDataFilterDto filterEmployeesData(Integer id) {
        EmployeesData emp=EmployeesDataRepository.findById(id).get();
        EmployeesDataFilterDto getFilterData=modelMapper.map(emp,EmployeesDataFilterDto.class);
        return getFilterData;
    }

    @Override
    public List<EmployeesData> filterEmployeesDataBasedOnAgeAndLeave() {
        List<EmployeesData> list=EmployeesDataRepository.findAll();
        List<EmployeesData> ageAbove60=list.stream().filter(i->i.getAge()>60).collect(Collectors.toList());
        List<EmployeesData> EmployeesDataForResignation=list.stream().filter(i->i.getAge()>60).
                sorted(Comparator.comparing(EmployeesData::getLeave).reversed()).
                limit(10).collect(Collectors.toList());
       return EmployeesDataForResignation;
    }
    @Scheduled(cron = "0 0 10 ? * MON")
    public void sendResignationEmail() {
        List<EmployeesData> EmployeesDatasForResignation = filterEmployeesDataBasedOnAgeAndLeave();

        if (!EmployeesDatasForResignation.isEmpty()) {
            String messageBody = buildEmailBody(EmployeesDatasForResignation);
            emailService.sendEmail("morgan_stanley@company.com", "Weekly Resignation Notice", messageBody);
        }
    }
    private String buildEmailBody(List<EmployeesData> EmployeesDatas) {
        StringBuilder builder = new StringBuilder();
        builder.append("Weekly Resignation Notification\n\n");
        for (EmployeesData EmployeesData : EmployeesDatas) {
            builder.append("EmployeesData ID: ").append(EmployeesData.getId())
                    .append(", Name: ").append(EmployeesData.getName())
                    .append(", Age: ").append(EmployeesData.getAge())
                    .append(", Leave Count: ").append(EmployeesData.getLeave())
                    .append("\n");
        }
        return builder.toString();
    }
    @Override
    public String saveListEmployeesData(List<EmployeesDataDto> EmployeesDataDtoList) {
        List<EmployeesData> EmployeesDatas=EmployeesDataDtoList.stream().map(dto->modelMapper.map(dto,EmployeesData.class)).
                collect(Collectors.toList());
        EmployeesDataRepository.saveAll(EmployeesDatas);
        return "EmployeesData list saved";
    }

    @Override
    public List<EmployeesData> getEmployeesData(Integer id) {
        return null;
    }

    @Override
    public String deleteEmployeesData(Integer id) {
        return null;
    }

    @Override
    public String updateEmployeesData(EmployeesDataDto EmployeesDataDto, Integer id) {
        return null;
    }
}
