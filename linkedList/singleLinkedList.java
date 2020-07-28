package linkedList;

public class singleLinkedList {
	
	
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
			
		}
		
		public int getdata() {
			return data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public int setData(int newData) {
			return newData = data;
		}
		
		public Node setNext(Node newNext) {
			return newNext = next;
		}
	}
	
	Node head;  // Object of that Class , this is the first object known as head and it's value is basically zero
	long size;
	
	public singleLinkedList() {
		head = null;
		size = 0;
	}
	
	
	public void insert(int toBeAdded) {
		Node newNode = new Node(toBeAdded);
		size++;
		newNode.next = head;
		head = newNode;
		
	 
	 System.out.println(newNode.data);
	 System.out.println(newNode.getNext());
		
		
		  
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		singleLinkedList obj = new singleLinkedList();
		obj.insert(2);
		obj.insert(3);
		obj.insert(6);
		
		
	}

}
