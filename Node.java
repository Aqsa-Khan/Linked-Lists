
/**
 * General version of IntegerNode
 * 
 * @author (Aqsa) 
 * @version (May 16, 2017)
 */
public class Node<T>
{
    /**
     * an integer that represents the data stored by the particular node
     */
    private T nodeData;
    /**
     * a reference variable to the next node, for when the node is being stored in a linked list
     */
    private Node<T> nextData;
    /**
     * a reference variable to the previous node, for when the node is being stored in a linked list
     */
    private Node<T> previousData;
    /**
     * Constructor for objects of class IntegerNode
     */
    public Node (T data)
    {
        nodeData = data;
    }
    
    /**
     * returns the integer data being stored by this node
     */
    public T getData(){
        return nodeData;
    }
    
    /**
     * returns the next node that has been linked to this one
     */
    public Node getNext(){
        return nextData;
    }
    
    /**
     * returns the previous node that has been linked to this one
     */
    public Node getPrevious(){
        return previousData;
    }
    
    /**
     * sets the next node, so that this node is now linked to in
     */
    public void setNext(Node<T> in){
        nextData = in;
    }
    
    /**
     * sets the previous node, so that this node is now linked to in
     */
    public void setPrevious(Node<T> in){
       previousData = in; 
    }
}
