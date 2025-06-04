package AbhinavSirLabWork.Exception;

public class Lab737 {
    public static void main(String[] args) {
        System.out.println("main started");
        String nm="";
        try {
            StudentService studentService=new StudentService();
            nm=studentService.getNameById("Jlc-008");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main completed");
    }
}
class EmptySidException extends RuntimeException{
}
class StudentService{
    String getNameById(String sid){
        if (sid==null){
            throw new NullPointerException();
        } else if (sid.isEmpty()) {
            throw new EmptySidException();
        } else if (sid.equals("Jlc-008")) {
            return "Srinivas";
        }
        else {
            throw new StudentNotFoundException(sid);
        }
    }
}
class StudentNotFoundException extends RuntimeException{
    StudentNotFoundException(String sid){
        super(sid);
    }
}