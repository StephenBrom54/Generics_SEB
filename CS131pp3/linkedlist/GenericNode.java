package linkedlist;

/**
 * This class models a GenericNode object which can contain any type of object. Each
 * node has its internal data (an object) and pointers to the next 
 * node in the list.
 * 
 * @param <T> The type of data the GenericNode will hold
 * @author rkelley/njohnson/Stephen Brom
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor builds a GenericNode object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data The data to be stored in the node
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return T The data stored in the node
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return The current node
	 */
	public GenericNode<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode The next node in the list
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return The next node in the list
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class
