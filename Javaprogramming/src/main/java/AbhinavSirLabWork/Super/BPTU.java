package Super;

public class BPTU {
    public static void main(String[] args) {
GET objX=new GET();
    }
}
class POST{
    POST(int a){
        System.out.println("This is Post constructor: "+a);
    }
    int b=90;
}
class GET extends POST{
    GET(){
        super(10);

        System.out.println("This is get constructor");
    }

}
