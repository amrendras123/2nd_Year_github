import java.util.HashMap;
import java.util.Scanner;

public class Find_Ele_With_max_Freq {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
    //  map.put(arr[i],map.getOrDefault(arr[i],0)+1);
          if(map.containsKey(arr[i])){
                int ov=map.get(arr[i]);
                map.put(arr[i], ov+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
        int max=0;
        int k=0;
        for(int key:map.keySet()){
           if(map.get(key)>max){
            max=map.get(key);
            k=key;
           }
        }
    System.out.println(k+" has max frequncy in the array "+max);
    }
}