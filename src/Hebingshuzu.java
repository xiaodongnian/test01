import java.util.Arrays;

public class Hebingshuzu {
    public static void main(String[] args)  {
        int[]nums1={1,2,3,4,5,6};
        int m=6;
        int[]nums2={1,2,3,4,5,6,7};
        int n=7;
        int[] lll = new int[m + n];
        int q = 0, p = 0;
        int cur;
        while (q < m || p < n) {
            if (q == m) {
                cur = nums2[p];
                p++;
            }
            else if (p == n) {
                cur = nums1[q];
                q++;
            }
            else if (nums1[q] <= nums2[p]) {
                cur = nums1[q];
                q++;

            } else{

                cur=nums2[p];
                p++;
            }
            lll[q+p-1]=cur;
        }

        for (int i = 0; i <= m + n; i++) {
            System.out.print(lll[i]+" ");
        }



    }
}