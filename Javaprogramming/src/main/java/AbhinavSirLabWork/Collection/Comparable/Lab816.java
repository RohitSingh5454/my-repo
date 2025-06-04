package AbhinavSirLabWork.Collection.Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab816 {
    public static void main(String[] args) {
        Object obj=new Abc(7,"kamal");
        TreeSet ts2 = new TreeSet<>();
        ts2.add(new Abc(6,"Saka"));
        ts2.add(new Abc(2, "Raka"));
        ts2.add(new Abc(4, "Sachin"));
        ts2.add(new Abc(5, "naman"));
        Iterator it=ts2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
    class Abc implements Comparable {
        int id;
        String name;

        Abc(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int compareTo(Object obh) {
            if (obh instanceof Abc) {
                Abc ref = (Abc) obh;
                return this.id - ref.id;
            }
            return 0;
        }
        public String toString(){
            return id+" "+name;
        }
    }