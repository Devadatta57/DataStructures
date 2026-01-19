package com.graphs;

import java.util.LinkedList;
//visited is used to tell all nodes reached once,so in every  dfs recursion  it is same so currents dfs recursion path shouldnt checked with previous visied path nodes ok 
//restack used to check in our path in every dfs recursion we haved visited once,if again we reach same then cycyle found so eestack used to check cycle.
class Graph8{
	static class Edge{
		int dest;
		Edge(int dest){
			this.dest=dest;
		}
	}
	int v;
	LinkedList<LinkedList<Edge>> adj;
	Graph8(int v){
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<Edge>());
		}
	}
	
	
    void addDirectedEdge(int src,int dest) {
    	Edge e= new Edge(dest);
    	adj.get(src).add(e);
	}


	public boolean DirectedCyclicGraph(Graph8 g ) {
		boolean[] visited=new boolean[v];
		boolean[] Restack=new boolean[v];

	    for(int i=0;i<g.v;i++) {
	    	if(!visited[i]) {
	    		if(CheckDirectedCycle(g,visited,Restack,i)) {
	    			return true;
	    		}
	    	}
	    }
		return false;
	}
	
	public boolean CheckDirectedCycle(Graph8 g,boolean[] visited,boolean[] Restack,int curr) {
		visited[curr]=true;//array contains all marked vertices
		Restack[curr]=true;//for marking  and backtracking while recursing
		
		LinkedList<Edge> temp=g.adj.get(curr);
		//adj vertices checking for cycle
          for(Edge e:temp) {
        	  //if dest already marked in restack then graph is cycle return and come out
        	  if(Restack[e.dest]) {
        		  return true;
        	  }
        	  //if dest not marked in visited , recurse again and if it returns true then cyclic 
        	  if(!visited[e.dest] && CheckDirectedCycle(g, visited, Restack, e.dest)) {
        		  return true;
        	  }
          }
          //when no adj vertex then backtracking in recstacked named array 
          Restack[curr]=false;
		return false;
	}
	
}
public class DirectedGraphCycleDetection {
	public static void main(String[] args) {
           Graph8 g=new Graph8(3);
           g.addDirectedEdge(0, 1);
           g.addDirectedEdge(1, 2);
           g.addDirectedEdge(2, 0);
           g.DirectedCyclicGraph(g);
           boolean res=g.DirectedCyclicGraph(g);
           System.out.println(res);
	}
}
