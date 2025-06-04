package AbhinavSirLabWork.InterviewCoding.Impetus_Technologies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesData {
        String firstName;
        String lastName;
        int age;

        public EmployeesData(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "EmployeesData{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void listOPeration() {
            List<EmployeesData> list = new ArrayList<>();
            list.add(new EmployeesData("Raghav","sharma",27));
            list.add(new EmployeesData("Sanjay","Kapoor",29));
            list.add(new EmployeesData("Amit","Singh",24));
            list.add(new EmployeesData("Rohit","Singh",28));
            list.add(new EmployeesData("Chetan","Singhi",30));
            list.stream().sorted(Comparator.comparing(EmployeesData::getLastName).
                    thenComparing(EmployeesData::getFirstName)).collect(Collectors.toList()).forEach(System.out::println);
            //System.out.println(sortUsingLastAndFirstName);

        }

        public static void main(String[] args) {
            listOPeration();
        }
    }

