package dynamic_array_program_03_in_class;

import java.util.Scanner;

public class dynamic_arraysprogram_3_in_class {


	//// global variables
		private static int Array_capacity =5;
		private static int Array[] = new int[Array_capacity];

		public static void main(String[] args) {

			System.out.println("Dynamic arrays. Example 3. Remove elements from arrays");


			/// add zeros to Array

			for(int i =0; i<5; i++)
			{

				Array[i] =i;


			}
		    Display_array(Array); /// call function to display Array elements

			////Array = {0,0,0,0,0}

			//// prompt user to add elements to Array

			Scanner sc = new Scanner(System.in);

			boolean Process = true;

			int Removed_index;

			while(Process)
			{
				if(Array_capacity>2)
				{
					
					
					

					System.out.println();
					System.out.print("type the index of element to be removed #: ");
					Removed_index = sc.nextInt();
					
					if(Removed_index<Array_capacity)
					{
						RemoveElement(Removed_index);

						Array_capacity--;
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
					Process =
							
							false; //// stop infinite loop
				}

			}







		}

		public static void RemoveElement(int index)
		{
			////index = 2;
			////Array_capacity = 5
			//// Array[]= [0,1,2,3,4] -> Array[]={0,1,3,4}
			//// index     0 1 2 3 4              0 1 2 3

			int Temp[] = new int[Array_capacity - 1]; //// Temp = {x,x,x,x}, size =4


			int new_array_index = 0;

			for(int i=0; i<Array_capacity;i++) //// i = 0,1,2,3,4
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
			for(int i=0; i <Array_capacity; i++)
			{
				System.out.print(input_array[i] +", ");
			}

			System.out.print("     : Array size = " +Array_capacity);

		}






	}
