/*
 * Remove first occurrance of node with value d.
 */

public deleteNode(Node head, int d){
	Node n = head;
	if ( n.data == d) return head.next;
	while (n.next != null) {
		if (n.next.data == d) {
			n.next = n.next.next;
			return head;
		}
		n = n.next;
	}
}

