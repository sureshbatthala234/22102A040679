import java.util.*;
public class removeelement {
    public static void main(String args[]){
        int[] arr={1,2,3,2,5,7,2};
        int target=2;
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=target){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
