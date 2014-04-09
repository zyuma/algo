import math

class Node:
	def __init__(self, x):
		self.val = x
		self.next = None

class TreeNode:
	def __init__(self, x):
		self.val = x
		self.left = None
		self.right = None

class LinkedList:
	def __init__(self):
		self.head = None
	def append(self, n):
		if self.head == None:
			self.head = n
			return
		cursor = self.head
		while cursor.next != None:
			cursor = cursor.next
		cursor.next = n
	def print_LL(self):
		cursor = self.head 
		while cursor != None:
			print cursor.val
			cursor = cursor.next
	def length(self):
		cursor = self.head
		count = 0
		while cursor != None:
			count += 1
			cursor = cursor.next
		return count
	def get(self, i):
		cursor = self.head
		count = 0
		while count < i:
			cursor = cursor.next
			count += 1
		return cursor

n1 = TreeNode(1)
n2 = TreeNode(2)
n3 = TreeNode(3)
n4 = TreeNode(4)
n5 = TreeNode(5)
n6 = TreeNode(6)
n7 = TreeNode(7)
n8 = TreeNode(8)
n1.left = n2
n1.right = n3
n2.left = n4
n2.right = n5
n3.left = n6
n6.left = n7
n7.right = n8


def Balanced_BT_to_LL(root):
	if root == None: return None
	q = []
	q.append(root)
	level = 0
	arr = []
	while len(q) != 0:
		ll = LinkedList()
		num_nodes = 0
		while math.pow(2, level) > num_nodes:
			if(len(q) == 0): break
			current = q.pop(0)
			ll.append(Node(current.val))
			num_nodes += 1
			if current.left != None:
				q.append(current.left)
			if current.right != None:
				q.append(current.right)
		arr.append(ll)
		level += 1
	print len(arr)
	return arr

def BT_to_LL(root):
	if root == None: return None
	arr = []
	ll = LinkedList()
	ll.append(Node(root))
	arr.append(ll)
	level = 0
	while(True):
		i = 0
		ll = LinkedList()
		for i in range(arr[level].length()):
			current = arr[level].get(i)
			if current.val.left != None:
				ll.append(Node(current.val.left))
			if current.val.right != None:
				ll.append(Node(current.val.right))
		if(ll.length() == 0):
			break
		arr.append(ll)
		level += 1

	return arr
			

print "testing func"
result = BT_to_LL(n1)

for i in result:
	print "-"
	cursor = i.head
	while cursor != None:
		print cursor.val.val
		cursor = cursor.next
	

