package ArrayPrograms2;

class InsertL{
	public static int[]  insertAtPos(int[] a,int location,int key) {
		int[] b=new int[a.length+1];
		int index=0;
		for(int i=0;i<a.length;i++) {
				b[index++]=a[i];
		}
		b[index++]=key;
		
		return b;
	}
}
public class insertingEleAtLast {
	public static void main(String[] args) {
		int[] a=new int[6] ;
				a= new int[]{12,34,23,15,77};
		
	
		
		int[] c=InsertL.insertAtPos(a,a.length,245);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		

	}
}
