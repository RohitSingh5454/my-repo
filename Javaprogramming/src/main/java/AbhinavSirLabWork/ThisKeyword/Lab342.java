package AbhinavSirLabWork.ThisKeyword;

public class Lab342 {
    public static void main(String[] args) {
XYZ obj1=new XYZ(12,"Yuvraj");
obj1.Boom();
    }
}

class XYZ{
    int sid;
    String sname;
    XYZ(int sid,String sname){
     this.sid=sid;
     this.sname=sname;
   /*  sid=sid;
     sname=sname;*/  //both is not possible
    }
    void Boom(){
        System.out.println("Result is : "+sid+"\t"+sname);
    }
}
