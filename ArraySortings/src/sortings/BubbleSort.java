package sortings;

class Bubble{
	public static int[] bubbleS(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++)
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		return a;
	}
}
public class BubbleSort {
	public static void main(String[] args) {
     int[] a=new int[5];
     a=new int[] {121,34,23,321};
     int[] c=Bubble.bubbleS(a);
     
     for(int i=0;i<c.length;i++) {
    	 System.out.println(c[i]);
     }
	
	
	}

}
