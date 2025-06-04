package ObjectClass;

public class Lab602 {
    public static void main(String[] args) {

    }
}
class LomLom{

   int id;
   long no;

    public LomLom(int id, long no) {
        this.id = id;
        this.no = no;
    }
    public int Hashcode(){
        return (int) (no|id);
    }
}
