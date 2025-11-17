package com.graphs;

class Graph1{
	int v;
	int adjMatrix[][];
	Graph1(int v){
		this.v=v;
		adjMatrix=new int[v][v];
	}
	
	void addDirectedEdge(int src,int dest,int cost) {
		adjMatrix[src][dest]=cost;
	}
	
	void addUndirectedEdge(int src,int dest,int cost) {
		addDirectedEdge(src, dest, cost);
		addDirectedEdge(dest, src, cost);
	}
	void PrintGraph() {
		 for(int i=0;i<v;i++) {
			  System.out.print("vertex "+i+" connected to ");
	    	  for(int j=0;j<v;j++) {
	    		  if(adjMatrix[i][j]!=0) {
	    		    System.out.print("("+j+","+adjMatrix[i][j]+")");
	    		  }
	    	  }
	    	  System.out.println();
	      }
	}
}
public class GraphAdjacencyMatrixRepres {
	public static void main(String[] args) {
		int v=4;
      Graph1 g=new Graph1(v);
      //from vertex 0 
      g.addDirectedEdge(0, 1, 2);
      //from vertex 1
      g.addDirectedEdge(1, 0, 2);
      g.addDirectedEdge(1, 2, 3);
      g.addDirectedEdge(1, 3, 5);
      //from vertex 2
      g.addDirectedEdge(2, 3, 6);
      g.PrintGraph();
     
	}
}
