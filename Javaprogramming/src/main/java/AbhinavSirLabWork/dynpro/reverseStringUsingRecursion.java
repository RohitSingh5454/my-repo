package AbhinavSirLabWork.dynpro;

public class reverseStringUsingRecursion {
    public static void main(String[] args) {
        String str="ROTATOR";
       String str1= recursiveCall(str,"",str.length()-1);
       if (str.equals(str1)){
           System.out.println("It is pallindrome string");
       }
       else {
           System.out.println("It is not pallindrome string");
       }
    }
    public static String recursiveCall(String s,String r,int i){
        if (i<0){
            return r;
        }
        return recursiveCall(s,r+s.charAt(i),i-1);
    }
}
