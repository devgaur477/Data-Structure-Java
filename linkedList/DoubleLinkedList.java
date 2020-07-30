package linkedList;

public class DoubleLinkedList {
	
	
	int size;
	DNode header , tail;
	
	
	
	static class DNode{
		DNode next;
		DNode prev;
		int data;
		
		
		public DNode(DNode n , DNode p , int d) {
			next = n;
			prev = p;
			data = d;
		}
		
		public DNode getNext() {
			return next;
		}
		
		public DNode getPrev() {
			return prev;
		}
		
		public int getData() {
			return data;
		}
		
		public void setNext(DNode newNext) {
			next = newNext;
			
			
		}
		
		public void setPrev(DNode newPrev) {
			prev = newPrev;
		}
		
		public void setElement(int newData) {
			data = newData;
		}
		
		
	}
	
	
	public DoubleLinkedList() {
		size = 0;
		header = new DNode(null, null, 0);
		tail = new DNode(null, null, 0);
		header.setNext(tail);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public DNode getFirst() throws IllegalArgumentException{
		if(isEmpty()) throw new IllegalArgumentException("The list is Empty");
		
		return header.getNext();
	}
	
	public DNode getLast() throws IllegalArgumentException{
		if(isEmpty()) throw new IllegalArgumentException("The list is empty");
		
		return tail.getNext();
	}
	
	public DNode getNext(DNode v) {
		return v.getNext();
	}
	
	public DNode getPrev(DNode v) {
		return v.getPrev();
	}
	
	public void addBefore(DNode v , DNode z) {
		DNode u = getPrev(v);
		z.setPrev(u);
		z.setNext(v);
		v.setPrev(z);
		u.setNext(z);
		size++;
		
	}
	
	public void addAfter(DNode v , DNode z) {
		
		DNode u = getNext(v);
		z.setNext(u);
		z.setPrev(v);
		u.setPrev(z);
		v.setNext(z);
		size++;
		
	}
	
	public void addFirst(DNode v) {
		addAfter(header , v);
	}
	
	public void addLast(DNode v) {
		addBefore(tail, v);
	}
	
	public void remove(DNode v) {
		DNode u = getNext(v);
		DNode w = getNext(v);
		
		w.setPrev(u);
		u.setNext(w);
		v.setNext(null);
		v.setPrev(null);
		size--;
	}
	
	public void print() {
		String s = ",";
		DNode v = header.getNext();
		
		while(v!=tail) {
			s = s + v.getData();
			v = v.getNext();
			if(v!=tail) {
				s = s + ",";
			}
			
			System.out.println(s);
		}
	}
	
	
	

	public static void main(String[] args) {
		
		DoubleLinkedList obj = new DoubleLinkedList() ;
		DNode node1 = new DNode(null, null, 2);
		DNode node2 = new DNode(node1 , null , 5) ;
		DNode node3 = new DNode(node2 , node1 , 10);
		obj.addFirst(node1);
		obj.addAfter(node1, node2);
		obj.addBefore(node2, node3);
		obj.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
