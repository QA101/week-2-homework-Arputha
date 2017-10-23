
public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[25];
		
		//array value assignment
		for (int i =1;i<=25;i++)
			a[i-1]=i;
		
		for ( int i =0;i <a.length;i++ ) {
			if(isPrime(a[i])) {
				System.out.print(a[i]+" ");
			}
		}

	}
	
	private static boolean isPrime(int n) {
		int i;
		if (n<=0) {
			return false;
		}
		else if (n >=1 && n<=3 ) {
			return true;
		}
		else {
			for ( i=2;i<=n/2;i++) {
				if ( n%i ==0) {
					return false;
				}
			}
			if (i> n/2) {
				return true;
			}
		}
		return true;
	}

}
