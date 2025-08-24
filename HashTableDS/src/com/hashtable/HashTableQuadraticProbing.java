package com.hashtable;

class QuadraticProbingPro{
    int[] a;
    int size=10;
    
    public QuadraticProbingPro() {
		a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=-1;
		}
	}
    
    public void display() {
    	for(int i=0;i<size;i++) {
    		System.out.print(a[i]+" ");
    	}
    }
//    i=0 → (3 + 0) % 10 = 3
//
//    		i=1 → (3 + 1) % 10 = 4
//
//    		i=2 → (3 + 4) % 10 = 7
//
//    		i=3 → (3 + 9) % 10 = 2
//
//    		i=4 → (3 + 16) % 10 = 9 so to preserve hcode original value k taken otherwise

    //    hcode = hcode + i*i;
//    hcode = hcode % size;
//    Suppose hcode = h(k) = 3 (say k = 23, size=10):
//
//    i=0 → hcode = 3
//
//    i=1 → hcode = (3 + 1) % 10 = 4 ✅
//
//    i=2 → hcode = (4 + 4) % 10 = 8 ❌ (but it should be 7)
//
//    i=3 → hcode = (8 + 9) % 10 = 7 (now it comes late)
//
//    i=4 → hcode = (7 + 16) % 10 = 3 (looped back too early!)
    public boolean addValues(int value){
    	int hcode=value%size;
    	int k=hcode;
    	for(int i=0;i<size;i++) {
    		if(a[hcode]==-1) {
    			a[hcode]=value;
    			return true;
    		}
    		hcode=k+(i*i);
    		hcode=hcode%size;
    	}
    	return false;
    }
    
    public boolean Search(int value){
    	int hcode=value%size;
    	int k =hcode;
    	for(int i=0;i<size;i++) {
    		if(a[hcode]==value) {
    			return true;
    		}
    		hcode=k+(i*i);
    		hcode=hcode%size;
    	}
    	return false;
    }
    
    public boolean delete(int value){
    	int hcode=value%size;
    	int k =hcode;

    	for(int i=0;i<size;i++) {
    		if(a[hcode]==value) {
    			a[hcode]=-1;
    			return true;
    		}
    		hcode=k+(i*i);
    		hcode=hcode%size;
    	}
    	return false;
    }
}
public class HashTableQuadraticProbing {
	public static void main(String[] args) {
      QuadraticProbingPro q= new QuadraticProbingPro();
      q.addValues(13);
      q.addValues(23);
      q.addValues(33);
      q.addValues(43);
      q.addValues(53);
      q.addValues(63);
      q.addValues(73);
      q.display();
      System.out.println();
      System.out.println(q.Search(73));
      System.out.println(q.delete(43));
      q.display();


	}
}
