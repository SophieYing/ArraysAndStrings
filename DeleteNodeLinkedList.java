//delete node

//My
Node deleteNode(Node head, int d){
	if(head.data!=d){
		Node n = head;
		while(n.next!=null){
			if(n.next.data!=d){
				n = n.next;
			}else{
				n.next = n.next.next;
				break;
			}
		}
	}else{
		head = head.next;
	}
	return head;
}

//Book
Node deleteNode(Node head, int d){
	Node n = head;
	if(n.data == d){
		return head.next;
	}else{
		while(n.next != null){
			if(n.next.data = d){
				n.next = n.next.next;
				return head;
			}else{
				n = n.next;
			}
		}
	}
	return head;
}