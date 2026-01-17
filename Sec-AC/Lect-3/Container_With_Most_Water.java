public class Container_With_Most_Water {
     public int maxArea(int[] ht) {
        int max=0; 
       int i=0;
       int j=ht.length-1;
            while(i<j){
                int area=Math.min(ht[i],ht[j])*(j-i);
                max=Math.max(max,area);
                if(ht[i]<ht[j]){
                    i++;
                }else{
                    j--;
                }
            }
        
        return max;
    }
}
