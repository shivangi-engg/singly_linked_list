import printpackage.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) 
	{
		//making abject of our linked list class
		Linked_list list = new Linked_list();
		//inserting values
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert_start(2);
		list.insert_start(1);
		list.insertAt(6,6);

		list.insertAt(10,10);

		//to print the ll
		list.show();

	}
}