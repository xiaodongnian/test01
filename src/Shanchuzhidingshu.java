public class Shanchuzhidingshu {
    public static void main(String[] args) {
        Shanchuzhidingshu shanchuzhidingshu=new Shanchuzhidingshu();
        int[] nums={1,2,3,4,5,6};
        int val=3;
        System.out.println(shanchuzhidingshu.removeElement(nums ,val));

    }public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(i<n){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }i++;
        }return j;

    }
}
