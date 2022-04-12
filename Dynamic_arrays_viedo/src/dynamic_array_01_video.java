import java.util.Scanner;
//±¸Çü
public class dynamic_array_01_video {

	public static void main(String[] args) {
		System.out.println("Arrays, limitations, Example 1");
				
		int Array[]= new int [5];

		int inserted_number = 0;
		
		for (int i=0; i<5; i++)
			{
			Array[i]=0;
			}
		
		Display_array(Array);
		
		Scanner sc = new Scanner(System.in);
			
		boolean Process = true;
		
		while(Process)
		{
			System.out.print("Please insert a number with the index #");
			System.out.print(inserted_number);
			int new_number = sc.nextInt();
			System.out.println(new_number);
			
			
		}
		
	}

	
	public static void Display_array(int []array_in)
	{
		System.out.print("Array[] +");
		for (int i=0; i<5;i++)
		{
			System.out.print(array_in[i]);
			System.out.print(",");
		}
	}
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
