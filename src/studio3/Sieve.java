package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want to check?");
		int n = in.nextInt() + 1;
		
		boolean[] A = new boolean[n];
		for (int i = 0; i < n ; i++)
		{
			if (A[i] == false)
			{
				A[i] = true;
			}
		}
		
		for (int x = 2; x <= Math.sqrt(n); x++)
		{
			if (A[x] == true)
			{
				for (int j = (int)Math.pow(x, 2.0); j < n; j += x)
				{
					A[j] = false;
				}
			}
		}
		for (int b = 2; b < n; b++)
		{
			if (A[b] == true)
			{
				System.out.println(b + " ");
			}
		}
		
	}

}
