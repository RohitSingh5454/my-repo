package AbhinavSirLabWork.Cloning;

public class shallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
       Student ob1=new Student();
       ob1.rollNo=3;
        Address address=new Address();
        address.addressId=45;
        ob1.address=address;
       Student ob2=(Student) ob1.clone();
       ob2.address.addressId=98;

       ob2.rollNo=4;
        System.out.println(ob1.rollNo +" "+ ob2.rollNo);
        System.out.println(ob1.address.addressId +" "+ob2.address.addressId);
    }
}
class Student implements Cloneable{
    int rollNo;
    Address address;
    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student=(Student)super. clone();
        student.address=(Address) address.clone();
        return student;
    }

}
class Address implements Cloneable{
    int addressId;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
