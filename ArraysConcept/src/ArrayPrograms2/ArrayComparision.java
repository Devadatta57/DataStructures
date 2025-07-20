package ArrayPrograms2;
//at same position same element comp
class ArrayComp{
	public static boolean ArraysC(int[] a,int[] b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
}
public class ArrayComparision {
	public static void main(String[] args) {
		boolean res=ArrayComp.ArraysC(new int[] {12,23,34},new int[] {12,34,23});
		boolean res1=ArrayComp.ArraysC(new int[] {12,23,34},new int[] {12,23,34});

		System.out.println(res);
		System.out.println(res1);


	}
}
