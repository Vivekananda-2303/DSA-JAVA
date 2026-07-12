package Array;
public class Binarysearch {
    static int binarySearch(int []arr,int target){
        int l=0;
        int h=arr.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target)
                return mid;
            else if (target>arr[mid])
                l=mid+1;
            else
                h=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int target=40;
        int index=binarySearch(arr,target);
        if(index !=-1){
            System.out.println("found in index" + index);
        }
        else
            System.out.println(" element not found");
    }
}
