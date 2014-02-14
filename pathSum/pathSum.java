import java.io.*;
import java.util.*;

public class pathSum{
	ArrayList<Integer> pathTotals = new ArrayList<Integer>();
	public static void main(String args[]){
		BinaryTreeNode one = new BinaryTreeNode(1);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three = new BinaryTreeNode(3);
		BinaryTreeNode four = new BinaryTreeNode(4);
		BinaryTreeNode five = new BinaryTreeNode(5);
		BinaryTreeNode six = new BinaryTreeNode(6);
		BinaryTreeNode seven = new BinaryTreeNode(7);
		one.left = two;
		one.right = three;
		pathSum ex = new pathSum();
		System.out.println(ex.sumNumbers(one));

	}
	public int sumNumbers(BinaryTreeNode root){
		pathTotal(root, 0);
		int sum = 0;
		//System.out.println(Arrays.toString(pathTotals));
		for(Integer i:pathTotals){
			sum += i;
			System.out.println(i);
		}
		return sum;
	}
	public int pathTotal(BinaryTreeNode root, int n){
		if(root == null) return 0;
		int sum = root.data + n;
		System.out.println(sum);
		if(root.left == null && root.right == null){
			pathTotals.add(new Integer(sum));
			return 0;
		}
		pathTotal(root.left, sum*10);
		pathTotal(root.right, sum*10);
		return 1;
	}
}
