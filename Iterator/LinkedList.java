import java.util.*;
import java.util.NoSuchElementException;

public class LinkedList<E> implements ICollection<E> {
  int size = 0;
  
  public class Node {
    E data;
    Node next;
    
    Node(E data, Node next) {
      this.data = data;
      this.next = next;
    }
    
    Node head = null;
  }
  
  LinkedList() {}
  
  public boolean add(E item, int index) {
    Node newNode = new Node(item, index);
    
    if (this.size == 0 || index == 0) {
      head = newNode;
      this.size++;
      return true;
    }
    
    Node currentNode = head;
    Node previousNode = null;
    
    for (int i = 0; i < index; i++) {
      previousNode = currentNode;
      currentNode = currentNode.next;
      
      if (currentNode == null) {
        break;
      }
    }
    
    newNode.next = currentNode;
    previousNode.next = newNode;
    size++;
    return true;
  }
  
  // returns true if the item at a given index is already removed
  public boolean remove(int index) {
    if (size > 0) {
      previousNode.next = currentNode.next;
      currentNode.next = null;
      size--;
      return true;
    } else {
      throw new IllegalArgumentException("The List is Empty.");
    }
  }
  
  public int size() {
    return size;
  }
  
  public IIterator<E> iterator(){
    return new LinkedList();
  }
  
  class LinkedListIterator implements Iterator<E> {
    int i = size;
    Node currentNode = head;
    
    public boolean hasNext() {
      return (i > 0);
    }
    
    public E next() {
      if (!(hasNext)) {
        throw new NoSuchElementException();
        
        E item = currentNode.data;
        currentNode = currentNode.next;
        return item;
      }
    }
  }
}