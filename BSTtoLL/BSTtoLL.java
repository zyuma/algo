import java.util.*;
import java.io.*;
import java.lang.Math;

public class BSTtoLL{
	public static LLNode BSTtoLL(BinaryTreeNode root){
		if(root == null) return null;
		ArrayList<BinaryTreeNode> queue = new ArrayList<BinaryTreeNode>();
		if(root.left != null) queue.add(root.left);
		if(root.right != null) queue.add(root.right);
		int level = 2, traversed=1, sum=0;
		int required_traversal = (int)Math.pow(2,level)-1;
		LLNode top = new LLNode(root.data);
		System.out.println(required_traversal);
		while(queue.size() != 0){
			BinaryTreeNode current = queue.remove(0);
			traversed++;
			System.out.println("Traversed: "+traversed);
			sum += current.data;
			System.out.println("Sum is: " + sum);
			if(traversed == required_traversal){
				LLNode new_node = new LLNode(sum);
				System.out.println("Appending: " + sum);
				sum = 0;
				top.append(new_node);
				level++;
				required_traversal = (int)Math.pow(2,level)-1;
				System.out.println("Required traversal: "+required_traversal);
			}
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
		if(sum != 0){
			LLNode new_node = new LLNode(sum);
			top.append(new_node);
		}
		return top;
	}
}
