package first_eclipse_java_consol_application;

public class hello_world_file {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		byte a;
		
		short b;
		
		int c;
		
		long d;
		
		float e;
		
		double f;
		
		boolean j;
		
		char g;
		
		String text = "Hello sutdents";
		
		int number_1 =15;
		
		int number_2 =24;
		
		float number_3 = 0.258789f;
		
		double number_4 = 5.1264;
		
		System.out.println(number_1);
		
		String number_1_text = "number_1";
		
		double Result = number_1 + number_2 + number_3;
		
		System.out.print(number_1+" + "+number_2+" + "+number_3+" = ");
		
		System.out.println(Result);
		
		System.out.println(number_1_text + " = " +number_1);
		
		
		
		
		////  Arrays
		
		int Array[] = new int[5];
		
		
		Array[0] = 1;
		Array[1] = 10;		
		Array[2] = 4;
		Array[3] = -6;
		Array[4] = 0;
		
		System.out.println("i-dimnentional array:");
		
		System.out.print(Array[0]+" , "+Array[1]+" , "+Array[2]+" , "+Array[3]+" , "+Array[4]);
		
				
		System.out.println("\n--------------------");
		
		for (int index =0; index <5; index++)
		{
			System.out.print(Array[index]+" ; ");			
		}
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println("big Array");
		
		
		int Array_big[] = new int[100];
		for(int index_big = 0; index_big<100; index_big++)
		{
			Array_big[index_big] = 0;
		}
		for(int index_big = 0; index_big<100; index_big++)
		{
			System.out.println(index_big + " : " + Array_big[index_big]);
		}	
		
		Display_array(Array_big,100);
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println("big Array_2");
			
		
		
		
		int Array_big_2[] = new int[20];
		
		for(int index_big_2 = 0; index_big_2<20; index_big_2++)
		{
			Array_big_2[index_big_2] =index_big_2*10;
			
		}
		
		/////for(int index_big_2 = 0; index_big_2<20; index_big_2++)
		//{
		//	System.out.println(index_big_2 + ":" + Array_big_2[index_big_2]);
			
		//}////
		
		Display_array(Array_big_2,20);
		
		

		

	}
	// function
	//     type   name
	public static void Display_array(int [] input_array, int array_size)
	{
		for(int index = 0; index<array_size; index++)
		{
			System.out.println(index + ":" + input_array[index]);
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
