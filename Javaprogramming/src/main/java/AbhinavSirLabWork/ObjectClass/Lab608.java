package AbhinavSirLabWork.ObjectClass;

public class Lab608 {
    public static void main(String[] args) {
        StudentCheck sc1=new StudentCheck(12,"Pankaj");
        StudentCheck sc2=new StudentCheck(87,"Kamal");
        StudentCheck sc3=new StudentCheck(87,"Lokesh");
        StudentCheck sc4=new StudentCheck(87,"Lokesh");
        System.out.println("Using ===== operator");
        System.out.println(sc1==sc2);
        System.out.println(sc2==sc3);
        System.out.println(sc3==sc4);
        System.out.println("Using equals operator");
        System.out.println(sc1.equals(sc2));
        System.out.println(sc2.equals(sc3));
        System.out.println(sc3.equals(sc4));


    }
}


class StudentCheck{
    int id;
    String name;
    StudentCheck(int id,String name){
        this.id=id;
        this.name=name;
    }

    //@Override
   public boolean equals(Object obj) {
        if (obj instanceof StudentCheck){
            StudentCheck st=(StudentCheck) obj;
            return this.id==st.id && this.name.equals(st.name);
        }
        return false;
    }
}
