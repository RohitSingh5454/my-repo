package AbhinavSirLabWork.Multithreading.FutureAndCompFuture.Database;

import AbhinavSirLabWork.Multithreading.FutureAndCompFuture.dto.EmployeeDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDatabase {
    public static List<EmployeeDto> fetchAllEmployee() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.
                    readValue(new File("C:\\java Programming\\Java_Programming\\Javaprogramming\\employees.json"),
                            new TypeReference<List<EmployeeDto>>() {
                            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
