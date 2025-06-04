package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab791 {
    public static void main(String[] args) {
        List l1=new ArrayList<>();
        l1.add("Arjit");
        l1.add("KK");
        l1.add("ShankarMahadevan");
        l1.add("KishoreKumar");
        l1.add("MohammadRafi");
        int ind=l1.indexOf("KK");
        System.out.println(ind);
        int indLast= l1.lastIndexOf("MohammadRafi");
        System.out.println(indLast);
    }
}
