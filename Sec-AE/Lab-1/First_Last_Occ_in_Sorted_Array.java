public class First_Last_Occ_in_Sorted_Array {

     public int[] searchRange(int[] nums, int tar) {
        int[] res=new int[2];

        int lo=0;
        int hi=nums.length-1;
        int ans=-1;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==tar){
                ans=mid;
                hi=mid-1;
            }else if(nums[mid]>tar){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        res[0]=ans;
        lo=0;
        hi=nums.length-1;
        ans=-1;
         while(lo<=hi){//last occurance
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==tar){
                ans=mid;
                lo=mid+1;
            }else if(nums[mid]>tar){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        res[1]=ans;
        return res;
    }
}