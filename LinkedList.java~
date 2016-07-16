public class LinkedList {
  
  private Node head;
  private Node tail;

 /**
  * Method to add items to our linked list
  */
  public void add(String data) {
    //Check if head is null
    if(isEmpty()) {
      head = new Node(data);
      tail = head;
    }else{
      tail.setNext(new Node(data));
      tail = tail.getNext();
    }
  }
  
 /**
  * Method to insert items into our linked list
  */
  public void insert(int index, String data) {
    //Check if index is less than 0 or greater than the total size of the list
    if(index < 0 || index > size()) {
      return;
    }
    //Check if index is zero 
    if(index==0) {
      head = new Node(data, head);
      if(tail==null)
        tail = head;
      return;
    }
    
    Node pre = head;
    for(int i=1; i <= index -1; i++) {
      pre = pre.getNext();
    }
    
    pre.setNext(new Node(data, pre.getNext()));
  }
  
  /**
   * Method to add to the beginning of the linked list
   */
  public void addFirst(String data){
      Node temp = new Node(data);
      //Check if list is empty
      if(isEmpty()){
         head = temp;
      }else{
      temp.setNext(head);
      head = temp;
   }
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
    //print out nodes until we reach null
    while(temp!= null)
    {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }
  
 /**
   * Method that records the size of the list
   */
  public int size() {
    int counter = 0;
    Node temp = head;
    while(temp!=null) {
      counter++;
      temp = temp.getNext();
    }
    return counter;
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
