package hit.day28;

public class MyLinkedList {
	public static void main(String[] args) {
		MyLinkedList ll=new MyLinkedList();
		Node first=ll.new Node(10);
		ll.head=first;
		
		Node second=ll.new Node(20);
		first.next=second;
		
		Node third=ll.new Node(30);
		second.next=third;
		
		ll.printMyLL();
	}
	public void printMyLL(){
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	Node head;
	class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
		}
	}
	
}
