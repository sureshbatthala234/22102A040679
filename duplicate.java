import java.util.*;
public class duplicate {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,1,2};
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int x=map.get(arr[i]);
                map.put(arr[i],x+1);
            }
            else
            map.put(arr[i],1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
