package sortings;


class Selection{
	   public static int[] SelSort(int[] a) {
		   
		   for(int i=0;i<a.length;i++) {
			   int min=i;
			   for(int j=i+1;j<a.length;j++) {
				   if(a[min]>a[j])
				  min=j;
			   }
			   int temp=a[i];
			   a[i]=a[min];
			   a[min]=temp;
			   
		   }
		   return a;
	   }
}
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a=new int[5];
         a=new int[]{534,121,342,9};
         int[] c=Selection.SelSort(a);
	
         for(int i=0;i<c.length;i++) {
        	 System.out.println(c[i]);
         }
	
	
	}

}
