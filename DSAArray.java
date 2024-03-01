import java.util.Arrays;

class DSAArray{

    static void  reverseArray(int arr[],int start, int end){
        //0-4,1-3,2-2
        if(start>end) return;
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverseArray(arr, start+1, end-1);
}
public static void main (String args[]){
  int arr[]={1,2,3,4,5,6,7};
  int n =arr.length;
  reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
