package com.hashtable;


class LinearProbingImp{
	
	int[] a;
	int size=10;
	
	public LinearProbingImp() {
		a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=-1;
		}
	}
	
	public boolean addValues(int value){
	    int hcode=value%size;
		for(int i=0;i<size;i++) {
			if(a[hcode]==-1) {
				a[hcode]=value;
				return true;
			}
			hcode=hcode+1;
			hcode=hcode%size;
		}
		return false;
	}
	
	public boolean delete(int value){
	    int hcode=value%size;
		for(int i=0;i<size;i++) {
			if(a[hcode]==value) {
				a[hcode]=-1;
				return true;
			}
			hcode=hcode+1;
			hcode=hcode%size;
		}
		return false;
	}
	
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public boolean Search(int value){
	    int hcode=value%size;
		for(int i=0;i<size;i++) {
			if(a[hcode]==value) {
				return true;
			}
			hcode=hcode+1;
			hcode=hcode%size;
		}
		return false;
	}
}
public class HashTableLinearProbing {
	public static void main(String[] args) {
            LinearProbingImp l= new LinearProbingImp();
            l.addValues(3);
            l.addValues(13);
            l.addValues(23);
            l.addValues(33);
            l.addValues(43);
            l.addValues(53);
            l.addValues(63);
            l.display();
            System.out.println();
           // boolean res=l.Search(53);
             boolean res=l.delete(63);

            System.out.println(res);

	}
}
