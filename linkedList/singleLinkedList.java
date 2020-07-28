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
	
	static Node head;  // Object of that Class , this is the first object known as head and it's value is basically zero
	long size;
	
	public singleLinkedList() {
		head = null;
		size = 0;
	}
	
	
	public void insertAtTail(int toBeAdded) {
//		Node newNode = new Node(toBeAdded);
//		size++;
//		newNode.next = head;
//		head = newNode;
		Node newNode = head;
		size++;
		if(head == null) {
			newNode = new Node(toBeAdded);
		}
		
		while(newNode.next!=null) {
			newNode = newNode.next;
		}
		newNode.next = 	new Node(toBeAdded);
		
	 
	 System.out.println(newNode.data);
//	 System.out.println(newNode.getNext());
//	 System.out.println("The size of the linked list is " +size);
		
		
		  
		
		
	}
//	
//	public void inBetween(Node previous_Node , int position , int d) {
//				
//				if(position ==1) {
//					Node newNode = new Node(d);
//					newNode.next = head;
//					head = newNode;
//				}
//				else {
//					while(position--!=0) {
//						if(position == 1) {
//							Node newNode = new Node(d);
//							
//							newNode.next = head.next;
//							head.next = newNode;
//							break;
//						}
//						head = head.next;
//					}
//					
//				}
//		
//		
//	}
//	
	
	
	
	public static void main(String[] args) {
		singleLinkedList obj = new singleLinkedList();
		
		
		
		
		obj.insertAtTail(2);
		obj.insertAtTail(3);
		obj.insertAtTail(6);
		obj.insertAtTail(8);
//		obj.inBetween(3);
	
		
		
	}

}
