package AbhinavSirLabWork.Oops.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate ob1 = new Encapsulate();
        ob1.setAge(12);
        ob1.setName("Hariom");
        ob1.setRoll(23);
        System.out.println(ob1.getName());
        System.out.println(ob1.getAge());
        System.out.println(ob1.getRoll());
    }

}
