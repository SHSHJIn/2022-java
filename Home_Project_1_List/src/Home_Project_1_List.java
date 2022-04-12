import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Home_Project_1_List {

	public static void main(String[] args) {
		System.out.println("Home Project #1. List. Basic");
		System.out.println("//// List_1 ////");
		List<Integer> List_1 = new ArrayList<>(List.of(13, 7, 4, 5, 12, 9, 5, 2, 1, 6 ));
		List<Integer> List_2 = new ArrayList<>();
		for(int i = 0 ; i< List_1.size() ; i++)
		{
			List_2.add(List_1.get(i));
		}		
		Display_List("List_1" , List_1);
		System.out.println();
		
		
		System.out.println("//// List_2 ////");
		System.out.println("//// List_2(i) = (i+1)*List_1(i) ////");
		List_mult("List_2", List_2);
		Display_List("List_2", List_2);
		
		
		System.out.println();
		System.out.println("//// Remove each ODD element from List_1 ////");
		List<Integer> List_1_ODD = new ArrayList<>();
		List_1_ODD = List_1;
		Remove_odd_Number("List_1_ODD", List_1_ODD);		
		Display_List("List_1_ODD" , List_1_ODD);
		
		System.out.println();
		System.out.println("//// Remove each EVEN element from List_2 ////");
		List<Integer> List_2_EVEN = new ArrayList<>();
		List_2_EVEN = List_2;
		Remove_even_Number("List_2_EVEN", List_2_EVEN);
		Display_List("List_2_EVEN" , List_2_EVEN);

		System.out.println();
		System.out.println("//// SUM element from List_1 and List_2 ////");
		List<Integer> List_3_SUM = new ArrayList<>();
		for(int j =0 ; j<List_1.size() ;j++ )
		{
			List_3_SUM.add(List_1.get(j) + List_2.get(j));
		}
		Display_List("List_3_SUM" , List_3_SUM);
		
		System.out.println();
		System.out.println("//// Sort element from List_3 ////");
		List<Integer> List_3_SORT = new ArrayList<>();
		for(int k = 0 ; k< List_1.size() ; k++)
		{
			List_3_SORT.add(List_3_SUM.get(k));
		}	
		Collections.sort(List_3_SORT);
		Display_List("List_3_SORT" , List_3_SORT);
		
	}

	public static void Display_List(String List_name, List<Integer> list)
	{
		
		System.out.print(List_name + " = [");
		
		for(int i =0 ; i< list.size() ; i++)
		{
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println("]");
	}
	
	public static void List_mult(String List_name, List<Integer> list)
	{
		for(int i = 0 ; i<list.size() ; i++)
		{
			list.set(i, list.get(i)*(i+1));
		}
	}
	
	public static void Remove_odd_Number(String List_name, List<Integer> list)
	{
		for(int i=0 ; i<list.size(); i++)
		{
			if(i%2==1)
			{
				list.set(i, 0);
			}
			
		}
		for(int i=0 ; i<list.size(); i++)
		{
			if(list.get(i)==0)
			{
				list.remove(i);
			}
			
		}
		
	}
	
	public static void Remove_even_Number(String List_name, List<Integer> list)
	{
		for(int i=0 ; i<list.size(); i++)
		{
			if(i%2==0)
			{
				list.set(i, 0);
			}
			
		}
		for(int i=0 ; i<list.size(); i++)
		{
			if(list.get(i)==0)
			{
				list.remove(i);
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
