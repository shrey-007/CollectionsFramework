package list;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();

        //adding
        linkedList.add(3);  //add last is equivalent to add
        linkedList.add(5);
        linkedList.addLast(45);
        linkedList.addFirst(43);

        System.out.println(linkedList);

        //removing
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);

        //iterating
        for(int i:linkedList){
            System.out.println(i);
        }
    }
}
