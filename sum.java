public class sum {
    public static void main(String args[]){
        int[] arr={3,1,5,9,4,2};
        int n=arr.length;
        int sum=0;
        int i=0;
        int j=1;
        int k=2;
        while(k<n){
            int s=arr[i]+arr[j]+arr[k];
            if(s>sum)
            sum=s;
            i++;
            j++;
            k++;
        }
        System.out.print(sum);
    }
}
