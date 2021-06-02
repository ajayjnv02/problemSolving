package doublylinkedlist;

public class Program {
	static class DoublyLinkedList {
		public Node head;
		public Node tail;

		public void setHead(Node node) {
			this.head = node;
		}

		public void setTail(Node node) {
			this.tail = node;
		}

		public void insertBefore(Node node, Node nodeToInsert) {

			Node temp = head;
			while (temp != null || node.value == temp.value) {
				temp = temp.next;
			}
			nodeToInsert.next = temp;
			nodeToInsert.prev = temp.prev;
			temp.prev.next = nodeToInsert;
			temp.prev = nodeToInsert;
		}

		public void insertAfter(Node node, Node nti) {
			Node temp = head;
			while (temp != null || node.value == temp.value) {
				temp = temp.next;
			}
			nti.prev = temp;
			nti.next = temp.next;
			nti.next.prev = nti;
			temp.next = nti;

		}

		public void insertAtPosition(int position, Node nodeToInsert) {
			Node temp = head;
			int i =0;
			while (i<position) {
				temp = temp.next;
				i++;
			}
			
			
		}

		public void removeNodesWithValue(int value) {
			// Write your code here.
		}

		public void remove(Node node) {
			// Write your code here.
		}

		public boolean containsNodeWithValue(int value) {
			// Write your code here.
			return false;
		}
	}

	// Do not edit the class below.
	static class Node {
		public int value;
		public Node prev;
		public Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
