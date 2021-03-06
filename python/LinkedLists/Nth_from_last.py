class ListNode:
	def __init__(self, x):
		self.val = x
		self.next = None
	def printList(self, head):
		while head != None:
			print head.val
			head = head.next

def Nth_from_last(head, N):
	if N == 0: return head
	Nth = head
	i = 1
	head = head.next
	while i<=N:
		if head.next == None:
			return head
		head = head.next
		i += 1
	while head != None:
		head = head.next
		Nth = Nth.next
	return Nth


n1 = ListNode(1)
n2 = ListNode(2)
n3 = ListNode(3)
n4 = ListNode(4)
n5 = ListNode(5)
n6 = ListNode(6)
n7 = ListNode(7)

n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n5
n5.next = n6
n6.next = n7

print "start:"
n1.printList(n1)
print "7th from last:"
final = Nth_from_last(n1,100)
print final.val
