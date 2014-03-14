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
		if(arr.size() == 0 || arr == null) System.out.println("[]");
		System.out.print("[");
		for(int i=0; i<arr.size()-1; i++){
			System.out.print(arr.get(i) + ",");
		}
		System.out.println(arr.get(arr.size()-1) + "]");
	}

	public static int TreeBFS(TreeNode root){
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
