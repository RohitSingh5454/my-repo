package Java8_150Coding;

import java.util.HashSet;
import java.util.Set;

public class FindCommonIn2Array {
    public static void main(String[] args) {
        String[] str1={"java","interview","programming","questions","object","platform dependent"};
        String[] str2={"java","interview","programming","questions"};
        Set<String> output=new HashSet<>();
        for (int i=0;i<str1.length;i++){
            for (int j=0;j<str2.length;j++){
                if (str1[i]==str2[j]){
                   output.add(str2[j]);
                   break;
                }
            }
        }
        for (String s:output){
            System.out.println(s);
        }

    }
}
