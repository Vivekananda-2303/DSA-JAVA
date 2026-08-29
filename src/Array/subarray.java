package Array;

public class subarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
       /*0(n^3)
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
        */

        //maximum sum of subarray 0(n^3)
      /*  int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }

        }
        System.out.println(max);
        */

        //maximum sum of subarray 0(n^2)
     /*   int maxsum=0;
        for(int i=0;i<a.length;i++){
            int currsum=0;
            for(int j=i;j<a.length;j++){
                currsum+=a[j];
                maxsum= Math.max(currsum,maxsum);
            }

        }
        System.out.println(maxsum);

      */

        //maximum sum of subarray (kadane's algorithm =0(n))
     /*
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int n:a){
            curr= Math.max(curr,curr+n);
            max=Math.max(max,curr);
        }
        System.out.println(max);
        */
// maximum length of contigous  subarray
        int maxLength=0;
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[i]-1==a[i-1]){
                count++;
            }
            else {
                maxLength = Math.max(maxLength, count);
                count = 1;
            }
        }
        maxLength=Math.max(maxLength,count);
        System.out.println(count);
    }
}

