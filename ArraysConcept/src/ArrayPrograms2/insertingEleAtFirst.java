package ArrayPrograms2;

class InsertF{
	public static int[]  insertAtPos(int[] a,int location,int key) {
		int[] b=new int[a.length+1];
		int index=0;
		b[index++]=key;
		for(int i=0;i<a.length;i++) {
				b[index++]=a[i];
		}
		return b;
	}
}
public class insertingEleAtFirst {
	public static void main(String[] args) {
		int[] a=new int[6] ;
		a= new int[]{12,34,23,15,77};
		
	
		
		int[] c=InsertF.insertAtPos(a,0,245);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		

	}
}
