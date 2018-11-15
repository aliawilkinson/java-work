package com.alia.graph;

import java.util.*;

public class GraphNode {
	class Edge{
		int v, w;
		public Edge(int v, int w) {
			this.v = v; 
			this.w = w;
		}
		@Override
		public String toString() {
			return "("+v+""+""+w+")";
		}
	}
	List<Edge> G[];
	public GraphNode(int n) {
		G = new LinkedList[n];
		for(int i = 0; i < G.length; i++) {
			G[i] = new LinkedList<Edge>();
		}
	}
	boolean isConnected(int u, int v) {
		for(Edge i: G[u]) {
			if(i.v == v) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	void addEdge(int u, int v, int w) {
		G[u].add(0, new Edge(v,w));
	}
		@Override
		public String toString() {
			String result = "";
			for(int i =0; i < G.length; i++) {
				result +=i+"=>"+G[i]+"\n";
			}
			return result;
		}
	}
