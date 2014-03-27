class TreeNode:
	def __init__(self, x):
		self.val = x
		self.left = None
		self.right = None
	def print_dfs(self, root):
		if root == None:
			return
		print root.val
		self.print_dfs(root.left)
		self.print_dfs(root.right)
		return
	
	def hasPathSum(self, root, total):
		if(root == None):
			return False
		return self.check_path_total(root, total, 0)
	def check_path_total(self, root, total, sofar):
		if root == None:
			return None
		sofar += root.val
		print sofar
		left = self.check_path_total(root.left, total, sofar)
		right = self.check_path_total(root.right, total, sofar)
		if left == True or right == True:
			return True
		elif left == None and right == None:
			if total == sofar:
				return True
		return False

"""	
def check_path_total(root, total, sofar):
	if root == None:
		return None
	sofar += root.val
	print sofar
	left = check_path_total(root.left, total, sofar)
	right = check_path_total(root.right, total, sofar)
	if left == True or right == True:
		return True
	elif left == None and right == None:
		if total == sofar:
			return True
	return False
"""

n0 = TreeNode(5)
n1 = TreeNode(4)
n2 = TreeNode(8)
n3 = TreeNode(11)
n4 = TreeNode(13)
n5 = TreeNode(4)
n6 = TreeNode(7)
n7 = TreeNode(2)
n8 = TreeNode(1)

n0.left = n1
n0.right = n2
n1.left = n3
n3.left = n6
n3.right = n7
n2.left = n4
n2.right = n5
n5.right = n8
n0.print_dfs(n0)

print "checking"
print n0.hasPathSum(None, 17)

