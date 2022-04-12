package dynamic_array_program_03_in_class;

import java.util.Scanner;

public class dynamic_array_program_04_in_class {
	//// global variables
	static int array_capacity =5;
	static int Array[];

	public static void main(String[] args) {
		

		System.out.println("video. Dynamic arrays. Example 4. final version");

		////dynamic array with both: increase and reduce array size 
		//// 대부분 3 복사한거
		
		/// add zeros to Array
		
		Array = new int[array_capacity];
		

		for(int i =0; i<array_capacity; i++)
		{

			Array[i] =0;


		}
	    Display_array(Array); /// call function to display Array elements

		////Array = {0,0,0,0,0}

		//// prompt user to add elements to Array

		Scanner sc = new Scanner(System.in);

		boolean Process = true;

		int Removed_index, insert_index, insert_number, marker;

		while(Process)
		{
			System.out.println("Type '1' to insert, or '2' to removed");
			marker = sc.nextInt() ;//// marker must be 1 or 2
			
			if(marker==1)////insert element to array
			{
				System.out.println("Add new element: Please type index #:");
				insert_index=sc.nextInt();
				System.out.println("Type '1' to insert, or '2' to removed");
				insert_number=sc.nextInt();
				
				Add_New_Element(insert_index, insert_number);
				Display_array(Array);
			}
			else if(marker==2)
			{

				if(array_capacity>2)
				{
					System.out.println();
					System.out.println("type the index of element to be removed #: ");
					Removed_index = sc.nextInt();

					if(Removed_index<array_capacity)
					{
						RemoveElement(Removed_index);

						array_capacity--;
						Display_array(Array);
					}
					else{
						System.out.println();
						System.out.println("Inserte index is invalid  ");
						Display_array(Array);
					}


				}
				else
				{
					System.out.println();
					System.out.println("-----!!!!!-----");
					System.out.print("IMPOSSIBLE TO REMOVE, minimum array size is 2  ");
					Process =false; //// stop infinite loop
				}
	    	}
			else
			{
				System.out.println();
				System.out.println("Please insert a correnct marker  '1' or '2' ");
			}
			
		}
	}
	
	public static void Add_New_Element(int index, int insert_number)
	{
		if(index>=array_capacity)
		{
			Grow_array_size();
		}
		Array[index] =insert_number;
		
	}
	
	////grow function insert
	public static void Grow_array_size()
	{
		
		//// create array temp with the size Array_capacity +1
		array_capacity++; //// Array_capacity =6
		
		int Temp[] = new int[array_capacity]; //// Temp has 6 elements
		
		//// copy elements from Array to Temp
		//// Array = {5,6,7,3,4}
		
		for(int i=0; i <array_capacity -1; i++) //// i = 0,1,2,3,4
		{
			
			Temp[i]=Array[i];
			
			
		}
		////Temp = {5,6,7,3,4, x}
		
		////reassign Array
		Array = Temp;
		//// Array={5,6,7,3,4,x}
	}
	
	
	
	
	
	

	public static void RemoveElement(int index)
	{
		////index = 2;
		////Array_capacity = 5
		//// Array[]= [0,1,2,3,4] -> Array[]={0,1,3,4}
		//// index     0 1 2 3 4              0 1 2 3

		int Temp[] = new int[array_capacity - 1]; //// Temp = {x,x,x,x}, size =4


		int new_array_index = 0;

		for(int i=0; i<array_capacity;i++) //// i = 0,1,2,3,4
		{
			////Temp[i] =Array[i];
			if(i<index) ////i=0,1
			{
				Temp[i] = Array[i];		//// Temp = {0,1}
			}
			else if (i> index) ////i=3,4
			{
				Temp[i-1] = Array[i];    //// Temp = {0,1,3,4}
			}				

		}

	}


	public static void Display_array(int []input_array)
	{
		for(int i=0; i <array_capacity; i++)
		{
			System.out.print(input_array[i] +", ");
		}

		System.out.print("     : Array size = " +array_capacity);

	}



}
