// O n, O n
public void removeDup(LinkedListNode head){
	Set<Integer> seen = new HashSet<Integer>();
	LinkedListNode node = head;
	LinkedListNode pre = null;
	while(node!=null){
		if(!seen.add(node.val)){
			pre.next = node.next;
		}else{
			pre = node;
		}
		node = node.next;
	}
}

// O n^2, O 1
public void removeDup(LinkedListNode head){
	LinkedListNode cur = head;
	while(cur!=null){
		LinkedListNode nextNode = cur;
		while(nextNode.next!=null){
			if(nextNode.next.val==cur.val){
				nextNode.next = nextNode.next.next;
			}else{
				nextNode = nextNode.next;
			}
		}
		cur = cur.next;
	}
}
