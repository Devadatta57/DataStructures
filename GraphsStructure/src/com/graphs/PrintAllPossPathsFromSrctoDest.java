package com.graphs;

import java.util.LinkedList;
import java.util.Stack;

class Graph6{
	int v;
	static class Edge{
		int dest, cost;
		Edge(int dest){
			this.dest=dest;
			
		}
	}
	LinkedList<LinkedList<Edge>> adj;
	Graph6(int v){
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
		
		
		 void  PrintAllPaths(Graph6 g,int src,int dest,boolean visited[]) {
			 Stack<Integer> path=new Stack<Integer>();
			 Print(g,src,dest,visited,path);
		 }


		void Print(Graph6 g,int src, int dest, boolean[] visited,Stack<Integer> path) {
			int c=0;
			path.push(src);
			//recursion logic 
			visited[src]=true;
			//base case
			if(src==dest) {
				System.out.println(path);
				//path.pop();
				//return;
			}
		
			LinkedList<Edge> temp=g.adj.get(src);
			for(Edge e:temp) {
				if(visited[e.dest]==false) {
					Print(g,e.dest,dest,visited,path);
				}
			}
			
			//backtracking
			visited[src]=false;
			path.pop();
			
		}
		
	}

public class PrintAllPossPathsFromSrctoDest {
	public static void main(String[] args) {
       int v=6;
       Graph6 g=new Graph6(v);
       
       g.addUnDirectedEdge(0, 1);
       g.addUnDirectedEdge(1, 3);
       g.addUnDirectedEdge(1, 4);
       g.addUnDirectedEdge(0,2);
       g.addUnDirectedEdge(2,3);
       g.addUnDirectedEdge(3,4);
     
       boolean visited[]=new boolean[v];
        g.PrintAllPaths(g,0, 4, visited);
       
       

	}
}
