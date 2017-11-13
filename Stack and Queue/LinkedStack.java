// Not done yet
import java.util.*;
 
class LinkedStack<E> implements Stack<E> {
  private Node head;
  private int size;
 
  private class Node {
    E element;
    Node next;
  }
 
  public LinkedStack() {
    head = null;
    size = 0;
  }
  
  // Remove item from the beginning of the list.
  public E pop() {
    E element = head.element;
    head = head.next;
    size--;
    return element;
  }
  
  // Add item to the beginning of the list.
  public void push(E item) {
    Node prevHead = head;
    head = new Node();
    head.next = prevHead;
    size++;
  }
  
  public E peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    } else {
      return head.element;
    }
  }
 
  public boolean isEmpty() {
    return (size == 0);
  }
 
  //Return number of items present in the stack
  public int size() {
    return size;
  }
 
  public Iterator<E> iterator() {
    return new LinkedStackIterator();
  }
 
  private class LinkedStackIterator implements Iterator<E> {
    private int i = size;
    private Node first = head;
 
    public boolean hasNext() {
      return (i > 0);
    }
 
    public E next() {
      E element = first.element;
      first = first.next;
      i--;
      return element;
    }
  }
}