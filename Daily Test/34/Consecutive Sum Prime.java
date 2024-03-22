// Description:
// Write a Java code to find all the consecutive prime sum numbers up to the given range.

// Sample Input:
// 20

// Sample Output:
// 5 17

// Explanation:
// Some prime numbers can be expressed as sum of other consecutive prime numbers.
// 5 => 2 + 3
// 17 => 2 + 3 + 5 + 7

// Input:
// 40

// Output:
// 5 17 23 31

import java.util.*;
class Main
{
    public static boolean isP(int n)
	{
		int count = 0;
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(int n)
	{
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 2; i < n; i++)
		{
		    if(isP(i))
		    {
		     a.add(i);
		    }
		}
		for(int i = 0; i < a.size(); i++)
		{
		  for(int j = i; j < a.size(); j++)
		  {
		      List<Integer> y = a.subList(i, j + 1);
		      int tsum = 0;
		      for(int l = 0; l < y.size(); l++)
		      {
                tsum = tsum + y.get(l);
		      }
		      if(tsum == n)
		      {
		          return true;
		      }
		  }
		}
		return false;
	}
	
    public static void main(String args[]){
    	Scanner ar = new Scanner(System.in);
		int n = ar.nextInt();
		for(int i = 2; i <= n; i++)
		{
			if(isPrime(i) && isP(i))
			{
				System.out.print(i+" ");
			}
		}
    }
}
