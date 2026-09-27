package Sorting;
import java.util.*;

public class selection {

    // Correct swap
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

        // Selection Sort
        for(int i = 0; i <= n - 2; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            // swap AFTER finding min
            swap(arr, i, min);
        }

        System.out.println(Arrays.toString(arr));
    }
}
