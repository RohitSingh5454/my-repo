package AbhinavSirLabWork.Constructor;

public class Xyz {
    public static void main(String[] args) {
        Bo obj=new Bo();
        obj.spot();
        Bo obj1=new Bo(22,"summand");
        obj1.spot();
        Bo obj2=new Bo(23,"do","box");
        obj2.spot();
    }
}
class Bo{
    int sid;
    String sname;
    String name;
    Bo() {
        System.out.println("default consturct");
    }
       Bo(int id,String sn) {
           System.out.println("this is 2 arg consturct");
           this.sid = id;
           this.sname = sn;
       }
       Bo(int sp,String ab,String nm) {
           System.out.println("this is 3- arg const");
           this.sid = sp;
           this.sname = ab;
           this.name = nm;
       }
       void spot(){
           System.out.println(sid+"\t"+sname+"\t"+name);


        }
    }


