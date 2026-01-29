public class LinearSearch {
    public static void main(String[] args) {
        int val=5;
        int[] arr={2,0,1,4,5,6,7,1,2,3,4};
        search(arr,0,val);
    }
    public static int search(int[] arr,int i,int val){


        if(arr[i]==val){
            return i;
        }
        int idx=search(arr, i+1, val);
        return idx;

    }
}
