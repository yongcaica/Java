
class Node<T>{
    private Node<T> prev;
    private Node<T> next;
    private T value;

    public Node<T> getPrev() {
        return prev;
    }
    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

public class TMA_2_1<T>  {
    private Node<T> front;
    private Node<T> rear;

    public void insertFront(T item){
        System.out.println("Adding element at front: "+item);
        Node<T> nd = new Node<T>();
        nd.setValue(item);
        nd.setNext(front);
        if(front != null) front.setPrev(nd);
        if(front == null) rear = nd;
        front = nd;
    }

    public void insertRear(T item){
        System.out.println("Adding element at rear: "+item);
        Node<T> nd = new Node<T>();
        nd.setValue(item);
        nd.setPrev(rear);
        if(rear != null) rear.setNext(nd);
        if(rear == null) front = nd;

        rear = nd;
    }

    public void removeFront(){
        if(front == null){
            System.out.println("Underflow state.");
            return;
        }
        Node<T> tmpFront = front.getNext();
        if(tmpFront != null) tmpFront.setPrev(null);
        if(tmpFront == null) rear = null;
        System.out.println("Remove element from front: "+front.getValue());
        front = tmpFront;
    }

    public void removeRear(){
        if(rear == null){
            System.out.println("Underflow state.");
            return;
        }
        Node<T> tmpRear = rear.getPrev();
        if(tmpRear != null) tmpRear.setNext(null);
        if(tmpRear == null) front = null;
        System.out.println("Removed element from rear: "+rear.getValue());
        rear = tmpRear;
    }

    public static void main(String args[]){
        try {
            TMA_2_1<Integer> deque = new TMA_2_1<Integer>();
            deque.insertFront(134);
            deque.insertFront(14);
            deque.insertFront(13);
            deque.removeFront();
            deque.insertRear(455);
            deque.removeFront();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}