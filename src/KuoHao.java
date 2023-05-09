import java.util.Stack;

public class KuoHao {
    public static void main(String[] args) {
        KuoHao j=new KuoHao();
        String s="([]])";
        System.out.println(j.isValid(s));
    }public boolean isValid(String s) {
        Stack<Character>hh=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                hh.push(ch);
                continue;
            }
            if(hh.empty()){
                return false;
            }char m=hh.pop();
            if(ch==')'&&m=='('){
                continue;
            }if(ch=='}'&& m=='{'){
                continue;
            }if(ch==']'&&m=='['){
                continue;
            }return false;

        }if(hh.empty()){
            return true;
        }return false;
    }
}



