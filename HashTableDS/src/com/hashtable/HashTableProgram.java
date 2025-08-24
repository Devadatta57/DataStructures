package com.hashtable;

class HashTables{
	int[] a;
	int size=10;
	
	public HashTables() {
		a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=-1;
		}
	}
	
	public void display() {
	 for(int i=0;i<a.length;i++) {
	    	System.out.print(a[i]+" ");
	    }
	}
	
	
	public int compute(int value) {
		return value%size;
	}
	
	public boolean addValues(int value) {
		int index=compute(value);
		if(a[index]==-1) {
			a[index]=value;
			return true;
		}
		return false;
	}
	
	public boolean delete(int value) {
		for(int i=0;i<size;i++) {
			if(a[i]==value) {
				a[i]=-1;
				return true;
			}
		}
		return false;
	}
	public boolean search(int value) {
		for(int i=0;i<size;i++) {
			if(a[i]==value) {
				return true;
			}
		}
		return false;
	}
	
}
public class HashTableProgram {
	public static void main(String[] args) {
    HashTables h = new HashTables();
    h.addValues(23);
    h.addValues(43);
    h.addValues(67);
    h.addValues(90);
    h.display();
    System.out.println();
    boolean res= h.search(23);
  	System.out.println(res);
   // System.out.println(h.delete(23));
    h.addValues(43);

    h.display();
 
	}
}
