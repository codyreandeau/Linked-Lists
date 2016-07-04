public class LinkedList {
  
  private Node head;
  private Node last;

  //Method to add items to our linked list
  public void add(String data) {
    if(isEmpty()) {
      head = new Node(data);
      last = head;
    }else{
      last.setNext(new Node(data));
      last = last.getNext();
    }
  }
  
  //Method to check if each node is empty
  public boolean isEmpty() {
    return head == null;
  }
  
  //Method to print out all items in the list
  public void print() {
    Node temp = head;
    while(temp!= null)
    {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }
  
  //Method to remove a node from a list
  public boolean remove(String data) {
    if(isEmpty())
      return false;
    if(data.equals(head.getData())) {
      head = head.getNext();
      if(head == null)
        last = null;
      return true;
    }return true;
   }
}
