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
		if(self.top == None):
			return None
		temp = self.top
		self.top = self.top.next
		return temp
	def print_stack(self):
		cursor = self.top
		while cursor != None:
			print cursor.val
			cursor = cursor.next
"""
s = Stack()
s.push(Node(1))
s.push(Node(2))
s.push(Node(3))
s.print_stack()
s.pop()
s.print_stack()
"""

class queue_with_2stacks:
	def __init__(self):
		self.s1 = Stack()
		self.s2 = Stack()
	def enqueue(self, n):
		self.s1.push(n)
		if(self.s2.top == None):
			while(self.s1.top != None):
				self.s2.push(self.s1.pop())
	def dequeue(self):
		temp = self.s2.pop()
		if(self.s2.top == None):
			while(self.s1.top != None):
				self.s2.push(self.s1.pop())
		return temp
	def status(self):
		print "s1:"
		self.s1.print_stack()
		print "s2:"
		self.s2.print_stack()


	
q = queue_with_2stacks()
n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
q.enqueue(n3)
q.status()
q.enqueue(n2)
q.status()
q.enqueue(n1)
q.status()
q.dequeue()
q.status()
q.dequeue()
q.status()
q.enqueue(Node(5))
q.status()

