package AbhinavSirLabWork.Collection.Comparable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class gfgExample implements Comparable<gfgExample>{
    int id;
    String name;
    gfgExample(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(gfgExample ob) {
        if (this.name.compareTo(ob.name)!=0){
            return this.name.compareTo(ob.name);
        }
        else {
            return this.id-ob.id;
        }
    }
    public String toString(){
        return id+" "+name;
    }
}
class Product{
    public static void main(String[] args) {
         gfgExample[] array=new gfgExample[4];
         array[0]=new gfgExample(3,"abc") ;
         array[1]=new gfgExample(4,"a");
         array[2]=new gfgExample(5,"bc");
         array[3]=new gfgExample(2,"a");
        Arrays.sort(array);
        arrayManipulate(array);
        }
        public static void arrayManipulate(gfgExample[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}