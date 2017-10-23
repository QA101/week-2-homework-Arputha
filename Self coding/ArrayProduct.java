
public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4};
		int product = 1;
		for(int elements: a) {
			product *= elements;
		}
			System.out.println( a[0]+"*"+a[1]+"*"+a[2]+"*"+a[3]+" = "+ product );
			
		

	}

}
