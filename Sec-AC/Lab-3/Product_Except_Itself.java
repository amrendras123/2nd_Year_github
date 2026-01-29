public class Product_Except_Itself {

      public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int sprd=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=sprd;
            sprd=sprd*nums[i];
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+",");
        // }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*suffix;
            
            suffix=suffix*nums[i];
            
        }
        return arr;
    }
}