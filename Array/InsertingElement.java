public class InsertingElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 9;
        int n = 5;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x = 20;
        int index = 3;

        for(int i=n;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        n++;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
