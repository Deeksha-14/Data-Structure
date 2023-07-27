package ds;

public class ArrayMinMax {
	
	public static String arrayMinMax(int arr[])
	{int max=arr[0];
	int min=arr[0];
	
		for(int i =1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
				
			}
			
		}
		
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
			
		}
	
		return "max "+max+"min "+min;
	}
		
	public static int sumOfElement(int[] arr)
	{	int sum=0;
		for(int i:arr)
		{
			sum=sum+i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		

			
			int[] arr= {10, 34, 23, 22};
				
				
			System.out.println(arrayMinMax(arr));
			System.out.println("sum "+sumOfElement(arr));
			int Sum = sumOfElement(arr);
			double avg = Sum/(arr.length);
			System.out.println("Average "+avg);
			

		}

	}


