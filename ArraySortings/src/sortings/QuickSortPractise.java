package sortings;


class Quick{
	public static int partition(int[] a,int start,int end) {
		int pivot=a[end];
		int Oend=end;
		end=end-1;
		while(start<=end) {
			if(a[start]<=pivot) {
				start=start+1;
			}
			else if(a[end]>pivot) {
				end=end-1;

			}
			else {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;

			}

		}

		int temp=a[start];
		a[start]=a[Oend];
		a[Oend]=temp;
		
		return start;
	}
	public static void QuickS(int[] a,int start,int end) {
		if(start<end) {
			int pivot=partition(a, start, end);
	         QuickS(a,start,pivot-1);
	         QuickS(a,pivot+1,end);
		}
	}
}

public class QuickSortPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        int[] a={65,65,39,6,1,4,1,2,33};
      
       Quick.QuickS(a,0,a.length-1);
       
       
       for(int i=0;i<a.length;i++) {
      	 System.out.print(a[i]+" ");
       }
	}

}
