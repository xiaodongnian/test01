import java.util.Arrays;

public class Oneplus {
    public static void main(String[] args) {
        Oneplus oneplus=new Oneplus();
        int[] digits={1,2,3,4};
        System.out.println(Arrays.toString(oneplus.plusOne(digits)));

    }
        public int[] plusOne(int[] digits) {
            int n=digits.length;
            for(int i=n-1;i>=0;i--){
                if(digits[i]!=9){
                    digits[i]=digits[i]+1;
                    for(int j=i+1;j<n;j++){
                        digits[j]=0;

                    }return digits;
                }
            }int[] h=new int[n+1];
            h[0]=1;
            return h;

        }
    }