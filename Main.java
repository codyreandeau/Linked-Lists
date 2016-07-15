public class Main {
  
  public static void main(String[] args) {
    
    //Create linked lists
    LinkedList list = new LinkedList();
    
    //Add items to the list
    list.add("Linked");
    list.add("Are");
    list.add("Awesome");
    list.addFirst("I Think");
    list.insert(2, "Lists");
    list.insert(4, "Wicked");
    
    System.out.println("Items in the list:");
    
    //Print out items in the list
    list.print();
    
    System.out.println("----------------------------");
    System.out.println("Removing nodes from the list");
    System.out.println("----------------------------");
    
    //Remove Elements from the list
    list.remove("Linked");
    list.remove("Wicked");
    
    //Print out items in the list
    list.print();
    
    //Print out size of the list
    System.out.println("There are now " + list.size() + " items in the list");
    
    }
}