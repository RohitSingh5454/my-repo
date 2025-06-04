package AbhinavSirLabWork.Mock_Priyo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        List<Doctor> doctorList= Arrays.asList(new Doctor(1,"Shivakant",325000.50,
                new Address(531200,"P","Shanti",3)),
                new Doctor(2,"Nishikant",414000.21,new Address(560073,"D","Tripathi",12)),
                new Doctor(3,"Ravi",512000.45,new Address(765007,"E","Vaishnav Apartment",17)),
                new Doctor(4,"Piyush",214000,new Address(65237,"K","Ritikrirti Apartment",13)));

                //sort by ascending order

               Stream<Doctor> comparingBySalary=doctorList.stream().sorted(Comparator.comparingDouble(Doctor::getdSalary));
              List<Doctor> doctorList1=comparingBySalary.toList();
               System.out.println(doctorList1);

               // sort by descending

             List <Doctor> reverseSorting=doctorList1.stream().sorted((i,v)-> (int) (v.getdSalary()-i.getdSalary())).toList();
             System.out.println(reverseSorting);


             /*  List<Doctor> comparingSalaryDescending=doctorList.stream().
                       sorted(Comparator.comparingDouble(Doctor::getdSalary)).toList();
        System.out.println(comparingSalaryDescending);*/





    }

}
