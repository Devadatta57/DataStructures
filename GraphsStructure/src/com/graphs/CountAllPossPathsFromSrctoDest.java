package com.graphs;

import java.util.LinkedList;

class Graph5{
	int v;
	static class Edge{
		int dest, cost;
		Edge(int dest){
			this.dest=dest;
			
		}
	}
	LinkedList<LinkedList<Edge>> adj;
	Graph5(int v){
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();//vertices,edges
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<Edge>());
		}
		
	}
		
		
		void addDirectedEdge(int src,int dest) {
		  Edge e= new Edge(dest);
		  adj.get(src).add(e);
		}
		
		void addUnDirectedEdge(int src,int dest) {
			addDirectedEdge(src,dest);
			addDirectedEdge(dest,src);
		}
		
		
		 int CountPaths(int src,int dest,boolean visited[]) {
			return CountNo(src,dest,visited);
		 }


		int CountNo(int src, int dest, boolean[] visited) {
			int c=0;
			
			//base case
			if(src==dest) {
				return 1;
			}
			
			//recursion logic 
			visited[src]=true;
			LinkedList<Edge> temp=adj.get(src);
			for(Edge e:temp) {
				if(visited[e.dest]==false) {
					c=c+CountNo(e.dest,dest,visited);
				}
			}
			
			//backtracking
			visited[src]=false;
			return c;
		}
		
	}

public class CountAllPossPathsFromSrctoDest {
	public static void main(String[] args) {
       int v=6;
       Graph5 g=new Graph5(v);
       
       g.addUnDirectedEdge(0, 1);
       g.addUnDirectedEdge(1, 3);
       g.addUnDirectedEdge(1, 4);
       g.addUnDirectedEdge(0,2);
       g.addUnDirectedEdge(2,3);
       g.addUnDirectedEdge(3,4);
     
       boolean visited[]=new boolean[v];
       int c=g.CountPaths(0, 4, visited);
        System.out.println(c);
        
        int c1=g.CountPaths(0, 5, visited);
        System.out.println(c1);

	}
}
