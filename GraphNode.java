import java.util.*;
import java.io.*;

public class GraphNode{
	int val;
	boolean visited;
	ArrayList<GraphNode> neighbors;
	public GraphNode(int i, ArrayList<GraphNode> nei){
		val = i;
		nei = neighbors;
		visited = false;
	}
}

