import java.io.*;
import java.util.*;

public class levelOrder{
	public static void main(String args[]){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode();

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		Print.TreeBFS(n1);
		
		ArrayList<ArrayList<Integer>> levelArr = new ArrayList<ArrayList<Integer>>();
		levelArr = levelOrder(n7);
		for(ArrayList<Integer> i:levelArr)
			Print.ArrayListInteger(i);


	}
	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
		ArrayList<ArrayList<Integer>> levelArr = new ArrayList<ArrayList<Integer>>();
		if(root == null) return levelArr;
		ArrayList<Integer> level = new ArrayList<Integer>();
		ArrayList<TreeNode> q = new ArrayList<TreeNode>();
		q.add(root);
		TreeNode current;
		int nodeLeft = 1;
		int nodeInNextLevel = 0;
		while(q.size() != 0){
			current = q.remove(0);
			level.add(current.val);
			nodeLeft--;
			if(current.left != null){
				q.add(current.left);
				nodeInNextLevel++;
			}
			if(current.right != null){
				q.add(current.right);
				nodeInNextLevel++;
			}
			if(nodeLeft == 0){
				levelArr.add(new ArrayList<Integer>(level));
				level.clear();
				nodeLeft = nodeInNextLevel;
				nodeInNextLevel = 0;
			}
		}
		return levelArr;
	}
}
