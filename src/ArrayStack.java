/*
(15%) Implement an adapter class in Java programming language to support the stack interface using the methods from the array list ADT.
 */

import java.util.ArrayList;
import java.util.Stack;

public class ArrayStack<E> implements Stack<E> {
    private ArrayList<E> list = new ArrayList<>();
    public ArrayStack() {}
    public int size() {return list.size();}
    public boolean isEmpty() {return list.isEmpty();}
    public void push(E element) { list.add(0,element);}
    public E top() {return list.get(0);}
    public E pop() {return list.remove(0);}
}

/*
methods of ArrayList:
Method Running Time
size() O(1)
isEmpty() O(1)
get(i) O(1)
set(i, e) O(1)
add(i, e) O(n)
remove(i) O(n)

methods of Stack:
Stack Method Singly Linked List Method
size() list.size()
isEmpty() list.isEmpty()
push(e) list.addFirst(e)
pop() list.removeFirst()
top() list.first()
 */


