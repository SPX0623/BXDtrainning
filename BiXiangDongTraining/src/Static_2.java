
public class Static_2 {

	public static void main(String[] args) {
		int[] arr= {3,4,5,8};
		System.out.println(Tool.getMax(arr));
		
		
		
		

	}

}
class Tool
{
	public static int getMax(int []arr)
	{
		int max=0;
		for(int x=1;x<arr.length;x++)
		{
			
			if(arr[x]>arr[max])
			{
				max=x;
			}
			
			
		}
		return arr[max];
	}
	public static int getMin(int []arr)
	{
		int min=0;
		for(int x=1;x<arr.length;x++)
		{
			
			if(arr[x]<arr[min])
			{
				min=x;
			}
			
			
		}
		return arr[min];
	}
	public static void selectSort(int[]arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]<arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
		
		
	}
	private static void swap(int[]arr,int a,int b)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	
		
	}
	public static void bubbleSort(int[]arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-1;y++)
			{
				swap(arr,x,y);
				
			}
		}
	}
	
	
	
}