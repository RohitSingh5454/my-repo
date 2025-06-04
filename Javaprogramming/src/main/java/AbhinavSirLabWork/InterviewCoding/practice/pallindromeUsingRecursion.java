package AbhinavSirLabWork.InterviewCoding.practice;

public class pallindromeUsingRecursion {
    public static void main(String[] args) {
        String sr="ROTATOR";
        System.out.println(checkPallindrome(sr,"",sr.length()-1));
    }
    static String checkPallindrome(String s,String r,int n1){
        if (n1<0){
            return r;
        }
        return checkPallindrome(s,r+s.charAt(n1),n1-1);
    }
}
