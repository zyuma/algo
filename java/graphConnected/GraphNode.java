import java.util.*;
import java.io.*;

public class GraphNode{
	int val;
	boolean visited;
	ArrayList<GraphNode> neighbors;
	public GraphNode(int i){
		val = i;
		neighbors = new ArrayList<GraphNode>();
		visited = false;
	}
}

