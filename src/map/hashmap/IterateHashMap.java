package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        // Creating an Hashmap of string-integer pairs
        // It contains student name and their marks

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // Adding mappings to above HashMap
        // using put() method
        hm.put("GeeksforGeeks", 54);
        hm.put("A computer portal", 80);
        hm.put("For geeks", 82);
 //==========================================================================================================================
//        using iterator


        // Getting an iterator.HashMap does not extends iterable, so it is not iterable.
        //Entry is a simple class having key and value, Map(or hashmap) is collection of entries.
        //toh pehle hashmap ko entries ke set mai convert kro,since set is iterable, uska iterator lelo.
        Iterator hmIterator = hm.entrySet().iterator();
        // Iterating through Hashmap and adding some bonus marks for every student
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); // mapElement, Map ki ek entry hai <K,V>
            int value = (int)mapElement.getValue();
            String key=(String) mapElement.getKey();
        }



//=============================================================================================================================
//        using for each loop

        for(Map.Entry mapEntry:hm.entrySet()){
            String key=(String) mapEntry.getKey();
            int value=(int)mapEntry.getValue();
        }
//        agar type cast nhi krna toh pehle hi Map.Entry<String,Integer> krdo



    }
}
