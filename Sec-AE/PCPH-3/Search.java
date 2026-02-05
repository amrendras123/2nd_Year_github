public class Search {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,3,4,5,6,77,78};
        int tar=77;
        System.out.println(search(arr,tar,0));
    }
    public static int search(int[] arr,int tar,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==tar){
            return i;
        }
      return  search(arr, tar, i+1);
        
    }
}
