import java.util.*;
import java.io.*;

public class GraphTest {
	public static void main(String args[]){
		Graph graph = new Graph();
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		Node i = new Node("i");
		Node z = new Node("z");
		ArrayList<Node> a1 = new ArrayList<Node>();
		a1.add(b);
		a1.add(c);
		a1.add(d);
		System.out.println(a1);
		ArrayList<Node> b1 = new ArrayList<Node>();	
		b1.add(d);
		ArrayList<Node> c1 = new ArrayList<Node>();
		c1.add(g);
		ArrayList<Node> d1 = new ArrayList<Node>();
		d1.add(f);
		ArrayList<Node> e1 = new ArrayList<Node>();
		e1.add(h);
		ArrayList<Node> f1 = new ArrayList<Node>();
		f1.add(e);
		ArrayList<Node> g1 = new ArrayList<Node>();
		g1.add(f);
		ArrayList<Node> h1 = new ArrayList<Node>();
		h1.add(i);
		ArrayList<Node> i1 = new ArrayList<Node>();
		i1.add(f);
		graph.put(a, a1);
		graph.put(b, b1);
		graph.put(c, c1);
		graph.put(d, d1);
		graph.put(e, e1);
		graph.put(f, f1);
		graph.put(g, g1);
		graph.put(h, h1);
		graph.put(i, i1);

		graph.printGraph();

		System.out.println(bfsqueue.isConnectedBFS(graph, a, i));
		System.out.println(bfsqueue.isConnectedBFS(graph, b, g));
		System.out.println(bfsqueue.isConnectedBFS(graph, c, g));
		System.out.println(bfsqueue.isConnectedBFS(graph, b, z));
		System.out.println(bfsqueue.isConnectedBFS(graph, z, g));
		System.out.println(bfsqueue.isConnectedBFS(graph, d, a));
	}

}
