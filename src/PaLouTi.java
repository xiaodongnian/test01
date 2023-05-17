public class PaLouTi {
    public static void main(String[] args) {
        PaLouTi paLouTi=new PaLouTi();
        System.out.println(paLouTi.hhh(5));

    }public int hhh(int n){
        int a=0,b=0,c=1;
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=b+a;
        }return c;
    }
}
