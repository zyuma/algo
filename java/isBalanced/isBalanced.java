import java.util.*;
import java.io.*;

public class isBalanced{
	public static void main(String args[]){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		n1.left = n2;
		n1.right = n6;
		n2.left = n4;
		n2.right = n5;
		

		Print.TreeBFS(n1);
		System.out.println("min:"+minDepth(n1));
		System.out.println("max:"+maxDepth(n1));
		System.out.println("is balanced:"+isBalanced(n1));

	}
	public static int maxDepth(TreeNode root){
		if(root == null) return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return (left > right)? left+1:right+1;
	}
	public static int minDepth(TreeNode root){
		if(root == null) return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		if(left == 0 && right == 0) return 1; 
		if(left == 0 || right == 0) return (left > right)? left+1:right+1;
		return (left > right)? right+1:left+1;
	}
	public static boolean isBalanced(TreeNode root){
		int max = maxDepth(root);
		int min = minDepth(root);
		return (max-min) <= 1 && max-min >= 0;
	}
}
