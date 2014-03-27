import java.util.*;
import java.io.*;

public class treeTraversals {
	public static int preorderRecursive(BinaryTreeNode root){
		if(root == null) return 0;
		System.out.println(root.data);
		int left = preorderRecursive(root.left);
		int right = preorderRecursive(root.right);
		return (left>right)? left+1:right+1;
	}
	public static void preorderIterative(BinaryTreeNode root){
		if(root == null) return;
		BinaryTreeNode current;
		ArrayList<BinaryTreeNode> stack = new ArrayList<BinaryTreeNode>();
		stack.add(root);
		while(stack.size() != 0){
			current = stack.remove(stack.size()-1);
			System.out.println(current.data);
			if(current.right != null) stack.add(current.right);
			if(current.left != null) stack.add(current.left);
		}
	}
	public static void inorderRecursive(BinaryTreeNode root){
		if(root == null) return;
		inorderRecursive(root.left);
		System.out.println(root.data);
		inorderRecursive(root.right);
	}

	public static void inorderIterative(BinaryTreeNode root){
		if(root == null) return;
		BinaryTreeNode current = root;
		ArrayList<BinaryTreeNode> stack = new ArrayList<BinaryTreeNode>();
		boolean done = false;
		while(done == false){
			if(current != null){
				stack.add(current);
				current = current.left;
			}
			else{
				if(stack.size()==0){
					done = true;
				}
				else{
					current = stack.remove(stack.size()-1);
					System.out.println(current.data);
					current = current.right;
				}
			}
		}
	}



	public static void postorderRecursive(BinaryTreeNode root){
		if(root == null) return;
		postorderRecursive(root.left);
		postorderRecursive(root.right);
		System.out.println(root.data);
	}
	public static void postorderIterative(BinaryTreeNode root){
		if(root == null) return;
		BinaryTreeNode current = root, prev = null;
		ArrayList<BinaryTreeNode> stack = new ArrayList<BinaryTreeNode>();
		stack.add(current);
		while(stack.size() != 0){
			current = stack.get(stack.size()-1);
			if((prev == null)||(prev.left == current)||(prev.right == current)){
				if(current.left != null) stack.add(current.left);
				else if(current.right != null) stack.add(current.right);
			}
			else if(current.left == prev){
				if(current.right != null) stack.add(current.right);
			}
			else {
				System.out.println(current.data);
				stack.remove(stack.size()-1);
			}
			prev = current;
		}
	}

}
