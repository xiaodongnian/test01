public class XuanZhuanTuPian {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9,}};
        int[][]m=rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            System.out.print("{"+" ");
            for(int j=0;j<matrix.length;j++){

                System.out.print(m[i][j]+" ");
            }
            System.out.print("}"+" ");
        }


    } public static int[][] rotate(int[][] matrix) {
        int n=matrix.length;
        int[][]result=new int[n][n];

        for(int i=0;i<n;i++){

            for(int j=n-1;j>=0;j--){
                result[i][n-j-1]= matrix[j][i];
            }
        }return result;

    }
}

