public class Dancingzifu {
    public static void main(String[] args) {
        Dancingzifu dancingzifu=new Dancingzifu();
        String s="hello world ";
        System.out.println(dancingzifu.lengthOfLastWord(s));

    }public int lengthOfLastWord(String s){
        if(s.length()==0){
            return 0;
        }
        int n=s.length()-1;

        for (int i=n;i>=0;i--){
            if (s.charAt(i)!=' '){

                break;
            }n--;
        }int k=n;
        for(int j=k;j>=0;j--){
            if (s.charAt(j)==' '){
                break;
            }k--;
        }return n-k;
    }
}
