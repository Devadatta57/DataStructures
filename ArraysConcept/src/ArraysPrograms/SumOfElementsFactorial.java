package ArraysPrograms;
import java.util.Scanner;

class SumFactorial{
	public static void read(int[] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	public static int factorial(int n) {
		if(n==1 ||n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static int  sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("fact of "+a[i] +" is : "+factorial(a[i]));
			sum=sum+factorial(a[i]);
		}
		return sum;
	}
}
public class SumOfElementsFactorial {
	public static void main(String[] args) {
		int a[]=new int[5];
		SumFactorial.read(a);
		System.out.println(SumFactorial.sum(a));

	}
}
