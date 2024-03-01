import java.util.*;

class Kth{
    public static void main (String args[]){
      int arr[]={10,40,37,46};
      int k =3;
      int n = arr.length;
      Arrays.sort(arr);
      System.out.println(arr[n-k]);
    }
}