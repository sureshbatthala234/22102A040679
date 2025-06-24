public class arrayaddition {
    public static void main(String args[]){
        int[] arr1={1,2,3,4,5};
        int[] arr2={5,6,7,8,9,10};
        int[] arr3=new int[5];
        for(int i=0;i<5;i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<5;i++)
        System.out.print(arr3[i]+" ");
    }
}
