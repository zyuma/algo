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

def sorted_array_to_balanced_tree(arr, start, end):
	if end - start < 0:
		return None
	middle = start + (end - start)/2
	n = TreeNode(arr[middle])
	n.left = sorted_array_to_balanced_tree(arr, start, middle-1)
	n.right = sorted_array_to_balanced_tree(arr, middle+1, end)
	return n

arr = [0,1,2,3,4,5,6,7,8]
root = sorted_array_to_balanced_tree(arr, 0, len(arr)-1)
print_tree(root)
