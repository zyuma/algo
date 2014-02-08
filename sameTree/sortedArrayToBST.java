import java.util.*;
import java.io.*;

public class sortedArrayToBST{
	public static void main(String args[]){
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,0)));


		System.out.println("testing second:");
		
		BinaryTreeNode root = sortedArrayToBST(arr, 0, arr.length -1);
		System.out.println("printing1");
		printBinaryTreeBFS(root);
		BinaryTreeNode root2 = sortedArrayToBST2(arr);
		System.out.println("printing2");
		printBinaryTreeBFS(root2);


	}




	public static BinaryTreeNode sortedArrayToBST(int[] arr, int start, int end){
		if(start>end) return null;
		int mid = start + (end - start)/2;
		BinaryTreeNode node = new BinaryTreeNode(mid);
		node.left = sortedArrayToBST(arr, start, mid-1);
		node.right = sortedArrayToBST(arr, mid+1, end);
		return node;
	}

	public static BinaryTreeNode sortedArrayToBST2(int[] arr){
		if(arr.length == 0) return null;
		int mid = (arr.length-1) / 2;
		BinaryTreeNode new_node = new BinaryTreeNode(arr[mid]);
		new_node.left = sortedArrayToBST2(Arrays.copyOfRange(arr, 0, mid));
		new_node.right = sortedArrayToBST2(Arrays.copyOfRange(arr, mid+1, arr.length));
		return new_node;
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

