public class NextGreaterElementonRight {

    
    public static void nger(int[] arr){

        int[] ans=new int[arr.length];
        for(int i=0;i<ans.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
    }
}