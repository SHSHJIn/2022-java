package dynamic_array_test;

import java.util.Scanner;

public class test002 {
	
	static int Array[];

	static int array_capacity = 5;
	
	static int inserted_number = 0;
	
	
		public static void main(String[] args) {
			
		
			
			System.out.println("Arrays, Limitations, Example 1");
			
			Array =new int[array_capacity];
				
				for (int i =0 ; i<array_capacity; i++)
				{
					Array[i]=0;
				}
			
				Display_array(Array);
				
			Scanner sc = new Scanner (System.in);
			
			boolean Process = true;
			
			int inserted_number = 0;
			
			while (Process)
			{
				
			
				if(inserted_number>=array_capacity) //// array_capacity=5)
						{
					////increase array size////
					Increase_array_size();
					System.out.println("----!!!!! Increase array size !!!!--");
					
					
						}
				
				
				System.out.print("Please insert an number with the index #");
				System.out.print(inserted_number); System.out.print(":");
				Array[inserted_number] = sc.nextInt();
				Display_array(Array);
				inserted_number++;
			}

		}

public static void Increase_array_size()
{
	////step 1 : create a new temp array with size (array_capacity+1)
	int Temp[]= new int[array_capacity+1];//// temp with size 6
	
	////step 2 copy data from Array to temp
	for (int i=0; i<array_capacity; i++)
	{
		Temp[i] = Array[i];
	}
	
	Array = Temp;
	
	////Array[] = {2,5,7,9,6,x}
	
	//// update array capacity
	array_capacity++;
	
	
}
		
		


	public static void Display_array(int []array_in)
	{
		System.out.print("Array[] =");
		for (int i=0; i<array_capacity; i++)
		{
			System.out.print(array_in[i]);
			System.out.print(",");
		}
		////Display array size(array_capacity)
		System.out.print(" : Array size");System.out.print(array_capacity);
		System.out.println();
	}

	


}






















