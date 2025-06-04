package AbhinavSirLabWork.Multithreading.FutureAndCompFuture;

import AbhinavSirLabWork.Multithreading.FutureAndCompFuture.Database.EmployeeDatabase;
import AbhinavSirLabWork.Multithreading.FutureAndCompFuture.dto.EmployeeDto;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class EmployeeReminderService {
    public CompletableFuture<Void> sendReminder() throws ExecutionException, InterruptedException {
        Executor executor= Executors.newFixedThreadPool(5);
        CompletableFuture<Void> completableFuture=CompletableFuture.supplyAsync(()->{
                    System.out.println("Thread is "+Thread.currentThread().getName());
                    return EmployeeDatabase.fetchAllEmployee();
        },executor)         .thenApplyAsync((emp)->{
                    System.out.println("filter new joiner employee "+Thread.currentThread().getName());
            return emp.stream().filter(employee->"TRUE".equals(employee.getNewJoiner())).collect(Collectors.toList());
                },executor ) .thenApplyAsync
                ((emp)->{
                    System.out.println("filter training not completed "+Thread.currentThread().getName());
                    return emp.stream().filter(employee->"TRUE".equals(employee.getLearningPending()))
                        .collect(Collectors.toList());
                },executor).thenApplyAsync((emp)->{
                    System.out.println("get emails "+Thread.currentThread().getName());
                   return emp.stream().map(e->e.getEmail()).collect(Collectors.toList());
                },executor).thenAcceptAsync((email) ->{
                System.out.println("email sent "+Thread.currentThread().getName());
                email.forEach(EmployeeReminderService::sendMail);
                },executor);
        return completableFuture;
    }
    public static void sendMail(String mail){
        System.out.println("mail id is :" +mail);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        EmployeeReminderService service=new EmployeeReminderService();
        service.sendReminder().get();
    }
}
