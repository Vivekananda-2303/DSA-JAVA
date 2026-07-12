package Array;

import java.util.Arrays;
public class reverseArray {
    static  int [] reverse(int[]a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return  a;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        System.out.println(Arrays.toString(reverse(a)));
    }
}
