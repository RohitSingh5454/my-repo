package AbhinavSirLabWork.Collection.Set;

import java.util.LinkedHashSet;

public class Lab810 {
    public static void main(String[] args) {
        LinkedHashSet sop=new LinkedHashSet<>();
        sop.add(new Stud(67));
        sop.add(new Stud(67));
        sop.add(new Stud(67));
        System.out.println(sop);

    }
}
class Stud{
    int sid;
    Stud(int id){
        sid=id;
    }
    public String toString(){
        return ""+sid;
    }
    public int hashCode(){
        System.out.println("***** hashcode *****");
        return sid;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("******equals method*******");
        if (obj instanceof Stud){
            Stud s1=(Stud)obj;
            return this.sid==s1.sid;
        }
        return false;
    }
}
