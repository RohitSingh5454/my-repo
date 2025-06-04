package AbhinavSirLabWork.RuntimeClass;

public class Lab695 {
    public static void main(String[] args) {
        Runtime rt=null;
       // System.out.println(Runtime.getRuntime());
       // System.out.println(Runtime.getRuntime());
        rt=Runtime.getRuntime();
        System.out.println(rt);
        System.out.println("Total memory is : "+rt.totalMemory());
        System.out.println("Processor is : "+rt.availableProcessors());
        System.out.println("Free memory is : " +rt.freeMemory());
        System.out.println("Max memory is : "+rt.maxMemory());
    }
}
