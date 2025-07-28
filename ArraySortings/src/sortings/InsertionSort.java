package sortings;



class Insertion{
	public static int[] insertionS(int[] a) {
		
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
		}
		return a;
	}
}
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a={21,3,35,53};
         int[] c= Insertion.insertionS(a);
         for(int i=0;i<c.length;i++) {
        	 System.out.print(c[i]+" ");
         }
	}

}
