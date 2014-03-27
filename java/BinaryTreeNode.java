import java.util.*;
import java.io.*;

public class BinaryTreeNode{
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data){
		this.data = data;
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
