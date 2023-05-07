
 public class LuomaNum {
    public static void main(String[] args) {
        LuomaNum L=new LuomaNum();
        System.out.println(L.romanToInt("IV"));
    }

 public int romanToInt(String s) {

        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int y=swi(s.charAt(i));

            if (i<n-1&&y<swi(s.charAt(i+1))){
                sum-=y;
            }else{
                sum+=y;
            }
        }return sum;

    }
    public   int swi(char k){
        switch (k){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
};
