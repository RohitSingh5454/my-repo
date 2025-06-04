package AbhinavSirLabWork.InterviewCoding.Delloite;

public class maxElement2DArray {
    public static void main(String[] args) {
        int[][] array={{1,2,3}
                      ,{6,5,4},
                       {7,8,9}};
        int max_element=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            for (int j=i;j<array[i].length;j++){
                if (array[i][j]>max_element){
                    max_element=array[i][j];
                }
            }
        }
        System.out.println(max_element);
    }
}
