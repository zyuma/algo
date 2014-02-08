import java.util.*;
import java.io.*;

public class BinaryTreeNode{
	int data;
	BinaryTreeNode parent;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data){
		this.data = data;
		parent = null;
		left = null;
		right = null;
	}

	public BinaryTreeNode getLeft(){
		return this.left;
	}
	public BinaryTreeNode getRight(){
		return this.right;
	}
	public int getData(){
		return this.data;
	}
}
