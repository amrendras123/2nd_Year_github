class QuickSort{

    public static void main(String[] args) {
        int[] arr={5,1,2,34,5,6,78,9,9,0,9,8,76,5,54,43,12};
        print(arr);
        Quick(arr, 0, arr.length-1);
        print(arr);
    }
    public static void Quick(int[] arr,int lo,int hi){
       if(lo>=hi){
        return ;
       }
        int idx=part(arr, lo, hi);//{partition}
        Quick(arr, lo, idx-1);
        Quick(arr, idx+1, hi);
    }
    public static int part(int[] arr,int lo,int hi){
        int pivot=arr[hi];
        int idx=lo;
        for(int i=lo;i<hi;i++){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=arr[idx];
               arr[idx]=temp;
               idx++;       
          }
        }
        int temp=arr[idx];
        arr[idx]=pivot;
        arr[hi]=temp;

        return idx;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("&**************************");
    }
}