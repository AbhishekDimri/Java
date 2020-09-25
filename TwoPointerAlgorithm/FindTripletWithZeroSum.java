package TwoPointerAlgorithm;

import java.util.*;

public class FindTripletWithZeroSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int [n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			Triplet g =  new Triplet();
			
			if(g.findTriplet(a,n))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
			
		}
		sc.close();
	}

}


class Triplet
{
	public boolean findTriplet(int a[], int n)
	{
		Arrays.sort(a);
		
		for(int i=0;i<n-2;i++)
		{
			if(twosum(a, -a[i], i+1))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean twosum(int a[], int x, int i)
	{
		int j = a.length-1;
		
		while(i<j)
		{
			if(a[i]+a[j]>x)
			{
				j--;
			}
			else if(a[i]+a[j]<x)
			{
				x++;
			}
			else
			{
				return true;
			}
		}
		
		return false;
	}
}


