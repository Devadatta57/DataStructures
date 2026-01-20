package com.graphs;

import java.util.LinkedList;

class Graph4{
	int v;
	static class Edge{
		int dest, cost;
		Edge(int dest){
			this.dest=dest;
			
		}
	}
	LinkedList<LinkedList<Edge>> adj;
	Graph4(int v){
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
		
		
		 boolean PathSrctoDest(Graph4 g,int src,int dest) {
			boolean visited[]=new boolean[v];
			dfsUtil(src,dest,visited);
			return visited[dest];
		}


		void dfsUtil(int src, int dest, boolean[] visited) {
			visited[src]=true;
			LinkedList<Edge> temp=adj.get(src);
			for(Edge e:temp) {
				if(visited[e.dest]==false) {
					dfsUtil(e.dest,dest, visited);
				}
			}
			
		}
		
	}

//  boolean PathFromSrctoDest(int src,int dest,boolean[] visited) {
//     	if(src==dest) {
//     		return true;
//     	}
    	
//     	visited[src]=true;
//     	LinkedList<Edge> temp=adj.get(src);
    	
//     	for(Edge e:temp) {
//     		if(!visited[e.dest]) {
//     			if(PathFromSrctoDest(e.dest, dest, visited)) {
//     				return true;//we have to return the recursive func result  compulsory
//     			}
//     		}
//     	}
// 		return false;
//     }

 public class PathFindingInGraph {
	public static void main(String[] args) {
       int v=6;
       Graph4 g=new Graph4(v);
       
       g.addUnDirectedEdge(0, 1);
       g.addUnDirectedEdge(1, 3);
       g.addUnDirectedEdge(1, 4);
       g.addUnDirectedEdge(0,2);
       g.addUnDirectedEdge(2,3);
       g.addUnDirectedEdge(3,4);
     
       boolean res=g.PathSrctoDest(g,1,5);
      System.out.println(res?"path found":"not found");


	}
}
