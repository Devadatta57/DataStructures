package com.graphs;

import java.util.LinkedList;

class Graph2{
	
	static  class Edge{
		int dest;
		int cost;
		Edge(int dest,int cost){
		this.dest=dest;
		this.cost=cost;
		}
		@Override
        public String toString() {
            return "(" + dest + ", " + cost + ")";
        }
	}
	
	int v;
	static LinkedList<LinkedList<Edge>> adj;
	Graph2(int v){
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++) {
		 adj.add(new LinkedList<Edge>());
		}
	}
	
	void addDirectedGraph(int src,int dest,int cost) {
		Edge e =new Edge(dest,cost);
		adj.get(src).add(e);
	}
	
	
	void addUndirectedGraph(int src,int dest,int cost) {
		addDirectedGraph(src, dest, cost);
		addDirectedGraph(dest,src, cost);
	}
	
	void printGraph() {
		for(int i=0;i<v;i++) {
			LinkedList<Edge> temp=adj.get(i);
            System.out.print("vertex "+i+" connected to");
			for(Edge g:temp) {
				System.out.print(g);
			}
			System.out.println();
		}
	}
	
}
public class GraphAdjacencyLinkedListRep {
	public static void main(String[] args) {
         Graph2 g=new Graph2(4);
         //dont add  src-dest 0-1 and 1-0 an one enough becoz undirected both sides it will create
         //from vertex 0
         g.addUndirectedGraph(0, 1, 3);
       //from vertex 1
         g.addUndirectedGraph(1, 2, 3);
         g.addUndirectedGraph(1, 3, 3);
         
       //from vertex 2
         g.addUndirectedGraph(2, 3, 3);
        
         
       //from vertex 3
         g.addUndirectedGraph(3, 0, 3);
         g.printGraph();
	}
}
