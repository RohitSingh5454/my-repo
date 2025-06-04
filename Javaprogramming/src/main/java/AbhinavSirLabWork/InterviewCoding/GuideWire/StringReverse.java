package AbhinavSirLabWork.InterviewCoding.GuideWire;

public class StringReverse {
    public static void main(String[] args) {
        String str="Rohit";
        //System.out.println(str.substring(str.length()-1,0));
        StringReverse ob=new StringReverse();
        ob.printString(str,1);
    }
    public void printString(String s,int x){
        if (x>100){
            return;
        }
        System.out.println(s);
        printString(s,x+1);
    }
}
