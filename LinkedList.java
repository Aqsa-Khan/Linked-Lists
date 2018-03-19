
/**
 * General version of IntegerLinkedList.
 * 
 * @author (Aqsa) 
 * @version (May 16, 2017)
 */
public class LinkedList <T>
{
    /**
     * a node representing the head of the list
     */
    private Node<T> head;
    /**
     * a node representing the tail of the list
     */
    private Node<T> tail;
    
   /**
     * main method to test everything out
     */
    public static void main(String[] args){
       
    }
    
    /**
     * Constructor that constructs an empty linked list
     */
    public <T> LinkedList(){
        head = null;
        tail = null;
    }
    
    /**
     * stores x in the list by creating a node object based on it and inserting node at the beginning of the list
     */
    void addFirst(T x){
        Node<T> list1 = new Node<T> (x);
        head = list1;
    }
    
    /**
     * stores x in the list by creating a node object based on it and inserting the node at the end of the list
     */
    void addLast(T y){
        Node<T> list_last = new Node<T>(y);
        tail = list_last;
    }
    
    /**
     * retrieves, but does not remove, the first thing of this list, or returns 0 if the list is empty
     */
    T peekFirst(){
        if(head == null){
            return null;
        }else{
            return head.getData();
        }
    }
    
    /**
     * retrieves, but does not remove, the last thing of this list, or returns 0 if the list is empty
     */
    T peekLast(){
        if(head == null){
            return null;
        }else{
            return tail.getData();
        }
    }
    
    /**
     * retrieves and removes the first thing of this list, or returns 0 if this list is empty
     */
    T pollFirst(){
        T headint;
        //setting int headint to the new head
        headint = this.peekFirst();
        //head is getting the new head
        head = head.getNext();
        if(head == null){
            return null;
        }else if(tail == head){
            head = null;
            tail = null; 
            return null;
        }else{
            //head is effectively unlinking from head
            head.setPrevious(null);
            //creating new integer node and unlinking from new head
            Node<T> new_node = head.getPrevious();
            new_node.setNext(null);
        }
        return headint;
    }
    
    /**
     * retrieves and removes the last thing of this list, or returns 0 if this list is empty
     */
    T pollLast(){
        T tailint;
        tailint = this.peekLast();
        tail = tail.getPrevious();
        if(head == null){
            return null;
        }else if(tail == head){
            head = null;
            tail = null; 
            return null;
        }else{
            tail.setNext(null);
            Node<T> newNode = tail.getNext();
            newNode.setPrevious(null);
        }
        return tailint;
    }
    
    /**
     * returns a string representation of all the items stored in the list.
     */
    public String toString(){
        Node<T> getit = head;
        String stringThing = " ";
        while(getit != null){
            T a = getit.getData();
            stringThing = stringThing + "--" + a;
            getit =  getit.getNext();
        }
        System.out.println(stringThing);
        return stringThing + tail;
    }
}
