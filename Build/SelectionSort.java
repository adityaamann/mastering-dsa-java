public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");}
    }

     static void selectionSort(int[]arr) {
         for (int i = 0; i < arr.length - 1; i++) {
             int minIndex = i;
             for (int j = i+1; j < arr.length; j++) {
                 if (arr[j] < arr[minIndex]) {
                     minIndex = j;
                 }
             }
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
         }
     }
}
