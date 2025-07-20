package ArraysPrograms;

class MinMax{
	public static int min(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public static int max(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
}
public class MinMaxElement {
	public static void main(String[] args) {
		int[] a=new int[5];
		a=new int[]{1,3,5,32,55};
        System.out.println(MinMax.min(a));
        System.out.println(MinMax.max(a));
	}
}
