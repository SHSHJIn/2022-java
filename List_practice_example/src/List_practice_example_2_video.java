import java.util.LinkedList;
import java.util.List;

public class List_practice_example_2_video {

	public static void main(String[] args) {
		System.out.println("         List practice #2");
		System.out.println("/////    LinkedList                           /////");
		System.out.println("/////    Package sorting tecnique(Youtube)    /////");
		
		/// Create a set of package received by user 2 {3, 1, 4, 5, 7,...}
		
		int random_sequence[] = {3,1,4,5,7,8,9,2,6,11,13,10,12,15,14}; /// package index
		
		String Case_number = "";
		
		/// assume packages are arrinving one by one, process sorting
		int current_package_ID, add_index;
		
		/// Lets create a list for local sorting
		
		List <Integer> Video_list = new LinkedList<>();
		
		Video_list.add(random_sequence[0]);
		
		Display_List("Video_list", Video_list);
		
		for(int i=1 ; i<15 ; i++)
		{
			///received paccage ID
			current_package_ID = random_sequence[i]; //// current_package_ID = 4, if i =2
			
			/// case 1 (add element at the beginning, list index = 0)
			if (Video_list.get(0)>current_package_ID)
			{
				Video_list.add(0,current_package_ID); /// video_list ={1,3}
				Case_number = "1";
				add_index=0;
			}
			
			///case 2 (add element at the end of the list, list index = video_list.size()-1)
			
			///video_list.size()-1 /// the index of the last element from the list
			///         3                                     4
			else if (Video_list.get(Video_list.size()-1)<current_package_ID) /// List = {1,3}, current_package_ID = 4
			{
				Video_list.add(current_package_ID);
				Case_number = "2";
				add_index = Video_list.size()-1;
			}
			else
			{
						
			/// case 3 (add element in the specified location)
		    //// current_package_ID = 2, if i =7
     		//// video_list ={1,2,3,4,5,7,8,9,}
			/// list index = 5?
			int index_case_3=1;
			///       7                               6                 index_case_3 = 5
			while(Video_list.get(index_case_3)<current_package_ID)
			{
				index_case_3++;  ///index_case_3 = 5
			}
			Video_list.add(index_case_3, current_package_ID);		
			Case_number = "3";		
			add_index = index_case_3;
			
			}
			
			System.out.print("i:" + i + ", add(" + current_package_ID +"), index: " + add_index + ", case " + Case_number + ": ");
			
			Display_List("Video_list", Video_list);
			
			
		}
		
		
	}

	public static void Display_List(String list_name, List<Integer> list)
	{
		System.out.print(list_name + " = [");
		for( int i=0 ; i<list.size(); i++)
		{
			System.out.print(list.get(i) + ", ");
		}
		System.out.println
		("], list_size : " + list.size());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
