package dynamic_array_0407_subject;

import java.util.Scanner;

public class dynamic_array_002_subject {
	
	static int Array[];
	static int array_capacity =5;

	public static void main(String[] args) {
		
		System.out.println("video, dynamic arrays, example 4, final");
		
		Array = new int[array_capacity];
		
		///0,1,2,3,4 to array
		
		for (int i =0 ; i<array_capacity; i++)
		{
			Array[i] =i;
		}
		
		Display_array(Array);
		
		/// infinite loop to insert elements to array
		
		Scanner sc = new Scanner(System.in);
		
		boolean Process = true;
		
		int Removed_index,insert_index,inserted_element ;
		
		int choice;
		
		while(Process)
		{
		    System.out.print("Type '1' to insert, or '2' to remove:");
			choice = sc.nextInt();
			
			if (choice ==1) /// add element to array
			{
			    System.out.print("Add new element : Please type index#:");
				insert_index = sc.nextInt();
			    
			    System.out.print("Add new element : Please type number#:");
				inserted_element = sc.nextInt();
				
				Add_New_element(insert_index,inserted_element);
				Display_array(Array);
				
			}
			else if(choice ==2) //// remove element from array
			{
				if(array_capacity>2)
				{
				System.out.print("Remove element : Please type index#:");	
				Removed_index = sc.nextInt();
				
				if(Removed_index < array_capacity) //if array capacity =5, valid removedindex =01234
				{
					////remove element with index removed_index from array
					RemoveElement(Removed_index);
				    System.out.println("-----!!!!!-----");
				    System.out.println("Element is removed");
				}
				else
				{
				    System.out.println("-----!!!!!-----");
				    System.out.println("Impossible to remove, insert a valid index");
				}
				Display_array(Array);

				}
				else
				{
					System.out.println("-----!!!!!-----");
					System.out.println("Impossible to remove, minimum array ize is 2");
					//Process = false; //// while loop will be stopped
				}

				
			}
			
			/*
			if(array_capacity>2)
			{
				System.out.print("Type the index of element to be removed #:");
				
				Removed_index = sc.nextInt();
				
				if(Removed_index < array_capacity) //if array capacity =5, valid removedindex =01234
				{
					////remove element with index removed_index from array
					RemoveElement(Removed_index);
				    System.out.println("-----!!!!!-----");
				    System.out.println("Element is removed");
				}
				else
				{
				    System.out.println("-----!!!!!-----");
				    System.out.println("impossible to remove, insert a valid index");
				}
				Display_array(Array);

			}
			else
			{
				System.out.println("-----!!!!!-----");
				System.out.println("Impossible to remove, minimum array size is 2");
				Process = false; //// while loop will be stopped
				
			}
			*/

		}
		

	}

	
	public static void Add_New_element(int index, int element)
	{
		if(index >= array_capacity)		
		{
			///increase an array size
			Increase_array_size_advanced(index);///array [] = 0 10 0 0 7 0 0 0 0
			
		}
		Array[index] = element;		////array [] = 0 10 0 0 7 0 0 0 2
		
	}
	
	
	public static void Increase_array_size_advanced(int array_size)
	{
		////step 1 : create array with the size array size
		int Temp[]= new int[array_size +1];//// temp with size 6
		
		///add 0 to temp
		////step 2 copy data from Array to temp
		for (int i=0; i<array_size; i++)///temp size is 6
		{
			Temp[i] = 0;
		}
		
		for (int i=0; i<array_capacity; i++)///array capacity is 5
		{
			Temp[i] = Array[i];
		}

		Array = Temp;

		////Array[] = {2,5,7,9,6,x}

		//// update array capacity
		array_capacity=array_size +1;
	}
	
	
	public static void RemoveElement(int index_remove)
	{
		///create a temp array with the size array capacity -1
		int Temp[]= new int [array_capacity-1]; ///Temp[] = x,x,x,x
		
		/// copy elements from array to temp
		for (int i=0; i<array_capacity;i++) ///i=01234
		{
			///copy elements with index i< index_remove
			if(i<index_remove) ///i=01
			{
				Temp[i]=Array[i];
			}
			else if(i>index_remove)//i=34
			{
				Temp[i-1] =Array[i]; ///i=3, new_i =2  i=4, new_i=3
			}
			
		}
		Array=Temp; ///array[] = 0134 size =4
		array_capacity--; ///array capcacity =4
		
		
		
	}
	

	

	
	public static void Display_array(int []array_in)
	{
		System.out.print("Array[]=");
		for(int i=0; i <array_capacity; i++)
		{
			System.out.print(array_in[i]);
			System.out.print(", ");
		}
		///Display array size (arraycapacity)
		System.out.print(" : Array size =");
		System.out.print(array_capacity);
		System.out.println();
	}
	
}
















































