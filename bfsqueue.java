import java.util.*;
import java.io.*;

public class bfsqueue{

	//only for traversing through a tree, where there are no loops
	public static boolean isConnectedBFS(Graph g, Node a, Node b){
		ArrayList<Node> visited = new ArrayList<Node>();
		if((!g.keySet().contains(a)) || (!g.keySet().contains(b)))return false;
		ArrayList<Node> q = new ArrayList<Node>();
		q.add(a);
		while(q.size()!=0){
			Node current = q.remove(0);
			visited.add(current);
			if(current == b) return true;
			for(Node i:g.get(current)){
				if (!visited.contains(i)){
					q.add(i);
				}
			}
		}
		return false;
	}
}	
	
	
