class ListNode:
	def __init__(self, x):
		self.val = x
		self.next = None
	def printList(self, head):
		while head != None:
			print head.val
			head = head.next


def remove_dup(head):
	start = head
	while start != None:
		curr = start.next
		prev = start
		while curr != None:
			if start.val == curr.val:
				prev.next = curr.next
				curr = curr.next
			else:
				prev = curr
				curr = curr.next
		start = start.next

n1 = ListNode(1)
n2 = ListNode(1)
n3 = ListNode(2)
n4 = ListNode(6)
n5 = ListNode(4)
n6 = ListNode(1)
n7 = ListNode(6)

n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n5
n5.next = n6
n6.next = n7

print "start:"
n1.printList(n1)
remove_dup(n1)
print "after"
n1.printList(n1)
