package stmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;
//sorted(),sorted(Comparator.reverseOrder()),anyMatch()
//,allMatch(),noneMatch(),findAny(),findFirst(),
//Concatenating streams
public class Strmmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	List <Integer> list1= Arrays.asList(2,4,1,3,7,5,9);
		list1.stream().sorted().forEach(System.out::println);
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	List <String> list2= Arrays.asList("john","mary","kim","david","smith");
	list2.stream().sorted().forEach(System.out::println);
	list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	*/
	/*Set <String> fruits = new HashSet<String>();	
	fruits.add("One apple");
	fruits.add("One mango");
	fruits.add("Two apples");
	fruits.add("More grapes");
	fruits.add("Two guavas");
	boolean result = fruits.stream().anyMatch(n->{ 
		return n.startsWith("One");  
				});
	System.out.println(result);
	boolean result1 = fruits.stream().allMatch(n->{ 
		return n.startsWith("One");  
				});
	System.out.println(result1);
	boolean result3 = fruits.stream().noneMatch(n->{ 
		return n.startsWith("One");  
				});
	System.out.println(result3);*/
	//findAny() and findFirst()	
		
		/*List<String> Stringlist = Arrays.asList("one",
				"two","three","one");
		
		Optional <String> str = Stringlist.stream().findAny();
		
		System.out.println(str.get());*/
		/*List<String> Stringlist = Arrays.asList("one",
				"two","three","one");
		 Optional <String> str = Stringlist.stream().findFirst();
		 System.out.println(str.get());*/
		
		//concatenating streams
		
		List<String> animallist = Arrays.asList("Dog",
				"Cat","Elephant");
		List<String> birdlist = Arrays.asList("peacock",
				"parrot","crow");
				Stream<String> s1 = animallist.stream();
				Stream<String> s2 = birdlist.stream();
				Stream.concat(s1, s2).forEach(System.out::println);
	}
}
