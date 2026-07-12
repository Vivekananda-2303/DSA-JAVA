package Array;

import java.util.Arrays;

public class movezero {
    static int[] moveZeoAtEnd(int []a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]= temp;
                j++;
            }
        }return a;
    }
    public static void main(String[] args) {
        int a[]={4,5,0,2,0,8,1};
        System.out.println(Arrays.toString(moveZeoAtEnd(a)));
    }
}

