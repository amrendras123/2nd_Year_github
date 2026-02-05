import java.util.*;
class SecondLarge{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //2nd largest code below 
        int max=arr[0];
        int max2=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("2nd max is "+max2);
    }
}