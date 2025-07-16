public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 9;
        int length = 5;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int index = 2;

        for(int i=index;i<length-1;i++) {
            arr[i] = arr[i + 1];
        }
        length-- ;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
