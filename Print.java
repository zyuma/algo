import java.io.*;
import java.util.*;

public class Print{
	public static void main(String args[]){
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		ArrayListInteger(t1);
	}

	public static void ArrayListInteger(ArrayList<Integer> arr){
		for(Integer i:arr){
			System.out.println(i);
		}
	}

	public static void LLint(LLnode head){
		LLnode cursor = head;
		while(cursor != null){
			System.out.println(cursor.val);
		}
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
	public static int printTreeBFS(TreeNode root){
		if(root == null) return 0;
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		queue.add(root);
		while(queue.size() != 0){
			TreeNode current = queue.remove(0);
			System.out.println(current.val);
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
		return 1;
	}
}
