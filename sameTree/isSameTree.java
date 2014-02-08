import java.util.*;
import java.io.*;

public class isSameTree{
	public static void main(String args[]){
		int[] arr1 = {1,2};
		int[] arr2 = {1,#,2};
		BinaryTreeNode r1 = sortedArrayToBST.sortedArrayToBST2(arr1);
		BinaryTreeNode r2 = sortedArrayToBST.sortedArrayToBST2(arr2);

		System.out.println(isSameTree(r1, r1));
		System.out.println(isSameTree(r1, r2));
		
	}
	public static boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q){
		if((p == null)&&(q == null)) return true;
		else if((p == null)||(q == null)) return false;
		BinaryTreeNode cur1, cur2;
		ArrayList<BinaryTreeNode> s1 = new ArrayList<BinaryTreeNode>();
		ArrayList<BinaryTreeNode> s2 = new ArrayList<BinaryTreeNode>();
		s1.add(p);
		s2.add(q);
		while((s1.size() != 0)){
			cur1 = s1.remove(s1.size()-1);
			cur2 = s2.remove(s2.size()-1);
			if(cur1.data != cur2.data) return false;
			if(cur1.left != null) s1.add(cur1.left);
			if(cur1.right != null) s1.add(cur1.right);
			if(cur2.left != null) s2.add(cur2.left);
			if(cur2.right != null) s2.add(cur2.right);
			if(s1.size() != s2.size()) return false;
		}
		return true;
	}
}
