import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 20);
        map.put(2, 40);
        map.put(3, 50);
      System.out.println(map.containsKey(10));
      System.out.println(map.getOrDefault(10,0));
        //display
        map.put(1,40);//update if already present
        //display
        System.out.println(map.get(2));
        //print
        for(int key:map.keySet()){//foreach loop
            System.out.println(key+"->"+map.get(key));
        }
    }
}
