package com.graphs;

import java.util.LinkedList;

class Graph3{
	static class Edge{
		int dest;
		int cost;
		Edge(int dest,int cost){
			this.dest=dest;
			this.cost=cost;
		}
		public String toString() {
			return "("+dest+","+cost+")";
		}
	}
	int v;
	LinkedList<LinkedList<Edge>> adj;
	public Graph3(int v) {
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<Edge>());
		}
	}
	
	void addDirectedGraph(int src,int dest,int cost) {
	   Edge e = new Edge(dest,cost);
	   adj.get(src).add(e);
	}
	
	void addUndirectedGraph(int src,int dest,int cost) {
         addDirectedGraph(src,dest,cost);	
         addDirectedGraph(dest,src,cost);
	}
	
	void PrintGraph() {
		for(int i=0;i<v;i++) {
			System.out.println("vertex "+i+" connected to ");
			LinkedList<Edge> temp=adj.get(i);
			for(Edge e:temp) {
				System.out.print(e+"");
			}
			System.out.println();
		}
	}
	
	 void bfs(Graph3 g,int src) {
		int v=g.v;
		boolean[] visited= new boolean[v];
		LinkedList<Integer> q= new LinkedList<Integer>();
		q.add(src);
		visited[src]=true;
		while(!q.isEmpty()) {
			int curr=q.remove();
			System.out.print(curr+" ");
		LinkedList<Edge> temp=g.adj.get(curr);
		for(Edge e:temp) {
			if(visited[e.dest]==false) {
				visited[e.dest]=true;
				q.add(e.dest);
			}
		  }
		}
	}
	
	void dfs(Graph3 g,int curr,boolean[] visited) {
		System.out.print(curr+" ");
		visited[curr]=true;
		LinkedList<Edge> temp=g.adj.get(curr);
		for(Edge e:temp) {
			if(visited[e.dest]==false) {
				dfs(g,e.dest,visited);
			}
		}
		
	}
	
}
public class GraphAdjacencyLinkedLRepPrac {
	public static void main(String[] args) {
          Graph3 g= new Graph3(4);
          g.addUndirectedGraph(0, 1, 2);
          g.addUndirectedGraph(1, 2, 5);
          g.addUndirectedGraph(2, 3, 5);
          g.addDirectedGraph(3, 1, 4);
          g.PrintGraph();
          
          g.bfs(g,0);
          System.out.println();
          boolean[] visited= new boolean[4];
          g.dfs(g, 0,visited);
	}
}
