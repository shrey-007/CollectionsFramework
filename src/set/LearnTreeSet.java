package set;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
//        TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to be accessed quickly because of its faster access and retrieval time.
//        TreeSet is basically an implementation of a self-balancing binary search tree like a Red-Black Tree. Therefore operations like add, remove, and search takes O(log(N)) time.
//        so basically ye unique element store krta hai in sorted order.

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(21);
        treeSet.add(21);
        treeSet.add(3);
        treeSet.add(67);
        System.out.println(treeSet);

// ceiling(Object o) =This method returns the least element in this set greater than or equal to the given element, or null if there is no such element
//  floor(Object o)=This method returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
// headSet(Object toElement)= This method will return elements of TreeSet which are less than the specified element
// tailSet(Object toElement)= This method will return elements of TreeSet which are greater than or equal to the specified element.
// pollFirst=This method retrieves and removes the first (lowest) element, or returns null if this set is empty.
//pollLast=This method retrieves and removes the last (highest) element, or returns null if this set is empty.
// if you want to store a custom class in treeset then you have to provide a comparator


//        iterating
        for(int i:treeSet){
            System.out.println(i);
        }





    }
}
