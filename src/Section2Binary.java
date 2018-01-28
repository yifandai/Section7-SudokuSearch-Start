/*
 * Section 2 - Part 1
 * 
 * Output all of the binary numbers of N bits
 * via the enumerate and process pattern. The
 * output needs to be in ascending order with 
 * an N = 5 to match the Travis output. 
 */

public class Section2Binary {

	public static void main(String[] args) {
		int N=5;
		enumerate(N,0,new int[5]);
	}

	/*
	 * enumerate is recursively called to exhaustively search
	 * and create all of the binary numbers of size N bits 
	 */
	static public void enumerate(int N, int curBit, int[] a) {
		//if at last bit, output completed binary number 
		if (curBit == N) {
			process(a);
			return;
		}
		for (int i = 0; i < 2; i++) { //bit either set to 0 or 1
			//set current bit 
			a[curBit] = i; 
			
			//enumerate over later bits to create all combinations 
			enumerate(N, curBit+1, a); 
		}
	}
	
	/*
	 * process takes in an array of size N that represents
	 * a binary number of N bits, it prints the representation 
	 */
	public static void process(int[] binary_rep) {
		for (int bit : binary_rep) {
			System.out.print(bit);
		}
		System.out.println();
	}

}