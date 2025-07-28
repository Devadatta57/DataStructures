package sortings;


class ShellS{
	public static void doShell(int[] a,int n) {
		for(int gap=n/2;gap>=1;gap=gap/2) {
			for(int j=gap;j<n;j++) {
				for(int i=j-gap;i>=0;i=i-gap) {
					if(a[i+gap]>a[i]) {
						break;
					}
					else {
						int temp=a[i+gap];
						a[i+gap]=a[i];
						a[i]=temp;
					}
				}
			}
		}
	}
}
public class ShellSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {21,3,22,31,5};
		ShellS.doShell(a, a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
