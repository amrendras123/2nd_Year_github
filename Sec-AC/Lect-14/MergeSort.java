class MergeSort{
    public static void main(String[] args) {
        
        int[] arr={6,8,1,2,3,5,9,7,0,5,6,7,8,8,9,10};

        Divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Divide(int[] arr,int lo,int hi){
        if(lo>=hi){
            return ;
        }

        int mid=(lo+hi)/2;
        Divide(arr, lo, mid);
        Divide(arr, mid+1, hi);
        Merge(arr,lo,mid,hi);

    }
    public static void Merge(int[] arr,int lo,int mid,int hi){
        int[] ans=new int[hi-lo+1];
        int i=lo;
        int j=mid+1;
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
        //copy value to original array 
        int idx=0;
        for(int id=lo;id<=hi;id++){
              arr[id]=ans[idx];
              idx++;
        }

    }
}