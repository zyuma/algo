import java.util.*;
import java.io.*;

public class BinaryTreeNode{
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data){
		this.data = data;
	}

	public static BinaryTreeNode sortedArrayToBST(int[] arr, int start, int end){
		if(start > end) return null;
		int mid = start + (end - start)/2;
		BinaryTreeNode node = new BinaryTreeNode(arr[mid]);
		node.left = sortedArrayToBST(arr, start, mid-1);
		node.right = sortedArrayToBST(arr, mid+1, end);
		return node;
	}

	public static int printBinaryTreeBFS(BinaryTreeNode root){
		if(root == null) return 0;
		ArrayList<BinaryTreeNode> queue = new ArrayList<BinaryTreeNode>();
		queue.add(root);
		while(queue.size() != 0){
			BinaryTreeNode current = queue.remove(0);
			System.out.println(current.data);
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
		return 1;
	}

}


