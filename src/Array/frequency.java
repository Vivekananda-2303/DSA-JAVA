package Array;
import java.util.*;
public class frequency {
    public static void main(String []args){
        int[] a = {4, 2, 4, 3, 2, 4, 1};
        /*
        time complexity =o(n^2),space=o(n)
        boolean []visited= new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(visited[i]==false){
                int count =1;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println(a[i]+" ->"+ count);// for freguency
                //for duplicate  element
                if(count >1){
                    System.out.println(a[i]);
                }
                // for unique element
                if(count==1){
                    System.out.println(a[i]);
                }
                // for  1st non- repetative element
                if(count==1){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
*/
        //using HashMap =a(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int n : a){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // print frequency
        System.out.println("Frequency:");
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // print duplicates
        System.out.println("Duplicates:");
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                System.out.println(e.getKey());
            }
        }

        // print unique elements
        System.out.println("Unique:");
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                System.out.println(e.getKey());
            }
        }

        // first non-repeating
        System.out.println("First Non-Repeating:");
        for(int n : a){
            if(map.get(n) == 1){
                System.out.println(n);
                break;
            }
        }
    }
}
