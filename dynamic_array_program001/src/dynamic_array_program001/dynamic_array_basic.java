package dynamic_array_program001;

import java.util.Scanner;

public class dynamic_array_basic {

	public static void main(String[] args) {
		System.out.println("Arrays, Limitations, Example 1");
		
		int Array[] =new int[5];
			
			for (int i =0 ; i<5; i++)
			{
				Array[i]=0;
			}
		
		Scanner sc = new Scanner (System.in);
		
		boolean Process = true;
		
		int inserted_number = 0;
		
		while (Process)
		{
			System.out.print("Please insert an element #");
			System.out.print(inserted_number);
			System.out.print(":");
			Array[inserted_number] = sc.nextInt();
			Display_array(Array);
			inserted_number++;
		}

	}




public static void Display_array(int Array[])
{
	System.out.print("Array[] =");
	for (int i=0; i<5; i++)
	{
		System.out.print(Array[i]);
		System.out.print(",");
	}
	System.out.println();
}

}



































