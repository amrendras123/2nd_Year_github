import java.util.*;

class Map{
     public static void main(String[] args){

        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}