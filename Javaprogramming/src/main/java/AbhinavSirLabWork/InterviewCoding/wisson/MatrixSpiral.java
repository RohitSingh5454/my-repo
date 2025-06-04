package AbhinavSirLabWork.InterviewCoding.wisson;

public class MatrixSpiral {
    public static void main(String[] args) {
        int[][] inputMatrix  = new int[][]{ {1,    2,   3,  4,    5},
                {6,    7,   8,  9,   10},
                {11,  12,  13,  14,  15},
                {16,  17,  18,  19,  20}};
        spiralMatrix(inputMatrix);

        //output: [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
    }
    public static void spiralMatrix(int[][] input){
        int top=0;
        int x=input.length;
        int y=input[0].length;
        System.out.println(y);
        int[] newArray=new int[x*y];
        int res=0;
        int bottom=input.length-1;
        int left=0;
        int right=input[0].length-1;
    }
}
