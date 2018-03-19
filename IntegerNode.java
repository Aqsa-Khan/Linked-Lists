
/**
 * To implement a node object to be used bt the IntegerLinkedList class
 * 
 * @author Aqsa
 * @version May 1st, 2017
 */
public class IntegerNode
{
    /**
     * an integer that represents the data stored by the particular node
     */
    private int nodeData;
    /**
     * a reference variable to the next node, for when the node is being stored in a linked list
     */
    private IntegerNode nextData;
    /**
     * a reference variable to the previous node, for when the node is being stored in a linked list
     */
    private IntegerNode previousData;
    /**
     * Constructor for objects of class IntegerNode
     */
    public IntegerNode(int data)
    {
        nodeData = data;
    }
    
    /**
     * returns the integer data being stored by this node
     */
    public int getData(){
        return nodeData;
    }
    
    /**
     * returns the next node that has been linked to this one
     */
    public IntegerNode getNext(){
        return nextData;
    }
    
    /**
     * returns the previous node that has been linked to this one
     */
    public IntegerNode getPrevious(){
        return previousData;
    }
    
    /**
     * sets the next node, so that this node is now linked to in
     */
    public void setNext(IntegerNode in){
        nextData = in;
    }
    
    /**
     * sets the previous node, so that this node is now linked to in
     */
    public void setPrevious(IntegerNode in){
       previousData = in; 
    }
}
