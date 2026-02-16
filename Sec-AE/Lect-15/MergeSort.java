class MergeSort{
    public static void main(String[] args) {
        
      int[] arr={5,21,3,5,1,7,8,5,6,4,3,12};
        print(arr);
        divide(arr,0,arr.length-1);
        print(arr);
    }
    public static void print(int[]  arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("*********************");
    }
    public static void divide(int[] arr, int lo, int hi){
        if(lo>=hi){
            return ;
        }
        int mid=(lo+hi)/2;
        divide(arr, lo, mid);
        divide(arr, mid+1, hi);
        merge(arr, lo, mid, hi);
    }
    public static void merge(int[] arr,int lo,int mid,int hi){

        int i=lo;
        int j=mid+1;
        int[] ans=new int[hi-lo+1];
        int k=0;
        while(i<=mid&&j<=hi){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }else{
                ans[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
                i++;
                k++;
        }
        while(j<=hi){
            ans[k]=arr[j];
                j++;
                k++;
        }
        //copy value to the original array 
         int m2=0;
        for(int m=lo;m<=hi;m++){
          arr[m]=ans[m2];
          m2++;
        }

    }
}