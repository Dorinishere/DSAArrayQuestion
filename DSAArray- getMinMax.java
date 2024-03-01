import java.util.Arrays;

class DSAArray{

    static void  getMaxMin(int arr[]){
        if(arr==null||arr.length==0) return;
        int min= arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
         min = Math.min(min, arr[i]);
         max= Math.max(max, arr[i]);
        }
        System.out.println(min+ " minimum element in array");
        System.out.println(max + " maximum element in array");
}
public static void main (String args[]){
  int arr[]={1,2,3,4,5,6,7};
  getMaxMin(arr);
 
    }
}
