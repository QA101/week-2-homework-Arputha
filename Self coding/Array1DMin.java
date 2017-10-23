import java.util.Scanner;

public class Array1DMin {

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
		
		System.out.println("Maximum number of this Array : "+minArray(a));
		System.out.println("Maximum numbers index value : "+ minArrayPos(a));
		

	}
	private static double minArray(double[] a) {
		double minnumber=a[0];
		int idx=0;
		
		for(int i=0;i<a.length;i++) {
			if (a[i]<minnumber) {
				minnumber=a[i];
				idx=i;
			}
			

	}
		return minnumber;
		
	}
	
	private static int minArrayPos(double[] a) {
		
		double minnumber=a[0];
		int idx=0;
		
		for(int i=1;i<a.length;i++) {
			if ( a[i]<minnumber) {
				minnumber = a[i];
				idx=i;
			}
		}
		return idx;
		
	}

	}


