import java.util.Scanner;

public class Reverse1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("No. of index : ");
		int idx = in.nextInt();
		
		double [] a = new double[idx];
		
		
		int i;
		for( i=idx-1;i>=0;i--){
			System.out.print("Index "+(-1-i+idx)+"'s element : ");
			a[i]=in.nextDouble();
		}
		
		printArray(a);
		
		}
	
		private static void printArray(double[] a) {
			System.out.println("Array elements");
			for (int i=0; i< a.length;i++) {
				System.out.println(a[i]);
			}
		}

	}


