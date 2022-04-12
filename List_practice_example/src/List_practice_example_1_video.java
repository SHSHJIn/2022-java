import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_practice_example_1_video {

	public static void main(String[] args) {
		System.out.println("List practice #1");
		System.out.println("/////    ArrayList    /////");
		System.out.println("/////    String    /////");
		
		/// type      list  name
		List<String> myList_string = new ArrayList<>();   /// empty list
		myList_string.add("Elena");   /// int : 0 and add is placing element at the end of the list
		myList_string.add("Tom");   /// int : 1
		myList_string.add("Jim");   /// int : 2
		myList_string.add("Alice");   /// int : 3
		myList_string.forEach(System.out::println);
		System.out.println("//////////////////////////");
		System.out.println("/////  Delete 'Jim'  /////");
		myList_string.remove(2);
		myList_string.forEach(System.out::println);
		System.out.println("//////////////////////////");
		System.out.println();
		System.out.println("/////   Integer  /////////");
		/// List of integer numbers
		
		//List<Integer> myList_int = new ArrayList<>();   /// make an empty integer list
		
		List<Integer> myList_int = new ArrayList<>(List.of(7, 10, 8, 2, 5));
		Display_List("myList_int", myList_int);
		System.out.println("//////////////////////////");
		System.out.println("Add 56, at the position 3");
		myList_int.add(3,56);
		Display_List("myList_int", myList_int);
		
		System.out.println("Add 23, at the position 1");
		myList_int.add(1,23);
		Display_List("myList_int", myList_int);
		
		System.out.println("Remove 10, int the position 2");
		myList_int.remove(2);
		Display_List("myList_int", myList_int);
		
		System.out.println("Add 11 at the end of the list");
		myList_int.add(11);
		Display_List("myList_int", myList_int);
		
		System.out.println("//////////////////////////");
		System.out.println();
		System.out.println("/////    Float   /////////");
		System.out.println("Add 1.34, 3.14, 0.000234");
		
		List<Float> myList_float = new LinkedList<>(); /// empty list
		
		myList_float.add(1.34f);     /// 1.34 is double, 1.34f is float
		Display_List_float("myList_float", myList_float);
				
		myList_float.add(3.14f);     /// 3.14 is double, 3.14f is float
		Display_List_float("myList_float", myList_float);
		
		myList_float.add(0.000123f); /// 0.000123 is double, 0.000123f is float
		Display_List_float("myList_float", myList_float);
		
		myList_float.add(0, 10.1f); /// add 10.1 in the position 0
		Display_List_float("myList_float", myList_float);
		
		System.out.println("//////////////////////////");
		System.out.println();
		System.out.println("/////    Sort list   /////////");
		
		Collections.sort(myList_float);   /// sort list
		
		Display_List_float("myList_float", myList_float
				);
		
	}

	public static void Display_List_float(String list_name, List<Float> list)
	{
		System.out.print(list_name + " = [");
		for( int i=0 ; i<list.size(); i++)
		{
			System.out.print(list.get(i) + ", ");
		}
		System.out.println
		("], list_size : " + list.size());
		
		
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
