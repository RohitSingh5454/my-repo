package Java8_150Coding;

public class TwoInterfaceProblem {
    interface Addition{
        public int twoNo(int a, int b);
    }
    interface Message{
        public String getMessage(String str);
    }
    public int add(int a,int b,Addition obj){
        return obj.twoNo(a,b);
    }

    public static void main(String[] args) {
      Addition sum=(x,y)->x+y;
      Addition multiply=(x,y)->x*y;
      TwoInterfaceProblem ob=new TwoInterfaceProblem();
        System.out.println("Addition is "+ob.add(21,12,sum));
        System.out.println("Multiply is "+ob.add(3,6,multiply));
    }
}
