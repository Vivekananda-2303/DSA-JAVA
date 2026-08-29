package Array;
import java.util.Arrays;
public class Merge2Array {
    public static int [] merging(int[]a,int[]b){
        int merged[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            merged[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            merged[a.length+j]=b[j];
        }
        return merged;
    }
    public static void main(String []args){
        int []a={3,4,2,6,1};
        int [] b={8,4,3,6,7};
        int result[]= merging(a,b);
        System.out.println(Arrays.toString(result));
    }
}
