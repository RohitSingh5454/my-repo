package AbhinavSirLabWork.Multithreading.FutureAndCompFuture;

import AbhinavSirLabWork.AbhinavSirGitPractice.Employee;
import AbhinavSirLabWork.Multithreading.FutureAndCompFuture.dto.EmployeeDto;
import AbhinavSirLabWork.Packages.Package1.Pac2Imp.E;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunAsycDemo {
    ObjectMapper mapper = new ObjectMapper();
    public Void saveEmployee(File jsonFile) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> runAsyncFuture=CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    List<EmployeeDto> employees = mapper.readValue(jsonFile, new TypeReference<List<EmployeeDto>>() {
                    });
                    System.out.println("current thread is "+Thread.currentThread().getName());
                    System.out.println(employees.size());
                    //employees.stream().forEach(System.out::println);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return runAsyncFuture.get();
    }
    public Void saveUsingExecutor(File jsonFile) throws ExecutionException, InterruptedException {
        Executor executor= Executors.newFixedThreadPool(7);
        ObjectMapper newMapper=new ObjectMapper();
        CompletableFuture<Void> runAsync=CompletableFuture.runAsync(
        ()-> {
            try {
                List<EmployeeDto> employees = newMapper.readValue(jsonFile, new TypeReference<List<EmployeeDto>>() {
                });
                System.out.println("current thread is "+Thread.currentThread().getName());
                System.out.println(employees.size());
               //qwq39 employees.stream().forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        },executor);
        return runAsync.get();
}

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunAsycDemo runAsycDemo=new RunAsycDemo();
        runAsycDemo.saveEmployee(new File("C:\\java Programming\\Java_Programming\\Javaprogramming\\employees.json"));
        runAsycDemo.saveUsingExecutor(new File("C:\\java Programming\\Java_Programming\\Javaprogramming\\employees.json"));
    }
}
