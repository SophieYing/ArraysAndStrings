//O 1
public boolean deleteMiddle(LinkedListNode node){
	if(node==null || node.next = null){
		return false;
	}else{
		LinkedListNode next = node.next;
		node.val = next.val;
		node.next = next.next;
		return true;
	}
}
