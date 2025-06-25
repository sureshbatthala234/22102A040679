public class sorting {
    public static boolean sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr={2,4,5,8,9};
        System.out.println(sort(arr));
    }
}
