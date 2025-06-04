package AbhinavSirLabWork.javaConceptOfTheDay.array;

//public class singleton {
//    public static void main(String[] args) {
//        Xyz ob1=Xyz.m1();
//    }
//
//}
//class Xyz{
//    private Xyz(){
//    }
//    private static final Xyz ob=new Xyz();
//    public static Xyz m1(){
//        return ob;
//    }

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Abc{
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> odd=listOfIntegers.stream().filter(i->i%2==1).collect(Collectors.toList());
        List<Integer> even=listOfIntegers.stream().filter(i->i%2!=1).collect(Collectors.toList());
        System.out.println(odd);
        System.out.println(even);

    }
}
