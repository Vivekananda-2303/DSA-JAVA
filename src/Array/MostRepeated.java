package Array;

import java.util.HashMap;
import java.util.Map;

public class MostRepeated {
    public static void main(String[] args) {
        int[] a = {4, 2, 4, 3, 2, 4, 1};
/*

        int maxcount = 0;
        int result = a[0];
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (visited[i] == false) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                if(count >maxcount){
                    maxcount=count;
                    result=a[i];
                }

            }
        }
        System.out.println(result);

 */
        //using hashMap

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int n:a){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int maxcount=0;
        int result=0;
        for(Map.Entry<Integer,Integer>e: map.entrySet()){
            if(e.getValue() >maxcount){
                maxcount =e.getValue();
                result=e.getKey();
            }
        }
        System.out.println(result +" ->"+ maxcount);
    }
}