public class Search_In_Rotated_Array {

     public int search(int[] nums, int tar) {
        
        int lo=0;
        int hi=nums.length-1;

        while(lo<=hi){

            int mid=lo+(hi-lo)/2;
            if(nums[mid]==tar){
                return mid;
            }else if(nums[mid]>=nums[lo]){

                if(tar>=nums[lo]&&tar<nums[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else if(nums[mid]<=nums[hi]){
                if(tar>nums[mid]&&tar<=nums[hi]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}