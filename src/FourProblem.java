public class FourProblem {
    public static void main(String[] args) {
        FourProblem fourProblem=new FourProblem();
        int[]nums1=new int[]{1,3,};
        int[]nums2=new int[]{2,4,5};
        System.out.println(fourProblem.findMedianSortedArrays(nums1,nums2));

    }public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]nums3=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n&&j<m){
            if(  nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }else{
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }if(i==n){
            for(int b=j;b<m;b++){
                nums3[k]=nums2[b];
                k++;
            }
        }if(j==m){
            for(int o=i;o<n;o++){
                nums3[k]=nums1[o];
                k++;
            }
        }if((m+n)%2==0){
            int p=nums3[(m+n)/2];
            int q=nums3[(m+n)/2-1];
            double  g=(p+(double)q)/2;
            return g;
        }else{
            double h=nums3[k/2];
            return h;
        }

    }
}

