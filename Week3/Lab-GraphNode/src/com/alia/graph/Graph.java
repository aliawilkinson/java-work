package com.alia.graph;

import java.util.*;

public class Graph {
	
	public static void main(String[] args) {
		GraphNode g = new GraphNode(10);
		g.addEdge(0, 2, 10);
		g.addEdge(1, 3, 11);
		g.addEdge(2, 4, 12);
		
		System.out.println(g);
	}
}