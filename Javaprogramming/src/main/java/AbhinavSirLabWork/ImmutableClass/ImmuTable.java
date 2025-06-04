package AbhinavSirLabWork.ImmutableClass;

public class ImmuTable {
    public static void main(String[] args) {
        Imply obj1=new Imply(2,"Raman","Businessman",76);
        System.out.println(obj1);

    }
}
final class Imply{
    private final int id;
    private final String name;
    private final String jobRole;
    private final int rollNo;
    Imply(int id,String name,String jobRole,int rollNo){
        this.id=id;
        this.name=name;
        this.jobRole=jobRole;
        this.rollNo=rollNo;
    }
    public int getId(){
        return id;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getJobRole(){
        return jobRole;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "id:"+id +" "+"name: "+name+" "+"jobrole: "+jobRole+" "+"rollno :"+rollNo;

}}