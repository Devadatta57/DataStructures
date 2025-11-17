package com.graphs;

import java.util.ArrayList;

class Edge{
	int s;
	int d;
	int c;
	Edge(int s,int d,int c){
		this.s=s;
		this.d=d;
		this.c=c;
	}
	
	public String toString() {
		return this.s+" "+this.d+" "+this.c;
	}
}
public class GraphEdgeAdjacencyListRepres {
	public static void main(String[] args) {
		int v=4;//0-1-2-3
        ArrayList<Edge>[] graph= new ArrayList[v];
        //add is arraylist method
        for(int i=0;i<v;i++) 
        	graph[i]=new ArrayList<Edge>();
        
        
        graph[0].add(new Edge(0,3,2));
        
        graph[1].add(new Edge(1,3,2));
        
        graph[2].add(new Edge(2,1,2));
        graph[2].add(new Edge(2,3,4));
        graph[2].add(new Edge(4,2,1));
        
        
        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,4));
        graph[3].add(new Edge(3,3,5));
        
        for(ArrayList l:graph) {
        	System.out.println(l);
        }
        
        
	}
}
