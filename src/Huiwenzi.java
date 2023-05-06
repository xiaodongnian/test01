public class Huiwenzi {
    public static void main(String[] args) {

        Huiwenzi a=new Huiwenzi();
        boolean p=a.isPalindrome(99999);

        System.out.println(p);


    }

    public  boolean isPalindrome(int x){
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }else {
            int k=0;
            while(x>k){
                k=k*10+x%10;
                x=x/10;
            }return x==k||x==k/10;
        }
    }
}
