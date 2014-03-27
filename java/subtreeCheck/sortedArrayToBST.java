import java.util.*;
import java.io.*;

public class sortedArrayToBST{
	public static void main(String args[]){
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		
		BinaryTreeNode root = sortedArrayToBST(arr, 0, arr.length-1);
		
		printBinaryTreeBFS(root);
	}




	public static BinaryTreeNode sortedArrayToBST(int[] arr, int start, int end){
		if(start>end) return null;
		int mid = start + (end - start)/2;
		BinaryTreeNode node = new BinaryTreeNode(mid);
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

