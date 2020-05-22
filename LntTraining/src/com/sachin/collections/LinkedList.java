package com.sachin.collections;

public class LinkedList {

	Node first;

	int size = 0;

	// add a new value at the end of the list
	public void add(int value)
	{
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null; // remember this will be the last node.
		newNode.previous = null; // --> we must do it at some point

		// Now I need to add this node after the last node in the list

		// scenario #1 ---> List is empty. we are adding the first node
		if (first == null)
		{
			first = newNode; // this node is the first node
			newNode.previous = null; // this is the first node

			return; 
		}

		// scenario #2 ---> List is not empty. We must find the last Node
		Node node = first; // let us begin from the begin
		while (node.next != null) // loop till there is no next available
			node = node.next; // keep moving next item

		// now node means last node
		Node last = node;
		last.next = newNode; // next to the last will be newNode
		newNode.previous = last; // previous to new node will be current lastNode

	}

	public void insert(int pos, int value) {

	}

	public int get(int pos)
	{
		// if the index is less then zero and greater than length of the linked list
		if (pos < 0 && pos > size - 1) 
		{
			System.out.println("Index is not valid");
			return 0;
		}
		// if the index is zero
		else if (pos == 0)
			return first.value;
		// if the linked list is not empty
		else
		{
			Node node = first;
			for (int i = 0; i <= pos; i++)
			{
				while (node.next != null)
				{
					node = node.next;
					if (node.next != null)
					{
						if (i == pos)
						{
							return node.value;
						}
					}
				}
			}
		}

		return 0;
	}

	public void set(int value) {

	}

	public void remove(int pos)
	{
		Node currentNode = first;

		for (int i = 0; i < pos; i++)
		{
			// If the linked list is empty
			if (first == null)
			{
				System.out.println("LinkedList doesn't contain any node");
				return;
			}

			// if the index is less then zero and greater than length of the
			// linked list
			else if (pos < 0 && pos > size) 
			{
				System.out.println("Index is not valid");
				return;
			}

			// if the linked lis is not empty
			else if (i == pos - 1)
			{
				Node nextNode = currentNode.next;
				Node prevNode = currentNode.previous;

				// changing the values
				prevNode.next = nextNode;
				nextNode.previous = prevNode;
			}

			currentNode = currentNode.next;

			size--;
		}
	}

	public int size()
	{
		Node node = first;
		while (node.next != null) 
		{
			node = node.next;
			size++;
		}
		return size;
	}
}
