public class ReverseArr_singlePointer {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    fun(arr,0);
    for (int num : arr) {
        System.out.print(num + " ");
     }
    }
    static void fun(int[]arr, int i){
        int n = arr.length;
        if(i >= n/2)return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        fun(arr, i + 1);
    }
}
