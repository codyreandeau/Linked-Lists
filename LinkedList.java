public class LinkedList {
  
  private Node head;
  private Node tail;

 /**
  * Method to add items to our linked list
  */
  public void add(String data) {
    if(isEmpty()) {
      head = new Node(data);
      tail = head;
    }else{
      tail.setNext(new Node(data));
      tail = tail.getNext();
    }
  }
  
  /**
   * Method to add to the beginning of the linked list
   */
  public void addFirst(String data)
   {
      Node temp = new Node(data);
      temp.setNext(head);
      head = temp;
   }
  
  /**
   * Method to check if each node is empty
   */
  public boolean isEmpty() {
    return head == null;
  }
  
  /**
   * Method to print out all items in the list
   */
  public void print() {
    Node temp = head;
    while(temp!= null)
    {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }
  
  /**
   * Method to remove a node from a list
   */
  public void remove(String data) {
  
    if(isEmpty())
      return;
    if(data.equals(head.getData())) {
      head = head.getNext();
     return;
   }
    
   Node temp = head;
   Node prev = null;

   while(temp != null && !temp.getData().equals(data) )
   {
      prev = temp;
      temp = temp.getNext();
   }

   //Remove node from the list
   prev.setNext(temp.getNext());
}
}
