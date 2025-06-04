package AbhinavSirLabWork.InterviewCoding.ibm;

public class permutationAndCombination {
    public static void main(String[] args) {
        String str="abc";
        permutation(str.toCharArray(),0);
    }
    public static void permutation(char[] array,int fi){
        if (fi== array.length-1){
            System.out.println(array);
            return;
        }
        for (int i=fi;i< array.length;i++){
            swap(array,i,fi);
            permutation(array,fi+1);
            swap(array,i,fi);
        }
    }
    public static void swap(char[] array,int x,int y){
        char temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
}
