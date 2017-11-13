import java.util.*;

public interface Stack<Item> {
  E pop();

  void push(E item);
  
  E peek();
  
  boolean isEmpty();

  int size();
}