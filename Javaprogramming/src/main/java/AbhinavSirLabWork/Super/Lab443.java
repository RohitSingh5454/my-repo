package AbhinavSirLabWork.Super;

import AbhinavSirLabWork.Packages.Package1.Hi;

public class Lab443 {
    public static void main(String[] args) {

    }
}
class Hike{
    static int a=34;
}
class Promote extends Hike {
    static int a=45;
    public static void show(){
        int a=78;
        System.out.println(a);
        //System.out.println(this.a);  // not possible because super and this cannot be referred from static context
        //System.out.println(super.a);
    }
}
