package map;

import queue.comparator.NameComparator;
import queue.entity.Student;

import java.util.Map;
import java.util.TreeMap;

//The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time
public class LearnTreeMap {
    public static void main(String[] args) {

        //tree map is a sorted hashmap(sorted on basis of keys)
        //since isme integer key h toh apne aap sort ho jaaega, but agar key ek custom class hai toh uska comparator banana padega
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(23,"shrey");
        treeMap.put(1,"rashmi");
        treeMap.put(21,"sushil");
        System.out.println(treeMap);

//============================================================================================================================

        //TreeMap with custom class,since isme key ek custom class hai and tree map keys ko sorted order m store krta hai
        //toh use student ko sort krne ke liye comparator chaiye else error aaegi. so provide a comparator.
        TreeMap<Student,String> treeMap1=new TreeMap<>(new NameComparator());
        treeMap1.put(new Student("shrey",230),"hi");
        treeMap1.put(new Student("sushil",21),"hi");
        treeMap1.put(new Student("rashmi",7),"hi");
        System.out.println(treeMap1);

//===========================================================================================================================
//        since it is like hashmap so it provides methods like put,get,containsKey,containsValue etc

        //iterating
        for(Map.Entry entry:treeMap1.entrySet()){
            System.out.println("key is "+entry.getKey()+" and value is "+entry.getValue());
        }
//===========================================================================================================================
// search time comlexity is log(n),and not o(1) like hashmap

    }
}
