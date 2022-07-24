package fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(calc_fib(n));
	}

	private static long calc_fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			long[] f = new long[n + 1];
			f[0] = 0;
			f[1] = 1;

			for (int i = 2; i < n + 1; i++) {
				f[i] = f[i - 1] + f[i - 2];
			}
			return f[n];
		}

	}
}
