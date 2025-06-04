package InterviewPreparation.FunctionalInterface.MethodReference.InstanceRefParticularObj;

public class Person {
    Integer age;
    String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
