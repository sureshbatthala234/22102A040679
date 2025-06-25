public class numberofevenandven {
    public static void main(String args[]){
        int[] arr={11,12,13,89,56,78,21};
        int n=arr.length;
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
            even++;
            else
            odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
