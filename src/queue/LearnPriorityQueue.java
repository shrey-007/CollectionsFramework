package queue;

import queue.comparator.NameComparator;
import queue.entity.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

//     boolean add(E element): This method inserts the specified element into this priority queue.
//     public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
//     public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
//     it does not implements deque , it implements queue so it can not perform operations on both end.
//     we have to provide comparator at time of creation of it.we can put those objects in priority queue which are not comparable

//===========================================================================================================================================
        //since kuch bhi mention nhi kra toh ye min heap use krega.By default Integer ka Comparator hota hai toh apan ko nhi banana pada
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
//       //if you want ki ye max heap bane then PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(34);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        priorityQueue.add(2);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        priorityQueue.add(100);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        priorityQueue.add(29);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        //so it clearly shows ki priorityQueue ka head min element de rha hai but jab poora  priorityQueue print kro toh sequence ajeeb hoga

//========================================================================================================================================

        //creating priority queue for students
        PriorityQueue<Student> studentPriorityQueue=new PriorityQueue<>(new NameComparator());
        studentPriorityQueue.add(new Student("shrey",230));
        System.out.println(studentPriorityQueue);
        studentPriorityQueue.add(new Student("sushil",2));
        System.out.println(studentPriorityQueue);
        studentPriorityQueue.add(new Student("rashmi",3));
        System.out.println(studentPriorityQueue);

        //toh ye name ki min heap hai, agar max heap chaiye toh
//        PriorityQueue<Student> studentPriorityQueue1=new PriorityQueue<>(new NameComparator().reversed());


//=============================================================================================================================================

        //iterating
        Iterator iterator = studentPriorityQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }









    }
}
