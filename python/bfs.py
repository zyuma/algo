class TreeNode:
	def __init__(self, x):
		self.val = x
		self.left = None
		self.right = None


def levelOrder(root):
	if root == None:
		return None
	queue = []
	queue.append(root)
	current = TreeNode(0)
	while len(queue) != 0:
		current = queue.pop(0);
		print current.val
		if(current.left != None):
			queue.append(current.left)
		if(current.right != None):
			queue.append(current.right)

n1 = TreeNode(1)
n2 = TreeNode(2)
n3 = TreeNode(3)
n4 = TreeNode(4)
n5 = TreeNode(5)
n6 = TreeNode(6)
n7 = TreeNode(7)

n1.left = n7
n1.right = n3
n2.left = n5
n2.right = n4
n3.left = n6
n3.right = n2

levelOrder(n1)
