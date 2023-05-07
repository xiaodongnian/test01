import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class LuomaNum2 {
    public static void main(String[] args) {
       LuomaNum k=new LuomaNum();
        System.out.println(k.romanToInt("MDCLXVI"));

    }



    public int romanToInt(String s){
        Map<Character,Integer>hhh=new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int sum=0;
        for (int i=0;i<s.length();i++){
            //int y=hhh.get(s.charAt(i));
            if (i<s.length()-1&&hhh.get(s.charAt(i))<hhh.get(s.charAt(i+1))){
                sum-=hhh.get(s.charAt(i));}else{
                sum+=hhh.get(s.charAt(i));
            }

            }return sum;
        }
    }

