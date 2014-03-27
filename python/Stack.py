class Node:
	def __init__(self, x):
		self.val = x
		self.next = None
		self.smallest = self
	
class Stack:
	def __init__(self):
		self.top = None
	def push(self, x):
		if self.top != None and x.val > self.top.smallest.val:
			x.smallest = self.top.smallest
		x.next = self.top
		self.top = x	
	def pop(self):
		temp = self.top
		self.top = self.top.next
		return temp
	def smallest(self):
		return self.top.smallest.val

	def print_stack(self):
		curr = self.top
		while curr != None:
			print curr.val
			curr = curr.next


n1 = Node(7)
n2 = Node(4)
n3 = Node(5)
n4 = Node(6)
n5 = Node(3)
n6 = Node(2)
n7 = Node(1)

s = Stack();
s.push(n1)
print s.smallest()
s.push(n2)
print s.smallest()
s.push(n3)
print s.smallest()
s.push(n4)
print s.smallest()
s.push(n5)
print s.smallest()
s.push(n6)
print s.smallest()
s.push(n7)
print s.smallest()
print "after"
s.print_stack()
