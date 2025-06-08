public class one_N {
    public static void main(String[] args) {
        int n = 5;
        int N = 5;
        fun(n,N);
    }
    static void fun(int i,int N){
        if(i<1)   return;
        fun(i-1,N);
        System.out.println(i);
    }
}
