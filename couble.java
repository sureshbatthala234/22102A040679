import java.util.*;
public class couble {
    public static void main(String args[]){
        int[] arr={2,7,11,15};
        int n=arr.length;
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        int target=9;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    answer.add(list);
                }
            }
        }
        System.out.print(answer);
    }
}
