package InterviewPreparation.FilterData;

import java.util.*;
import java.util.stream.Collectors;

class Student{
        private String name;
        String address;
        int rollNo;
        String city;
       public Student(){

        }

        public Student(String name, String address, int rollNo, String city) {
            this.name = name;
            this.address = address;
            this.rollNo = rollNo;
            this.city = city;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollNo=" + rollNo +
                ", city='" + city + '\'' +
                '}';
    }
}
class Details {
    public static void main(String[] args) {
        List<Student> studentList=Arrays.asList(new Student("Kamlesh","Marathalli",77,"Bangalore"),
                new Student("Mahesh","Hinjwadi",56,"Pune"),
                new Student("Sukhesh","BahuiBajaar",88,"Ranchi"));
      /*  List<Student> list=studentList.stream().filter(i->i.city=="Bangalore").collect(Collectors.toList());
        System.out.println(list);
        List<String> longMap=studentList.stream().map(Student::getAddress).collect(Collectors.toList());
        System.out.println(longMap);
        Map<String,List<Student>> listMap=studentList.stream().collect(Collectors.groupingBy(Student::getCity));
        //System.out.println(listMap);
        listMap.forEach((key,value)-> System.out.println("city "+key+" "+"Student"+value));*/
       /* System.out.println("Student list after forward sorting");
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println(studentList);
        System.out.println("Student list after reverse sorting");
        studentList.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println(studentList);
        Comparator<Student> studentComparator=Comparator.comparing(Student::getCity).thenComparing(Student::getName);
        studentList.sort(studentComparator);
        System.out.println(studentList);*/
        List<Student> list=studentList.stream().filter(i->i.city=="Pune").collect(Collectors.toList());
        System.out.println(list);
    }

}