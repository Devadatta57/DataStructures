package com.recursion;

class Towers{
	public static void towerofhanoi(int n,String src,String helper,String Dest) {
		if(n==1) {
			System.out.println("move disk from "+src+" to "+Dest);
			return;
		}
		towerofhanoi(n-1, src, Dest, helper);
		System.out.println("move disk from "+src+" to "+Dest);
		towerofhanoi(n-1, helper, src, Dest);

	}
}
public class TowersOfHanoii {
	public static void main(String[] args) {
		int n=4;
		Towers.towerofhanoi(n,"S","H","D");

	}

}
