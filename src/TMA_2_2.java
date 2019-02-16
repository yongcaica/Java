/*
(15%) Implement an adapter class in Java programming language to support the stack interface using the methods from the array list ADT.
 */

public class TMA_2_2 {
}

interface StackInterface<AnyType>
{
    public void push(AnyType e);

    public AnyType pop();

    public AnyType peek();

    public boolean isEmpty();
}
interface QueueInterface<AnyType> {
    boolean isEmpty();

    AnyType getFront();

    AnyType dequeue();
}


