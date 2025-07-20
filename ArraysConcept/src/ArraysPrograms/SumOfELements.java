package ArraysPrograms;
import java.util.Scanner;

class SumE{
	public static void read(int[] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	public static int sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}
public class SumOfELements {
	public static void main(String[] args) {
		int a[]=new int[5];
		SumE.read(a);
		System.out.println(SumE.sum(a));

	}
}
