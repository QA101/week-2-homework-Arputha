
public class ArrayDoubleMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a ={1.0, 2.0, 3.89, 4.78};
		double product =1.0;
		for (double elements:a) {
			product *= elements;
		}
			System.out.println( a[0]+"*"+a[1]+"*"+a[2]+"*"+a[3]+" = "+ product );
		
		

	}

}
