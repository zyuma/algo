import java.util.*;
import java.io.*;

public class nextNodeInOrder{
	public static void main(String args[]){
		BinaryTreeNode zero = new BinaryTreeNode(0);
		BinaryTreeNode one = new BinaryTreeNode(1);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three = new BinaryTreeNode(3);
		BinaryTreeNode four = new BinaryTreeNode(4);
		BinaryTreeNode five = new BinaryTreeNode(5);
		BinaryTreeNode six = new BinaryTreeNode(6);
		BinaryTreeNode seven = new BinaryTreeNode(7);
		BinaryTreeNode eight = new BinaryTreeNode(8);
		BinaryTreeNode nine = new BinaryTreeNode(9);

		zero.left = one;
		zero.right = two;
		
		one.parent = zero;
		one.left = three;
		one.right = four;
		
		two.parent = zero;
		two.left = five;
		two.right = six;

		three.parent = one;
		three.left = seven;

		four.parent = one;

		five.parent = two;

		six.parent = two;
		six.left = eight;

		seven.parent = three;

		eight.parent = six;
		eight.right = nine;

		nine.parent = eight;

		sortedArrayToBST.printBinaryTreeBFS(zero);
		System.out.println("Testing...");
		System.out.println(nextNodeInOrder(one).data);
		System.out.println(nextNodeInOrder(seven).data);
		System.out.println(nextNodeInOrder(nine).data);
		System.out.println(nextNodeInOrder(six).data);
		System.out.println(nextNodeInOrder(two).data);
		System.out.println(nextNodeInOrder(five).data);
		//still need to fix printing out null, resulting in nullpointer ERROR
	}


	public static BinaryTreeNode nextNodeInOrder(BinaryTreeNode e){
		System.out.println("Start!");
		if((e==null) || ((e.parent==null)&&(e.right==null))){
			System.out.println("Enter node in  a tree!");
			return null;
		}
		if(e.right != null){
			BinaryTreeNode current = e.right;
			while(current.left!=null){
				current = current.left;
			}
			return current;
		}
		else if(e.parent == null){
			System.out.println("Node is the root in the tree!");
			return null;
		}
		else {
			BinaryTreeNode current = e;
			while(current == current.parent.right){
				current = current.parent;
				if(current.parent == null){
					System.out.println("Node is right-most in a tree!");
					return null;
				}
			}
			return current.parent;
		}
	}
}
			
			

