package ArraysProgramsSearching;

class linearS{
	public static int linear(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
public class LinearySearch {
	public static void main(String[] args) {
      int[] a=new int[5];
      a=new int[]{12,34,21,212,32};
     System.out.println(linearS.linear(a,312));
	}
}
