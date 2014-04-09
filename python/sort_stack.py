class Node:
	def __init__(self, x):
		self.val = x
		self.next = None

class Stack:
	def __init__(self):
		self.top = None
	def push(self, n):
		n.next = self.top
		self.top = n
	def pop(self):
		temp = self.top
		self.top = self.top.next
		return temp
	def peek(self):
		if(self.top != None):
			return self.top.val
		else:
			return None
	def isEmpty(self):
		return self.top == None

def sort_stack(s1):
	s2 = Stack()
	while(not s1.isEmpty()):
		temp = s1.pop()
		while(not s2.isEmpty() and temp.val > s2.peek()):
			s1.push(s2.pop())
		s2.push(temp)
	return s2

n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)
n5 = Node(5)

s1 = Stack()
s1.push(n1)
s1.push(n2)
s1.push(n4)
s1.push(n3)
s1.push(n5)

cur = s1.top
while cur != None:
	print cur.val
	cur = cur.next

s2 = sort_stack(s1)
print "sorted"

cur = s2.top
while cur != None:
	print cur.val
	cur = cur.next

print "printed"

