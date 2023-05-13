public class Zhaoweizhi {
    public static void main(String[] args) {
        Zhaoweizhi u=new Zhaoweizhi();
        int[] nums={1,2,3,4,5,6};
        int q=7;
        System.out.println(u.hhh(nums,q));

    }public int hhh(int[] nums,int q){
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]>=q){
                return i;
            }i++;
        }return i;
    }
}
