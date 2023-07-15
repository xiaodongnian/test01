package Text01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sanshuzhihe {
    public static void main(String[] args) {
        int[] nums={-1,0,5,3,-3,-2,-4};
        System.out.println(threeSum(nums));

    }public static List<List<Integer>> threeSum(int[] nums) {
        List list=new ArrayList();
        Arrays.sort(nums);
        int length=nums.length;
        if(nums==null||length<3){
            return list;
        }
        for (int i=0;i<length;i++){
            int l=i+1;
            int r=length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }if(nums[i]>0){
                break;
            }
            while(l<r){


                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]){
                        l++;
                    }while(l<r&&nums[r]==nums[r-1]){
                        r--;
                    }r--;l++;
                }else{
                    if(sum<0){
                        l++;
                    }if(sum>0) {
                        r--;
                    }
                }
            }
        }return list;


    }
}
