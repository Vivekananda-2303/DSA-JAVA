package Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       for(int i=n-1;i>=1;i--){
           int didswap=0;
           for(int j=0;j<=i-1;j++){
               if(arr[j]>arr[j+1]){
                   swap(arr,j,j+1);
                   didswap=1;
               }
           }
           if(didswap==0){
               break;
           }
       }

        System.out.println(Arrays.toString(arr));
    }
}
