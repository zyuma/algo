import java.util.*;
import java.io.*;

public class Graph{
	private HashMap<Node,ArrayList<Node>> graph;
	public Graph(){
		graph = new HashMap<Node,ArrayList<Node>>();
	}
	public void put(Node n, ArrayList<Node> neighbors){
		graph.put(n, neighbors);
	}
	public ArrayList<Node> remove(Node n){
		return graph.remove(n);
	}
	public boolean isEmpty(){
		return graph.isEmpty();
	}
	public int size(){
		return graph.size();
	}
	public Set keySet(){
		return graph.keySet();
	}
	public Set entrySet(){
		return graph.entrySet();
	}
	public ArrayList<Node> get(Node n){
		return graph.get(n);
	}
	public void printGraph(){
		for(Node i:graph.keySet()){
			System.out.println(i.getName());
			for(Node j:graph.get(i)){
				System.out.print(j.getName()+",");
			}
			System.out.println("");
		}
	}
}
