public class Capacity_ToShip_Within_D_Day {

      public int shipWithinDays(int[] weights, int days) {
        
        int max=0,sum=0;
        
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        
        int lo=max,hi=sum,ans=-1;
        while(lo<=hi){
            
            int mid=lo+(hi-lo)/2;
            int d=1;
            int csum=0;
            for(int i=0;i<weights.length;i++){
                
                csum+=weights[i];
                
                if(csum>mid){
                    csum=weights[i];
                    d++;    
                }
            }
            if(d<=days){
                hi=mid-1;
                ans=mid;
            }else{
                lo=mid+1;
                
            }
        }
        return ans;
    }
}