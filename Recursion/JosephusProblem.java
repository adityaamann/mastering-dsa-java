public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int sol = jos(n,k);
        System.out.println(sol);
    }

    static int jos(int n, int k){
        if(n==1){
            return 0;
        } else{
            return (jos(n-1,k)+k)%n;
        }

    }
}


