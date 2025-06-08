public class N_one {
    public static void main(String[] args) {
        int n = 1;
        int N = 5;
        fun(n,N);
    }
    static void fun(int i,int N){
        if(i>N)   return;
        fun(i+1,N);
        System.out.println(i);
    }
}
