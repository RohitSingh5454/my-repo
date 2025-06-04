package AbhinavSirLabWork.Exception;

public class Lab740 {
    public static void main(String[] args) throws StudentNotFoundException2 {
        Service service=new Service();
        service.getById("Jlc-008");
    }
}
class Service{
      String getById(String sid) throws StudentNotFoundException2 {
          if (sid==null || sid.equals("Jlc-008") || sid.isEmpty()){
              throw new StudentNotFoundException2(sid);
          }
          else {
              return "Srinivas";
          }
      }
}
class StudentNotFoundException2 extends Exception{
    StudentNotFoundException2(String sid)
    {
        super(sid);
    }
}