public class ReverseArr_twoPointer {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n =arr.length;
        fun(arr,0,n-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    static void fun(int[] arr, int left, int right){
        if(left>= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        fun(arr,left+1, right-1);
    }
}
