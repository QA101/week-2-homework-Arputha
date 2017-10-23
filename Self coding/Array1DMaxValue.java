import java.util.Scanner;

public class Array1DMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Index : ");
		int idx=in.nextInt();
		double [] a=new double[idx];
		
		for(int i=0;i<idx;i++) {
		System.out.print("Index "+i+"'s element : ");
		a[i]=in.nextDouble();
		}
		
		System.out.println("Maximum number of this Array : "+maxArray(a));
		System.out.println("Maximum number of this Array : "+a[maxArrayPos(a)]);
		System.out.println("Maximum numbers index value : "+ maxArrayPos(a));
		
	}
	private static double maxArray(double[] a) {
		double maxnumber=a[0];
		int idx=0;
		
		for(int i=0;i<a.length;i++) {
			if (a[i]>maxnumber) {
				maxnumber=a[i];
				idx=i;
			}
	}
	return maxnumber;	
	}
	
	private static int maxArrayPos(double[] a) {	
		double maxnumber=a[0];
		int idx=0;
		
		for(int i=1;i<a.length;i++) {
			if ( a[i]>maxnumber) {
				maxnumber = a[i];
				idx=i;
			}
		}
		return idx;
	}
}
