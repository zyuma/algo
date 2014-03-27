class Node:
	def __init__(self, x):
		self.val = x
		self.next = None
	
class Stack:
	def __init__(self):
		self.top = None
	def push(self, x):
		x.next = self.top
		self.top = x
	
	def pop(self):
		temp = self.top
		self.top = self.top.next
		return temp
	def print_stack(self):
		curr = self.top
		while curr != None:
			print curr.val
			curr = curr.next


n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)
n5 = Node(5)
n6 = Node(6)
n7 = Node(7)

s = Stack();
s.push(n1)
s.push(n2)
s.push(n3)
print "bfore"
s.print_stack()
s.pop()
s.push(n4)
s.push(n5)
s.push(n6)
s.push(n7)
print "after"
s.print_stack()
