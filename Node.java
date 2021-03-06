public class Node {
  
  private String data;
  private Node next;
  
 /**
  * Constructor
  */
  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }
  
 /**
  * Constructor
  */
  public Node(String data)
  {
    this(data, null);
  }
  
 /**
  * Method to set data
  */
  public void setData(String data) {
    this.data = data;
  }
  
 /**
  * Method to get data
  */
  public String getData() {
    return data;
  }
  
 /**
  * Method to get next
  */
  public Node getNext() {
    return next;
  }
  
 /**
  * Method to set next
  */
  public void setNext(Node next) {
    this.next = next;
  }
 }