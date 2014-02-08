import java.util.*;
import java.io.*;
	
public class traversalTest{
	public static void main(String args[]){
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		BinaryTreeNode root = BinaryTreeNode.sortedArrayToBST(arr, 0, arr.length-1);
		BinaryTreeNode.printBinaryTreeBFS(root);


		System.out.println("preorder recursive");
		treeTraversals.preorderRecursive(root);

		System.out.println("preorder iterative");
		treeTraversals.preorderIterative(root);

		System.out.println("inorder recursive");
		treeTraversals.inorderRecursive(root);
		System.out.println("inorder iterative");
		treeTraversals.inorderIterative(root);

		System.out.println("postorder recursive");
		treeTraversals.postorderRecursive(root);
		System.out.println("postorder iterative");
		treeTraversals.postorderIterative(root);




	}
}
