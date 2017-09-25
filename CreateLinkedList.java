//but when multiple objects need reference to the linked list, and the head of it changes
// bug comes!

class Node{
	Node next = null;
	int data;

	public Node(int d){
		data = d;
	}

	void appendToTail(ind d){
		Node end = new Node(d);
		Node n = this;
		if(n==null) return;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
}



