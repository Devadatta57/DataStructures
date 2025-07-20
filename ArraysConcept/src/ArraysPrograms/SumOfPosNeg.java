package ArraysPrograms;
import java.util.Scanner;

class SumPosNeg{
	public static void read(int[] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	public static int[] sumPN(int[] a) {
		int sumN=0;
		int sumP=0;
		int b[]=new int[2];

		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
			sumN=sumN+a[i];
			}
			else {
				sumP=sumP+a[i];
			}
		}
		b[0]=sumP;
		b[1]=sumN;
		return b;
	}
	
	
}
public class SumOfPosNeg {
	public static void main(String[] args) {
		int a[]=new int[5];
		SumPosNeg.read(a);
		int[] res=new int [2];
		res=SumPosNeg.sumPN(a);
		for(int i=0;i<res.length;i++) {
			if(i==0) {
			System.out.println(res[i]+" sumP");
			}else {
				System.out.println(res[i]+" sumN");
			}
		}
	


	}
}
