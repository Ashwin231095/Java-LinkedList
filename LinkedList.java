import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;


// Java program to implement
// a Singly Linked List
public class LinkedList {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public static LinkedList insert(LinkedList list, int data)
	{
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Else traverse till the last node
			// and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		// LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		// list = insert(list, 1);
		// list = insert(list, 2);
		// list = insert(list, 3);
		// list = insert(list, 4);
		// list = insert(list, 5);
		// list = insert(list, 6);
		// list = insert(list, 7);
		// list = insert(list, 8);

		// Print the LinkedList
		File file = new File("../Assignment/in.txt");
        String data = null;
        try {
			Scanner sc = new Scanner(file);
            // we just need to use \\Z as delimiter
            sc.useDelimiter("\\Z");
            data = sc.next();
        } catch (IOException e) {
			// do something
            e.printStackTrace();
        }
        // System.out.println(data);
        StringTokenizer st1 = new StringTokenizer(data);
		LinkedList list = new LinkedList();
		for (int i = 1; st1.hasMoreTokens(); i++)
		{
		// System.out.println("Token "+i+":"+st1.nextToken());
		/* Start with the empty list. */
		//
		// ******INSERTION******
		//
		// Insert the values
		list = insert(list, Integer.parseInt(st1.nextToken()));
		}
		printList(list);

	}
}
