import java.util.Scanner;

public class ArrayNegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Index : ");
		int idx=in.nextInt();
		int [] a=new int[idx];
		
		for(int i=0;i<idx;i++) {
		System.out.print("Index "+i+"'s element : ");
		a[i]=in.nextInt();
	
		}
		System.out.print("Negative numbers of this Array : ");
		for (int i=0; i<a.length;i++) {
			if (a[i]<0) {
				System.out.print(" "+a[i]);
				
			}
		}
	}

}
