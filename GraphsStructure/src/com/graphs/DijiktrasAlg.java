package com.graphs;

import java.util.LinkedList;
import java.util.PriorityQueue;


class Graph9{
	static class Edge{
		int src;
		int dest;
		int cost;
		Edge(int src,int dest,int cost){
			this.src=src;
			this.dest=dest;
			this.cost=cost;
		}
	}
	
	int v;
	LinkedList<LinkedList<Edge>> adj;
	Graph9(int v){
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<Edge>());
		}
	}
	
	
    void addDirectedEdge(int src,int dest,int cost) {
    	Edge e= new Edge(src,dest,cost);
    	adj.get(src).add(e);
	}

    void UnDirectedEdge(int src,int dest,int cost) {
    	addDirectedEdge(src, dest, cost);
    	addDirectedEdge(dest, src, cost);
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
    
    static class Pair implements Comparable<Pair>{
       int n;
       int path;
       Pair(int n,int path){
    	   this.n=n;
    	   this.path=path;
       }
		@Override
		public int compareTo(Pair p) {
			return this.path-p.path;
		}
    }
    
    
    static void dijiktra(Graph9 g,int src){
    	int[] dist=new int[g.v];
    	boolean visited[]= new boolean[g.v];
    	
    	//initial...  dist[]
    	for(int i=0;i<g.v;i++) {
    		if(i!=src) {
    			dist[i]=Integer.MAX_VALUE;
    		}
    	}
    	
    	//logic
    	PriorityQueue<Pair> pq= new PriorityQueue<>();
    	pq.add(new Pair(src,0));
    	
    	while(!pq.isEmpty()) {
    	 Pair curr=pq.remove();
    		if(!visited[curr.n]) {
    		     visited[curr.n]=true;
    		    LinkedList<Edge> temp =g.adj.get(curr.n);  
    		    for(Edge e:temp) {
    		    	int u=e.src;
    		    	int v=e.dest;
    		    	int wt=e.cost;
    		    	if(dist[u]+wt<dist[v]) {
    		    		dist[v]=dist[u]+wt;
    		            pq.add(new Pair(v,dist[v]));
    		    	}
    		    }
    		}
    	}
    	
    	//printing
    	for(int i=0;i<g.v;i++) {
    		System.out.print(dist[i]+" ");
    	}
    	
    }
    
}
public class DijiktrasAlg {
	public static void main(String[] args) {
		int v=6;
      Graph9 g=new Graph9(v);

g.addDirectedEdge(0, 1, 2);
g.addDirectedEdge(0, 2, 4);
g.addDirectedEdge(1, 2, 1);
g.addDirectedEdge(1, 3, 7);
g.addDirectedEdge(2, 4, 3);
g.addDirectedEdge(4, 3, 2);
g.addDirectedEdge(4, 5, 5);
g.addDirectedEdge(3, 5, 1);   
g.dijiktra(g, 0);
	}
}
