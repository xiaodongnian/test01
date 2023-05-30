public class Pingjunzhibeisanzhengchu {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,6,9,12};
        System.out.println(averageValue(nums));
    }  public static int averageValue(int[] nums) {
        int k=0,sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0&&nums[i]%2==0){
                sum=sum+nums[i];
                k=k+1;
            }
        }if(k==0){
            return 0;
        }else{
            return sum/k;
        }



    }
}

