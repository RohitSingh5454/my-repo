package Super;

public class NO {
    public static void main(String[] args) {
    new MP().show();
    }
}
class BP{

}
class MP extends  BP{
    int k=45;
   void show(){

       System.out.println(k);
       System.out.println(this.k);
      // System.out.println(super.k);
   }

}
