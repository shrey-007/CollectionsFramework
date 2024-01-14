package queue;

//Deque interface present in java.util package is a subtype of the queue interface. The Deque is related to the
// double-ended queue that supports the addition or removal of elements from either end of the data structure.
// It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO). Deque is the
// acronym for double-ended queue.

//since both linkedlist and arraydeque class implements deque so both can perform operations on both sides.

//“Java Generics and Collections” by Maurice Naftalin and Philip Wadler, best book for collections framework

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(1);
        deque1.addLast(2);
        int first = deque1.removeFirst();
        int last = deque1.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
//=============================================================================================================================

//        since deque is extended by linked list also

        Deque<String> deque = new LinkedList<String>();

        // We can add elements to the queue
        // in various ways

        // Add at the last
        deque.add("Element 1 (Tail)");

        // Add at the first
        deque.addFirst("Element 2 (Head)");

        // Add at the last
        deque.addLast("Element 3 (Tail)");

        // Add at the first
        deque.push("Element 4 (Head)");

        // Add at the last
        deque.offer("Element 5 (Tail)");

        // Add at the first
        deque.offerFirst("Element 6 (Head)");

        System.out.println(deque + "\n");

        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "
                + "first and last: "
                + deque);
//=============================================================================================================================


        //iterating
        for (Iterator itr = deque1.iterator();itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

//        ArrayDeque class which is implemented in the collection framework provides us with a way to apply
//        resizable-array. This is a special kind of array that grows and allows users to add or remove an element from
//        both sides of the queue.ArrayDeque class is likely to be faster than Stack when used as a stack.
//        ArrayDeque class is likely to be faster than LinkedList when used as a queue

    }
}
