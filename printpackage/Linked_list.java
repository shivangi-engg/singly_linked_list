package printpackage;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Linked_list
{
	//define head node
	Node head;
	//method to add a node at the end of a linked list
	public void insert(int data)
	{
		//make a new node and add given data to it
		Node node = new Node();
		node.data = data;
		//this new node will be inserted at the end of ll, so node.next=null
		node.next = null;
		//if head is null it means linked list is empty therefore assign the value of the node which
		//we want to insert to head
		if(head == null)
		{
			head = node;
		}
		else
		{
			//making a node n to traverse through the linked list and when n.next = null , 
			//give the value of node to n.next
			Node n = head;
			//continue to traverse when n.next is not null i.e. it isn't last node
			while(n.next != null)
			{
				//to go to next node
				n = n.next;
			}
			//at the end of while loop n is the last node and n.next is null
			//assign the value of node(which contains the data we want to enter in ll)to n.next
			n.next = node;
		}
	}
		//method to print the linked list
	public void show()
	{
		//make a new node to traverse through the ll starting from head
		Node node = head;
		//while loop to go to the next elt
		while(node.next != null)
		{
			//print the value of current node
			System.out.print("-->");
			System.out.print(node.data);
			//move to next node
			node = node.next;
		}
		System.out.print("-->");
		System.out.print(node.data);
	}
	//insert at starting
	public void insert_start(int data)
	{
		//make anew node that store the value user want to add
		Node n1 = new Node();
		n1.data = data;
		//if head is null => no node therfore entered node will be the head node
		if(head == null)
		{
			head = n1;
		}
		else
		{
			//new node's next is head
			n1.next = head;
			//head is the new node
			head = n1;
			
		}
	}
	//method to insert at some position
	public void insertAt(int position, int data)
	{
		//node storing the value user wants to insert
		Node node = new Node();
		node.data = data;
		//node to traverse
		Node n = head;
		for(int i=1; i<position-1; i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
}