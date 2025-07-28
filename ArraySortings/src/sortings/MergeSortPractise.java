package sortings;


class Merge{
	public static void merge(int[] a,int left,int right) {
	
		if(left>=right) {
			return;
		}
		
		int mid=(left+right)/2;
		merge(a,left,mid);
		merge(a,mid+1,right);
		mergeSubArrays(a,left,mid,right);
		
	}
	
	public static void mergeSubArrays(int[] a,int left,int mid,int right) {
		int[] temp=new int[a.length];
		int k=left;
		int i=left;
		int j=mid+1;
		while(i<=mid && j<=right) {
			if(a[i]<=a[j]) {
				temp[k++]=a[i++];
			}
			else{
				temp[k++]=a[j++];
			}
		}
		
		while(i<=mid) {
			temp[k++]=a[i++];
		}
		while(j<=right) {
			temp[k++]=a[j++];
		}
		for(int p=left;p<=right;p++) {
      	 a[p]=temp[p];
        }
	}
}
public class MergeSortPractise {

	public static void main(String[] args) {
          int[] a= {5,1,4,2,9,3,9,0};
          Merge.merge(a, 0, a.length-1);
         
          for (int i = 0; i < a.length; i++) {
        	    System.out.print(a[i] + " ");
        	}

          
	}

}
