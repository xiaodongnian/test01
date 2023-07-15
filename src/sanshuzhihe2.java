import java.util.Arrays;

public class sanshuzhihe2 {
    public static void main(String[] args) {
        sanshuzhihe2 sanshuzhihe2 = new sanshuzhihe2();

        int nums[]={1,1,1,1};
        int targer=0;
        System.out.println(sanshuzhihe2.threeSumClosest(nums,targer));

    }public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int min =100000;
        int len=nums.length;

        for(int i=0;i<len;++i){


            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }int r=len-1;
            int l=i+1;

            while(l<r){
                while(l>i+1&&l<r&&nums[l]==nums[l-1]){
                    l++;
                }while(r<len-1&&l<r&&nums[r]==nums[r+1]){
                    r--;
                }
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return target;

                }
                if(Math.abs(sum-target)<Math.abs(min-target)){
                    min=sum;
                }if(sum<target){

                l++;

                }else{

                r--;

                }
            }
        }return min;

    }
}
