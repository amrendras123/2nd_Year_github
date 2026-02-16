public class QuickSort {

    public static void main(String[] args) {
        int[] arr={3,4,565,6,6,43,2,22,3,5,6,6,7,8};
        print(arr);
        part(arr, 0, arr.length-1);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void quickSort(int[] arr,int lo,int hi){

        if(lo>=hi){
            return ;
        }

        int idx=part(arr, lo, hi);
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);
    }
    public static int part(int[] arr,int lo,int hi){

        int pivot=arr[hi];
        int idx=lo;
        for(int i=lo;i<hi;i++){

            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        for(int i=lo;i<=hi;i++){
            System.out.print(arr[i]+" ");
        }
        return idx;
    }
}
