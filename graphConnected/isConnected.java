import java.util.*;
import java.io.*;

public class isConnected{
	public static void main(String args[]){
		GraphNode n0 = new GraphNode(0);
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		GraphNode n6 = new GraphNode(6);
		GraphNode n7 = new GraphNode(7);
		GraphNode n8 = new GraphNode(8);
		n0.neighbors.add(n1);
		n0.neighbors.add(n4);
		n1.neighbors.add(n2);
		n2.neighbors.add(n3);
		n3.neighbors.add(n5);
		n4.neighbors.add(n5);

		System.out.println(isConnected(n1,n4));

	}
	public static boolean isConnected(GraphNode i, GraphNode j){
		if(i == null || j == null || i.neighbors.size() == 0) return false;
		if(i.val == j.val) return true;
		ArrayList<GraphNode> queue = new ArrayList<GraphNode>();
		queue.add(i);
		GraphNode current, next;
		while(queue.size() != 0){
			current = queue.remove(0);
			System.out.println(current.val);
			if(current.visited == false){
				if(current.val == j.val) return true;
				while(current.neighbors.size() != 0){
					next = current.neighbors.remove(0);
					if(next.visited == false)
						queue.add(next);
				}
				current.visited = true;
			}
		}
		return false;
	}
}



