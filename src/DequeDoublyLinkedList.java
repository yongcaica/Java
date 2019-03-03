import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;

interface DequeDLL<E> {
    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
}

public class DequeDoublyLinkedList<E> implements DequeDLL<E> {
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }
        public void setPrev(Node<E> p) { prev = p; }
        public void setNext(Node<E> n) { next = n; }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DequeDoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<> (null, header, null);
        header.setNext(trailer);
    }

    public int size() { return size;}
    public boolean isEmpty() { return size ==0; }

    public E first() {
        if(isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if(isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    public E removeFirst() {
        if(isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if(isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public static void main(String args[]) {
        DequeDoublyLinkedList<Integer> deque = new DequeDoublyLinkedList<>();
        deque.addLast(5);
        deque.addFirst(3);
        System.out.println(deque);
    }
}