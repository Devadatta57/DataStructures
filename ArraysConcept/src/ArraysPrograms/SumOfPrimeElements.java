package ArraysPrograms;
import java.util.Scanner;

class SumPrime{
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
			boolean isPrime=true;
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0) {
					//System.out.println(a[i]+" "+j);
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				//System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		return sum;
	}
}
public class SumOfPrimeElements {
	public static void main(String[] args) {
		int a[]=new int[5];
		SumPrime.read(a);
		System.out.println(SumPrime.sum(a));

	}
}
