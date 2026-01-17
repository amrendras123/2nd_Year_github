import java.util.ArrayList;
import java.util.List;

public class Majority_Element_2 {
     public List<Integer> majorityElement(int[] nums) {
        
            int val1=0,val2=0,count1=0,count2=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(count1==0&&nums[i]!=val2){
                val1=nums[i];
                count1++;
            }else if(count2==0&&nums[i]!=val1){
                val2=nums[i];
                count2++;
            }else{
                if(nums[i]==val1)
                    count1++;
                else if(nums[i]==val2)
                    count2++;
                else{
                    count1--;
                    count2--;
                }
            }
            
        }
        int mc1=0,mc2=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==val1){
                        mc1++;
                    }else if(nums[i]==val2){
                        mc2++;
                    }
                }
            ArrayList<Integer> list=new ArrayList<>();
            if(mc1>nums.length/3)
                list.add(val1);
            if(mc2>nums.length/3)
                list.add(val2);
          
        return list;
    }
}
