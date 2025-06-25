public class minmax {
    public static void main(String args[]){
        int[] arr={4,1,8,10,2};
        int n=arr.length;
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n-1;i++){
            if(min>arr[i])
            min=arr[i];
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println(max);
        System.out.print(min);
    }
}
