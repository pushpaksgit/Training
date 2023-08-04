package Day3;
import java.util.*;
public class PrimeNumber {
    static int MAX_SIZE = 1000005;
	static ArrayList<Integer> primes =new ArrayList<Integer>();
	static void primeNumber()
	{
		boolean [] IsPrime = new boolean[MAX_SIZE];
		for(int i = 0; i < MAX_SIZE; i++)
			IsPrime[i] = true;
		for (int p = 2; p * p < MAX_SIZE; p++)
		{
			if (IsPrime[p] == true)
			{
				for (int i = p * p; i < MAX_SIZE; i += p)
					IsPrime[i] = false;
			}
		}
		for (int p = 2; p < MAX_SIZE; p++)
		if (IsPrime[p] == true)
				primes.add(p);
	}
	public static void main (String[] args)
	{
		primeNumber();
        Scanner sc = new Scanner(System.in);
        int postition=sc.nextInt();
		System.out.println("Prime number is " +primes.get((postition-1)));
    }
}