package AbhinavSirLabWork.javaConceptOfTheDay.string;

public class reverseString {
    public static void main(String[] args) {
        String str="Hello world";
        String rev="";
        String[] arr1=str.split(" ");
        for (int i=0;i<arr1.length;i++){
            String temp=arr1[i];
            String reverseWord="";
            for (int j=temp.length()-1;j>=0;j--){
                reverseWord=reverseWord+temp.charAt(j);
            }
            rev=rev+reverseWord+" ";
        }
        System.out.println(rev);
        int length1=str.length()/2;
        for (int i=0;i<str.length()/2;i++){
            rev=rev+str.charAt(length1);
            length1--;
        }
        System.out.println(rev);

}}
