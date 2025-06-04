package AbhinavSirLabWork.Collection.Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab819 {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet<>(new demo());
        treeSet.add(new Animal(1,"Dinasour"));
        treeSet.add(new Animal(4,"Cat"));
        treeSet.add(new Animal(2,"Dog"));
        treeSet.add(new Animal(3,"Lion"));
        Iterator it=treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Animal{
    int id;
    String name;
    Animal(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
class demo implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Animal && o2 instanceof Animal){
            Animal an=(Animal) o1;
            Animal an1=(Animal) o2;
            return an1.name.compareTo(an.name);
        }
        return 0;
    }
}

