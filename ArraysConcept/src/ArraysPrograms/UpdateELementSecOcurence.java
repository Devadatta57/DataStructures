package ArraysPrograms;

import java.util.Scanner;

class SecOcurrence{
	public static void read(int[] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void update(int[] a,int u,int e) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==u) {
				count++;
				if(count==2) {
				a[i]=e;
				break;
				}
			}
		}
	}
	
	public static void write(int[] a) {
		System.out.println("enter element: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
public class UpdateELementSecOcurence {
	public static void main(String[] args) {
		int[] a=new int[4];
        SecOcurrence.read(a);
        SecOcurrence.update(a,34,56);
        SecOcurrence.write(a);
	}
}
