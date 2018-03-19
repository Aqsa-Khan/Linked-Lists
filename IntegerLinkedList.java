
/**
 * This class uses the IntegerNode class to create a sequence of connected nodes, also known as a linked list
 * 
 * @author Aqsa 
 * @version May 2nd, 2017
 */

public class IntegerLinkedList
{
    /**
     * a node representing the head of the list
     */
    private IntegerNode head;
    /**
     * a node representing the tail of the list
     */
    private IntegerNode tail;
    
   /**
     * main method to test everything out
     */
    public static void main(String[] args){
        IntegerLinkedList l1 = new IntegerLinkedList();
        l1.addFirst(1);
        l1.addLast(0);
        System.out.println(l1.peekFirst());
        System.out.println(l1.peekLast());
        l1.addFirst(3);
        l1.addFirst(8);
        l1.addFirst(6);
        l1.addLast(4);
        l1.addFirst(0);
        l1.addFirst(0);
        System.out.println(l1.pollFirst());
        System.out.println(l1.pollLast());
        System.out.println(l1);
    }
    
    /**
     * Constructor that constructs an empty linked list
     */
    public IntegerLinkedList(){
        head = null;
        tail = null;
    }
    
    /**
     * stores x in the list by creating a node object based on it and inserting node at the beginning of the list
     */
    void addFirst(int x){
        IntegerNode list1 = new IntegerNode(x);
        list1.setNext(head);
        head = list1;
    }
    
    /**
     * stores x in the list by creating a node object based on it nad inserting the node at the end of the list
     */
    void addLast(int y){
        IntegerNode list_last = new IntegerNode(y);
        list_last.setPrevious(tail);
        tail = list_last;
    }
    
    /**
     * retrieves, but does not remove, the first integer of this list, or returns 0 if the list is empty
     */
    int peekFirst(){
        if(head == null){
            return 0;
        }else{
            return head.getData();
        }
    }
    
    /**
     * retrieves, but does not remove, the last integer of this list, or returns 0 if the list is empty
     */
    int peekLast(){
        if(head == null){
            return 0;
        }else{
            return tail.getData();
        }
    }
    
    /**
     * retrieves and removes the first integer of this list, or returns 0 if this list is empty
     */
    int pollFirst(){
        int headint;
        //setting int headint to the new head
        headint = this.peekFirst();
        //head is getting the new head
        head = head.getNext();
        if(head == null){
            return 0;
        }else if(tail == head){
            head = null;
            tail = null; 
            return 0;
        }else{
            //head is effectively unlinking from head
            head.setPrevious(null);
            //creating new integer node and unlinking from new head
            IntegerNode new_node = head.getPrevious();
            
        }
        return headint;
    }
    
    /**
     * retrieves and removes the last integer of this list, or returns 0 if this list is empty
     */
    int pollLast(){
        int tailint;
        tailint = this.peekLast();
        tail = tail.getPrevious();
        if(head == null){
            return 0;
        }else if(tail == head){
            head = null;
            tail = null; 
            return 0;
        }else{
            tail.setNext(null);
            IntegerNode newNode = tail.getNext();
            
        }
        return tailint;
    }
    
    /**
     * returns a string representation of all the items stored in the list.
     */
    public String toString(){
        IntegerNode getit = head;
        String stringThing = "head-->";
        while(getit != null){
            int a = getit.getData();
            getit =  getit.getNext();
            stringThing = stringThing + a + "<--->";
        }
        stringThing = stringThing + "<---tail";
        return stringThing;
    }
}
