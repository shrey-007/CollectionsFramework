package list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        //push
        stack.push(2);
        stack.push(4);
        stack.push(56);
        stack.push(3);
        stack.push(7);

        System.out.println(stack);

        //pop
        stack.pop();
        System.out.println(stack);

        //peek
        System.out.println(stack.peek());

        //search. gives index of element in stack.top element is 1,second top is 2 and so on.if element not exists than -1
        int index=stack.search(45);
        System.out.println(index);

//        The Stack class in Java is a legacy class and inherits from Vector in Java. It is a thread-safe class and hence
//        involves overhead when we do not need thread safety. It is recommended to use ArrayDeque for stack implementation
//        as it is more efficient in a single-threaded environment.

        Deque<Integer> stack1=new ArrayDeque<>();
        stack1.push(34);
        stack1.push(33);
        stack1.push(1);
        stack1.push(334);
        System.out.println(stack1);

        //you can convert whole stack into a list
        List<Integer> list=stack1.stream().toList();
        System.out.println(list);



    }
}
