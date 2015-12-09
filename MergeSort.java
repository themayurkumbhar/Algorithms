import java.util.*;
import java.io.*;

class MergeSort
{
	static int []arr;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 arr=new int[n];
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		mergerSort(0,n-1);
		display();
	}
	static void display()
	{
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static void mergerSort(int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergerSort(start,mid);
			mergerSort(mid+1,end);
			 merge(start,mid,end);
		}
		
	}

	static void merge(int start,int mid,int end)
	{
		
		int lsize=mid-start+1;
		int rsize=end-mid;
		int []larr=new int[lsize];
		int []rarr=new int[rsize];
		for(int i=0;i<lsize;i++)
		{
			larr[i]=arr[start+i];
		}
		for(int i=0;i<rsize;i++)
		{
			rarr[i]=arr[mid+i+1];
		}
		int i=0,j=0,k=start;
		while(i<lsize&&j<rsize)
		{
			if(larr[i]<=rarr[j])
			{
				arr[k]=larr[i];
				i++;
			}
			else
			{
				arr[k]=rarr[j];
				j++;
			}
			k++;
		}
		while(i<lsize)
		{
			arr[k++]=larr[i++];
		}
		while(j<rsize)
		{
			arr[k++]=rarr[j++];
		}
		
	}
}