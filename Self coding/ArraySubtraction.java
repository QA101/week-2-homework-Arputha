
public class ArraySubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a ={1,2,3,4};
		int [] b = {10,20,30,40};
		int [] c=new int[4];
		for (int i=0;i<a.length;i++) {
			c[i]=a[i]-b[i];
		}
		printArray(a);
		printArray(b);
		printArray(c);
	}
	private static void printArray(int[] a) {
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}


}
