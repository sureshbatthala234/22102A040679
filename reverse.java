public class reverse {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int[] a=new int[n];
        int c=n;
        for(int i=0;i<n;i++){
            a[i]=arr[c-1];
            c=c-1;
            
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
