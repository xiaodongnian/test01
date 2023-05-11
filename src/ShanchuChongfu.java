import java.util.Arrays;

public class ShanchuChongfu {
    public static void main(String[] args) {
        ShanchuChongfu l=new ShanchuChongfu();
        int[] sums={1,2,3,3,4,4,5,5,5,5,6,6,6,9,9,9};


        System.out.println("数组为:"+Arrays.toString(l.kk(sums)));



    }public  int[] kk(int[] sums){
        int n= sums.length;
        int i=1;
        int j=1;
        while (i<n) {
            if(sums[i]!=sums[i-1]){
                sums[j]=sums[i];
                j++;
            }i++;
        }
       int[]f=new int[j];
        for (int q=0;q<f.length;q++){
            f[q]=sums[q];
        }
        return f;
    }
}
