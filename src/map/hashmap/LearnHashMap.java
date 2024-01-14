package map.hashmap;

import java.util.HashMap;
import java.util.Map;

//It is roughly similar to HashTable but is unsynchronized.
//it is unordered, so you can access it through index, you have to do it using keys.
public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
//        entrySet()=Returns a Set  of the mappings contained in this map.
//        keySet()=Returns a Set  of the keys contained in this map.
//        values()=Returns a Collection  of the values contained in this map.


        //iterating the map
        for (Map.Entry<String, Integer> e : hashMap.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());}




    }
}
