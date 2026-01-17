public class CapacityToShip {
     public int shipWithinDays(int[] arr, int days) {
        
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int ans=-1;

        int lo=max;
        int hi=sum;
        while(lo<=hi){

            int mid=lo+(hi-lo)/2;
            int csum=0;
            int d=1;
            for(int i=0;i<arr.length;i++){
                csum+=arr[i];
                if(csum>mid){
                    csum=arr[i];
                    d++;

                }
            }
            if(d<=days){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
