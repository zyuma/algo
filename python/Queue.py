class Node:
	def __init__(self, x):
		self.val = x
		self.next = None
	
class Queue:
	def __init__(self):
		self.front = None
		self.end = None
	def enqueue(self, n):
		if(self.end == None):
			self.front = n
			self.end = self.front
		else:
			self.end.next = n
			self.end = self.end.next
	
	def dequeue(self):
		if(self.front == None):
			return None
		else:
			temp = self.front
			self.front = self.front.next
			return temp
	def print_queue(self):
		curr = self.front
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

q = Queue();
q.enqueue(n1)
q.enqueue(n2)
q.enqueue(n3)
q.dequeue()
q.enqueue(n4)
q.enqueue(n5)
q.enqueue(n6)
q.enqueue(n7)
q.print_queue()
