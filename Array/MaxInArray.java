public class MaxInArray {
    public static void main(String[] args) {
          int[] arr = {1,32,22,2,7,4};
          int max = arr[0];
          for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                  max = arr[i];
              }
          }
          System.out.println("Max value: "+max);
    }
}
