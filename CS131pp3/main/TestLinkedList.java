package main;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

public class TestLinkedList {

	public static void main(String[] args) {
		
		// Create a GenericLinkedList that can hold Integer objects
		GenericLinkedList<Integer> intList = new GenericLinkedList<>();
		
		GenericNode<Integer> intNode = new GenericNode<>();
		intNode.setData(1);
		intList.addNode(intNode);
		
		intNode = new GenericNode<>();
		intNode.setData(2);
		intList.addNode(intNode);
		
		GenericNode<Integer> tempIntNode = intList.getList();
		do 
		{
			System.out.println(tempIntNode.getData());
			tempIntNode = tempIntNode.getNextNode();
		} while (tempIntNode != null);
		
		// Create a GenericLinkedList that can hold Double objects
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		
		GenericNode<Double> doubleNode = new GenericNode<>();
		doubleNode.setData(1.0);
		doubleList.addNode(doubleNode);
		
		doubleNode = new GenericNode<>();
		doubleNode.setData(2.0);
		doubleList.addNode(doubleNode);
		
		GenericNode<Double> tempDoubleNode = doubleList.getList();
		do 
		{
			System.out.println(tempDoubleNode.getData());
			tempDoubleNode = tempDoubleNode.getNextNode();
		} while (tempDoubleNode != null);
		
		// Create a GenericLinkedList that can hold String objects
		GenericLinkedList<String> stringList = new GenericLinkedList<>();
		
		GenericNode<String> stringNode = new GenericNode<>();
		stringNode.setData("Element 1");
		stringList.addNode(stringNode);
		
		stringNode = new GenericNode<>();
		stringNode.setData("Element 2");
		stringList.addNode(stringNode);
		
		GenericNode<String> tempStringNode = stringList.getList();
		do 
		{
			System.out.println(tempStringNode.getData());
			tempStringNode = tempStringNode.getNextNode();
		} while (tempStringNode != null);

    }//end main

}//end class
