package AbhinavSirLabWork.InterviewCoding.ibm;

public class StringContainingChar {
    public static void main(String[] args) {
        // print the string which contains char a and print the count
        String[] array={"apples","are","red"};
        int count=0;
        for (int i=0;i<array.length;i++){
            String str=array[i];
            str.split("");
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
