/*
(20%) Using the Java programming language, implement the deque ADT with a doubly linked list.
 */


public class TMA_2_1 {
}

class Deque<T extends Comparable<T>> {
    class Node
    {
        T data;
        Node previous;
        Node next;

        Node(T data)
        {
            this.data = data;
            this.previous = null;
            this.next = null;
        }

        Node(T data, Node prev, Node next)
        {
            this.data = data;
            this.previous = prev;
            this.next = next;
        }

    }
    private Node front, back;

    public Deque()
    {
        front = null;
        back = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public int size()
    {
        int s = 0;
        Node n = front;
        while(n != null)
        {
            s++;
            n = n.next;
        }
        return s;
    }

    public void addFront(T data)
    {
        Node n = new Node(data, null, front);
        if(isEmpty())
        {
            front = back = n;
        }
        else
        {
            front.previous = n;
            front = n;
        }
    }

    public void addBack(T data)
    {
        Node n = new Node(data, back, null);
        if(isEmpty())
            front = back = n;
        else
        {
            back.next = n;
            back = n;
        }
    }

    public T removeFront()
    {
        if(isEmpty())
            return null;

        T val = front.data;

        front = front.next;
        if(front == null)
            back = null;
        else
            front.previous = null;
        return val;
    }

    public T removeBack()
    {
        if(isEmpty())
            return null;

        T val = back.data;

        back = back.previous;
        if(back == null)
            front = null;
        else
            back.next = null;
        return val;
    }

    public String toString()
    {
        String s = "";
        if(!isEmpty())
        {
            s = front.data.toString();
            Node n = front.next;
            while(n != null)
            {
                s += ", " + n.data.toString();
                n = n.next;
            }
        }

        return s;
    }

}

/*
TestDeque.java
*/

class TestDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();

        System.out.println("addFront 1 2 3 ");
        deque.addFront(1);
        deque.addFront(2);
        deque.addFront(3);
        System.out.println("Deque contains: " + deque);

        System.out.println("addBack 4 5 6");
        deque.addBack(4);
        deque.addBack(5);
        deque.addBack(6);
        System.out.println("Deque contains: " + deque);

        System.out.println("size = " + deque.size());

        System.out.println("removeFront : " + deque.removeFront());
        System.out.println("removeFront : " + deque.removeFront());
        System.out.println("removeBack : " + deque.removeBack());
        System.out.println("removeBack : " + deque.removeBack());
        System.out.println("Deque contains: " + deque);

        System.out.println("size = " + deque.size());

    }
}

/*
output

        =====

        addFront 1 2 3

        Deque contains: 3, 2, 1

        addBack 4 5 6

        Deque contains: 3, 2, 1, 4, 5, 6

        size = 6

        removeFront : 3

        removeFront : 2

        removeBack : 6

        removeBack : 5

        Deque contains: 1, 4

        size = 2
*/