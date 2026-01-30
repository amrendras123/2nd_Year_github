public class ProductExceptitself {

      public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]*nums[i];
        }
        int[] suff=new int[n];
        suff[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            
            if(i==0){
                ans[i]=suff[i+1];
            }else if(i==n-1){
                ans[i]=pref[i-1];
            }else{
                ans[i]=pref[i-1]*suff[i+1];
            }
        }
        return ans;
    }
}