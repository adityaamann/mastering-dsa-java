public class SecondLargest {
    public static void main(String[] args) {
           int[] arr = {1,32,2,4,22,7};
           int max1,max2;
           max1=max2=arr[0];
           for(int i=0;i<arr.length;i++){
               if(arr[i]>max1){
                   max2=max1;
                   max1=arr[i];
               }
               else if(arr[i]<max1 && arr[i]>max2){
                   max2=arr[i];
               }
           }
           System.out.println("Second largest is: "+max2);
    }
}
