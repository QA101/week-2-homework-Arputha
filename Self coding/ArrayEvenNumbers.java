import java.util.Scanner;

public class ArrayEvenNumbers {

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
		for (int i=0; i<a.length;i++) {
			if (isEven(a[i])) {
				System.out.print("Even numbers of this Array : "+a[i]);
			}
		}
	}
	
	private static boolean isEven(int a) {
		if (a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
