package set;

import java.util.HashSet;
import java.util.Iterator;

//it is same as hashmap, bas isme only keys store hoti hai, also it stores only unique items
//it does not have any order of storing elements, just like hashmap
//it takes o(1) times to add,search..coz iternally ye hashmap se bana h
public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        hashSet.add(34);
        hashSet.add(34);
        hashSet.add(23);
        System.out.println(hashSet);

//        it has basic functions like add and remove

//        iteration
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
