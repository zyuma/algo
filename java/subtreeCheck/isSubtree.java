import java.util.*;
import java.io.*;

public class isSubtree{
	public static void main(String args[]){
		System.out.println(true);
		//Make tree 1
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
		
		one.left = three;
		one.right = four;
		
		two.left = five;
		two.right = six;

		three.left = seven;

		six.left = eight;

		eight.right = nine;

		System.out.println("Tree1:");
		sortedArrayToBST.printBinaryTreeBFS(zero);
		

		//Make tree 2
		BinaryTreeNode one2 = new BinaryTreeNode(1);
		BinaryTreeNode three2 = new BinaryTreeNode(3);
		BinaryTreeNode four2 = new BinaryTreeNode(4);
		BinaryTreeNode seven2 = new BinaryTreeNode(7);
		
		one2.left = three2;
		//one2.right = four2;

		three2.left = seven2;
		
		System.out.println("Tree2:");
		sortedArrayToBST.printBinaryTreeBFS(one2);

		System.out.println("Can you compare nodes directly?");
		if(one == one2)
			System.out.println("yes");
		else
			System.out.println("no");


		//Test subtree method
		System.out.println(isSubtree(zero, one2));

	}


	public static boolean isSubtree(BinaryTreeNode t1, BinaryTreeNode t2){
		BinaryTreeNode curr1, curr2;
		ArrayList<BinaryTreeNode> stack1 = new ArrayList<BinaryTreeNode>();
		stack1.add(t1);
		ArrayList<BinaryTreeNode> stack2 = new ArrayList<BinaryTreeNode>();
		stack2.add(t2);
		while(stack1.size() != 0){
			curr1 = stack1.remove(stack1.size()-1);
			System.out.printf("curr1: %d\n", curr1.data);
			curr2 = stack2.remove(stack2.size()-1);
			if(curr1.data == curr2.data){
				System.out.printf("curr2: %d\n", curr2.data);
				if(curr2.left != null) stack2.add(curr2.left);
				if(curr2.right != null) stack2.add(curr2.right);
				if(stack2.size() == 0){
					return true;
				}
			}
			else{
				stack2 = new ArrayList<BinaryTreeNode>();
				stack2.add(t2);
			}
			if(curr1.left != null) stack1.add(curr1.left);
			if(curr1.right != null) stack1.add(curr1.right);
		}
		return false;
	}
}
			
			

