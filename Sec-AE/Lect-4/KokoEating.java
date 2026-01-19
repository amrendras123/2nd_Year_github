public class KokoEating {

     public int minEatingSpeed(int[] nums, int h) {
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int lo=1;
        int hi=max;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long hr=0;
            for(int i=0;i<nums.length;i++){
                hr+=(int)Math.ceil((nums[i]*1.0)/mid);
            }
            if(hr<=h){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}