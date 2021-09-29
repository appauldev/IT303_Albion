package albion_prelim_1;

public class Albion {

	public static void main(String[] args) {
		// initialization and declaration
		// we used int for simplicity
		int J = 10,
			O = 20,
			H = 30,
			N = 40;
		
		// addition
		int sum = J + O + H + N; // 100
		System.out.println("Sum: " + sum);
		
		// division
		int quotient_1 = O / J; // 20 / 10 = 2
		int quotient_2 = N / J; // 40 / 10 = 4
		int quotient_3 = N / H; // 40 / 30 = 1
		// explicit typecasting or "lantarang pagcoconvert" para makita yung decimal
		double quotient_4 = (double) N / H; // 40 / 30 = 1.3333
		System.out.println();
		System.out.println("Quotient 1: " + quotient_1);
		System.out.println("Quotient 2: " + quotient_2);
		System.out.println("Quotient 3: " + quotient_3);
		System.out.println("Quotient 4: " + quotient_4);
		
		// modulus - the remainder kapag nagdivide
		int mod_1 = N % H; // 40 % 30 = 10
		int mod_2 = H % J; // 30 % 10 = 0
		int mod_3 = H % N; // 30 % 40 = 30
		System.out.println();
		System.out.println("Modulo 1: " + mod_1);
		System.out.println("Modulo 2: " + mod_2);
		System.out.println("Modulo 3: " + mod_3);
		
		// decrement
		System.out.println();
		// pre is before, so minus muna bago gamitin
		System.out.println("Decrement 1 (pre): " + --J); // J = J - 1
		// post is after, so gamit muna bago mag-minus
		System.out.println("Decrement 2 (post): " + N--); // use N; N = N - 1
		System.out.println("Value of N after post-decrement: " + N);
	}

}
