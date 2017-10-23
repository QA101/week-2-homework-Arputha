
public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			
				System.out.println("****** " );
			}
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print(" 2");
			}
			System.out.println();
		}
		for(int i=0;i<8;i+=2) {
			for(int j=0;j<=i;j++) {
				System.out.print(" $");
				
			}
			System.out.println( "");
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("**");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
		for(int i=3;i<=7;i+=2) {
			for(int j=1;j<=i;j++) {
			System.out.print(" "+j);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(" "+i);
			}
			System.out.println(" "+i);
		}
		}
	

	}
