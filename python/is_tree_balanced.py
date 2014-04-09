class TreeNode:
	def __init__(self, x):
		self.val = x
		self.left = None
		self.right = None

def print_tree(root):
	if root == None:
		return
	print root.val
	print_tree(root.left)
	print_tree(root.right)
	return

def max_depth(root):
	if root == None:
		return 0
	left = max_depth(root.left)
	right = max_depth(root.right)
	return max(left, right)+1

def min_depth(root):
	if root == None:
		return 0
	left = min_depth(root.left)
	right = min_depth(root.right)
	if left == 0 and right == 0:
		return 1
	if left == 0 or right == 0:
		return max(left,right)+1
	return min(left, right)+1

def is_tree_balanced(root):
	maxDepth = max_depth(root)
	print maxDepth
	minDepth = min_depth(root)
	print minDepth
	return maxDepth - minDepth < 2

n1 = TreeNode(1)
n2 = TreeNode(2)
n3 = TreeNode(3)
n4 = TreeNode(4)
n5 = TreeNode(5)
n6 = TreeNode(6)
n7 = TreeNode(7)

n1.left = n2
n1.right = n3
n2.left = n4
n2.right = n5
n4.left = n7
n4.right = n6
print_tree(n1)


print is_tree_balanced(n1)

	
