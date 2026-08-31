package Array;
import java.util.Arrays;
public class Merge2Array {
   /*
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

    */
     // merge in zigzag
    public static int[] zigzag(int []a,int b[]){
         int [] c= new int[a.length+b.length];
         int i=0,j=0,k=0;
         while(i<a.length && j<b.length){
             c[k++]=a[i++];
             c[k++]=b[j++];
         }
         while(i<a.length){
             c[k++]=a[i++];
         }
         while(j<b.length){
             c[k++]=b[j++];
         }
         return c;
    }
    public static int[]sorted(int []a,int[]b){
        int []c= new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length  && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else
                c[k++]=b[j++];
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        return c;
    }
    public static void main(String []args){
        int []a={3,4,2,6,1};
        int [] b={8,4,3,6,7};

        System.out.println(Arrays.toString(sorted(a,b)));


    }
}
