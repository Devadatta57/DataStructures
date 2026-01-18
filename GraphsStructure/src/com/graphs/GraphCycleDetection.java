package com.graphs;

import java.util.LinkedList;
//No parameter → adj means the current object (this.adj)
//Parameter passed → must use obj.adj to access that graph ✅ so here in cycle detcection method we udes obj to access (   LinkedList<Edge> temp=g.adj.get(curr);)
//in print we dint pass any graph so it works on graph whic is already there no need to craete obj to access current list in the graph used
class Graph7{
	static class Edge{
		int dest;
		Edge(int dest){
			this.dest=dest;
		}
	}
	int v;
	LinkedList<LinkedList<Edge>> adj;
	Graph7(int v){
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<Edge>());
		}
	}
	
	void addUnDirectedEdge(int src,int dest) {
		Edge e= new Edge(dest);
		adj.get(src).add(e);
	}
	
    void addDirectedEdge(int src,int dest) {
		addDirectedEdge(src, dest);
		addDirectedEdge(dest, src);
	}
	
    public boolean UnDirectedCyclicGraph(Graph7 g) {
    	boolean visited[]=new boolean[v];
    	for(int i=0;i<v;i++) {// Every time DFS starts from some vertex i,
//    		it visits all vertices connected to i (through any number of edges).
//
//    		So, when that DFS finishes,
//    		all vertices in that connected component become visited = true.
//
//    		Now, if later the loop finds another vertex that’s still !visited,
//    		that means this vertex is not reachable from any previous DFS —
//    		 so it belongs to another disconnected component..outer for loop detects disconnected components in a graph.
    		if(!visited[i]) {
    			UnDirectedCyclicGraph(g,visited,i,-1);
    			return true;
    		}
    	}
    	return false;
    }

	private boolean UnDirectedCyclicGraph(Graph7 g,  boolean[] visited, int curr,int parent) {
         visited[curr]=true;	
         LinkedList<Edge> temp=g.adj.get(curr);
	       for(Edge e:temp) {
	    	   //not visited vertex 
	    	   if(!visited[e.dest]) {
	    		   if(UnDirectedCyclicGraph(g,visited,e.dest,curr)) {
	    			   return true;
	    		   }
	    	   }
	    	   //vertex visited and e.dest!=parent
	    	   else if(visited[curr] && e.dest!=parent) {
	    	       return true;
	    	   }
	    	   //vertex visited and if dest and src equal means e.dest=parent(means it is like 0-1 and 1-0 not cycle if 0-1-2-0 then cycle) do nothing
	       }
	
	       return false;
	
}
}
public class GraphCycleDetection {
	public static void main(String[] args) {
           Graph7 g=new Graph7(4);
           g.addUnDirectedEdge(0, 1);
           g.addUnDirectedEdge(0, 2);
           g.addUnDirectedEdge(1,2);
           g.addUnDirectedEdge(2,3);
           boolean res=g.UnDirectedCyclicGraph(g);
           System.out.println(res);
	}
}
