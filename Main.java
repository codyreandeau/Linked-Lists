public class Main {
  
  public static void main(String[] args) {
    
    //Create linked list
    LinkedList list = new LinkedList();
    
    //Add items to the list
    list.add("Linked");
    list.add("Lists");
    list.add("Are");
    list.add("Awesome");
    list.addFirst("I Think");
    
    System.out.println("Items in the list:");
    
    //Print out items in the list
    list.print();
    
    }
}