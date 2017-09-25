//找倒数第k个节点

//O n O 1
//recursive, but only print the value of the node, cannot get the node
public int kthToEnd(LinkedListNode head, int k){
	if(head==null){
		return 0;
	}
	int index = kthToEnd(head.next,k)+1;
	if(index==k){
		System.out.println(head.val);
	}
	return index;
}

//O n O 1
//recursive, return the node
class Index{
	public int value = 0;
}
public LinkedListNode kthToEnd2(LinkedListNode head, int k){
	Index index = new index();
	return kthToEnd2(head,k,index);
}
public LinkedListNode kthToEnd2(LinkedListNode head, int k, Index index){
	if(head==null){
		return null;
	}
	LinkedListNode node = kthToEnd2(head.next, k, index);
	index.value = index.value + 1;
	if(index.value==k){
		return head;
	}
	return node;
}

//O n O 1, iterative
    public LinkedListNode kthToEnd3(LinkedListNode head, int k) {
        LinkedListNode cur = head;
        LinkedListNode fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            cur = cur.next;
        }
        return cur;
    }
