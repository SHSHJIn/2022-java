import java.util.LinkedList;
import java.util.List;

public class List_practice_in_class2 {

	public static void main(String[] args) {
		System.out.println("       List practice #2     ");
		System.out.println("///      LinkedList      ///");
		System.out.println("///    Package sorting tecnique     ///");
		
		////create a set of packages received by user 2
		
		int random_sequence[]= {3,1,4,5,7,8,9,2,6,11,13,10,12,15,14};
		
		///display random_sequence
		System.out.print("random_sequence = [");
		for(int i =0 ; i<random_sequence.length;i++)
		{
			System.out.print(random_sequence[i] + ", ");
		}
		System.out.println("]");
		
		
		///Video_list = {1,2,3,4,5,6,7,8,9,10,...,15}
		
		LinkedList<Integer> Video_list = new LinkedList<>();
		
		int current_package_ID;
		
		String Case_number = "";
		
		/// add first element from random sequence
		
		Video_list.add(random_sequence[0]); ///Video_list = {3}
		
		
		Display_list("Video_list",Video_list);
		
		
		for(int i=1 ; i<15 ; i++)
		{
			current_package_ID = random_sequence[i]; /// i = 1, current_package_ID = 1
			
			///curent_package_ID = 1
			/// Video_list = [3, ],   current_package_ID < Video_list[0] then case 1
			///                                     add at the beginning of the list
			
			///case 1   (add element at the beginning of the list)
			if(current_package_ID < Video_list.get(0))
			{
				
				//         position    element to add
				Video_list.add(0, current_package_ID); /// video_list ={1,3}
				Case_number = "1";
			}
			
			
			///case 2   (add element at the end of the list)
			///           4                     Video_list.size =  2
			///                                 Video_list.size  -1 =  1
			///			                   Video_list.get(Video_list.size-1) ->3
			else if(current_package_ID > Video_list.get(Video_list.size()-1))
			{
				Video_list.add(current_package_ID); ///Video_list = {1,3,4}
				Case_number = "2";
			}			
			
			///case 3   (add element at the specified position)
			else
			{
				Case_number = "3";
				/// index        0  1  2  3  4  5  6          0  1  2  3  4  5  6  7
				///Video_list = {1 ,3 ,4, 5, 7, 8, 9, },  -> [1, 2, 3, 4, 5, 7, 8, 9]
				///specified position = 1
				///Video_list.add(1, current_package_ID)   Video_list->[1, 2, 3, 4, 5, 7, 8, 9]
				
				int index_case_3 =1;
				///             index_case_3 =1             6
				///   Video_list.get(index_case_3) = 3
				while(Video_list.get(index_case_3) < current_package_ID)
				{
					///System.out.println(index_case_3);
					index_case_3++;
				}
				
				Video_list.add(index_case_3, current_package_ID);
			}
			
			
			
			// i:1, add(1), index :0, case 1: Video_list = [1,3,], list_size :2
			
			System.out.print("i:" + i + ", add(" + current_package_ID + ")  " +", Case " + Case_number +": ");
			
			Display_list("Video_list",Video_list);
			
		}
		
		
		
		
		
		
		
		
	}
	
	public static void Display_list(String list_name, List<Integer>list)
	{
		System.out.print(list_name + " = [");
		for(int i=0 ; i<list.size() ; i++)
		{
			System.out.print(list.get(i) + ", " + "");  /// get 0 7, 1 10, 2 8, 3 2, 4 5 
		}
		System.out.println("], list_size : " + list.size());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
