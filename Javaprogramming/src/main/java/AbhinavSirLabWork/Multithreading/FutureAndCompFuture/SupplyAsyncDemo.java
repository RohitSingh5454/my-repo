package AbhinavSirLabWork.Multithreading.FutureAndCompFuture;

import AbhinavSirLabWork.Multithreading.FutureAndCompFuture.Database.EmployeeDatabase;
import AbhinavSirLabWork.Multithreading.FutureAndCompFuture.dto.EmployeeDto;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {
   public static List<EmployeeDto> getEmployee() throws ExecutionException, InterruptedException {
       Executor executor= Executors.newCachedThreadPool();
       CompletableFuture<List<EmployeeDto>> employeeList=CompletableFuture.supplyAsync(()->{
                       System.out.println("Thread name "+Thread.currentThread().getName());
           return EmployeeDatabase.fetchAllEmployee();},executor);
       return employeeList.get();
   }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
     List<EmployeeDto> employeeDtoList= getEmployee();
     employeeDtoList.stream().forEach(System.out::println);
    }
}
