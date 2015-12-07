import java.io.*;
import java.util.*;

class QuickSort
{
	static int arr[];
	static void getData(Scanner sc,int size)
	{
		arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	static void printData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(""+arr[i]+" ");
		}
	}
	static void qsort(int size)
	{
		sort(0,size-1);

	}

	static void sort(int start,int end)
	{
		int pindex=partition(start,end);
		printData();
		System.out.println("pindex: "+pindex);
		if(start<pindex-1)
			sort(start,pindex-1);
		if(pindex<end)
			sort(pindex,end);
	}

	static int partition(int start,int end)
	{
		System.out.println("call : "+start+" "+end);
		int left=start;
		int right=end;
		int pivot=arr[left];
		while(left<=right)
		{
			while(arr[left]<pivot)
				left++;
			while(arr[right]>pivot)
				right--;
			if(left<=right)
			{
				int tmp=arr[left];
				arr[left]=arr[right];
				arr[right]=tmp;
				left++;
				right--;
			}
		}
		System.out.print("left: "+left+" r: "+right+"\n");
		return left;
	}
				
		public static void main(String []as)
		{
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			QuickSort.getData(sc,size);
			QuickSort.qsort(size);
			QuickSort.printData();
		}
}
		