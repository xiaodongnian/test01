import java.util.HashMap;

public class Threeproblem {
    public static void main(String[] args) {
        Threeproblem threeproblem=new Threeproblem();
        String s="asdfazxcvbnma";
        System.out.println(threeproblem.lengthOfLongestSubstring(s));

    }public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> uu=new HashMap<Character,Integer>();
        int n=s.length();
        if(n==0){
            return 0;}
            int left=0;
            int max=0;
            for(int i=0;i<n;i++){
                if(uu.containsKey(s.charAt(i))){
                    left=Math.max(left,uu.get(s.charAt(i))+1);
                }
                uu.put(s.charAt(i),i);
                max=Math.max(max,i-left+1);
            }return max;



    }
}

