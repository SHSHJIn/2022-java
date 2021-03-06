import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_practice_in_class {

	public static void main(String[] args) {

		/// use java version 14
		/// 0405 in class

		System.out.println("List practice #1");
		System.out.println("///// ArrayList /////");
		System.out.println("/////  String  /////");

		List<String> myList_string = new ArrayList<>(); /// empty list

		myList_string.add("Elena"); /// index : 0 myList_string = ("Elena")
		myList_string.add("Tom");   /// index : 1 myList_string = ("Elena", "Tom")
		myList_string.add("Jim");   /// index : 2 myList_string = ("Elena", "Tom", "Jim")
		myList_string.add("Alice"); /// index : 3 myList_string = ("Elena", "Tom", "Jim", "Alice")

		myList_string.forEach(System.out::println);

		System.out.println("/////////////////////////");
		System.out.println("///// Delete 'Jim' /////");
		myList_string.remove(2); /// or use myList_string.remove("Jim");
		/// remove list element with index 2("Jim")

		myList_string.forEach(System.out::println);

		System.out.println("///// method .get() /////");		
		System.out.println("myList_string.get(0) = " + myList_string.get(0)); /// links to "Elena"
		System.out.println("myList_string.get(1) = " + myList_string.get(1)); /// links to "Elena"	
		System.out.println();


		System.out.println("///// method .add(int Index, E element) /////");
		System.out.println("//myList_string.add(1,'Kate') - add 'Kate' to the position 1//");
		///      Elena Tom Alice      .add(1,"Kate")     Elena Kate Tom Alice
		/// Index : 0   1   2                              0    1    2   3
		myList_string.add(1, "Kate");
		myList_string.forEach(System.out::println);

		System.out.println();
		System.out.println("///// method .set(int Index, E element) /////");
		System.out.println("//myList_string.set(2,'John') - replace 'Tom' to 'John'in position 2");

		///      Elena Kate Tom Alice      .set(2,"John")     Elena Kate John Alice
		/// Index : 0   1   2   3                                0    1    2   3

		myList_string.set(2, "John");
		myList_string.forEach(System.out::println);

		System.out.println();
		System.out.println("/////////////////////////////////////");
		System.out.println("///// Integer List : myList_int /////");

		List<Integer> myList_int = new ArrayList<>(List.of(7, 10, 8, 2, 5)); /// not an empty list

		Display_list("myList_int", myList_int);

		///myList_int.forEach(System.out::println);

		System.out.println();
		System.out.println("/////////////////////////////////////");
		System.out.println("Add 56 at the pisition 3");

		///         7 10 8 2 5   myList_int.add(3,56)     7 10 8 56 2 5
		/// index : 0 1  2 3 4                            0 1  2  3 4 5

		myList_int.add(3, 56);
		Display_list("myList_int", myList_int);

		System.out.println();
        System.out.println("Add 23 at the pisition 1");

		///         7 10 8 2 5   myList_int.add(1,23)     7 23 10 8 56 2 5
		/// index : 0 1  2 3 4                            0 1  2  3 4  5 6

        myList_int.add(1, 23);
		Display_list("myList_int", myList_int);

		System.out.println();
        System.out.println("Remove 10 at the pisition 2");
        ///         7 10 8 2 5   myList_int.add(1,23)     7 23 8 56 2 5
     	/// index : 0 1  2 3 4                            0 1  2  3 4 5

		myList_int.remove(2);
		Display_list("myList_int", myList_int);

		System.out.println();
        System.out.println("Add 11 end of the list");
        ///         7 10 8 2 5   myList_int.add(1,23)     7 23 8 56 2 5
     	/// index : 0 1  2 3 4                            0 1  2  3 4 5

        myList_int.add(11); /// add 11 at the end of the list
        Display_list("myList_int", myList_int);

        System.out.println();
        System.out.println("/////////////////////////////////////");
        System.out.println();
        System.out.println("///////////// Float list /////////////////");
        System.out.println();
        System.out.println("Add 1.34, 3.14, 0.000234");

        List<Float> myList_float = new LinkedList<>(); /// an eampty list
        myList_float.add(1.34f);
        Display_list_float("myList_float", myList_float);

        myList_float.add(3.14f);
        Display_list_float("myList_float", myList_float);

        myList_float.add(0.000234f);
        Display_list_float("myList_float", myList_float);

        myList_float.add(0, 10.1f);
        Display_list_float("myList_float", myList_float);

        System.out.println();
        System.out.println("///////////////////////////////////////");
        System.out.println("///////////// Sorting /////////////////");

        Collections.sort(myList_float);

        Display_list_float("myList_float", myList_float);




	}

	public static void Display_list_float(String list_name, List<Float> list)
	{
		System.out.print(list_name + " = [");
		for(int i=0 ; i<list.size() ; i++)
		{
			System.out.print(list.get(i) + ", "+ "");
		}
		System.out.print("], list_size : " + list.size());
		System.out.println();

	}



	public static void Display_list(String list_name, List<Integer>list)
	{
		System.out.print(list_name + " = [");
		for(int i=0 ; i<list.size() ; i++)
		{
			System.out.print(list.get(i) + ", " + "");  /// get 0 7, 1 10, 2 8, 3 2, 4 5 
		}
		System.out.print("], list_size : " + list.size());

	}










}