public class PingFangGen {
    public static void main(String[] args) {
        PingFangGen pingFangGen=new PingFangGen();

        int x=9;
        System.out.println(pingFangGen.uu(x));

    }public int uu(int x){
        int l=0,r=x,ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid<=x){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }return ans;
    }
}
