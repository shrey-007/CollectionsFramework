package list;

import java.util.ArrayList;
import java.util.Collections;

public class LearnArrayList {
    public static void main(String[] args) {
        //create a new list and add items manually
        ArrayList arrayList=new ArrayList<>();
        arrayList.add("shrey");
        arrayList.add("hi");

        //create a new list from older list
        ArrayList arrayList1=new ArrayList<>(arrayList);

        //add all items at one
        arrayList.addAll(arrayList1);

        //returns true if arraylist contains an element
        arrayList.contains("yes");

        //returns index of first occurence and -1 if not exists., similarly lastIndexOf() bhi hota h
        arrayList.indexOf("hi");

        //Replaces the element at the specified position in this list with the specified element.
        arrayList.set(2,"desg");

        //iterating through for each
        for (Object obj : arrayList)
            System.out.print(obj + " ");

        //sorting
        Collections.sort(arrayList);




    }
}
