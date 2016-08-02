package stream.Example2StreamtoListSetArrayMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Lesson2StreamtoListSetArrayMap 
{
	public static void main(String[] args) 
	{
		//We can use Stream collect() method to get List, Map or Set from stream.
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList); //prints [1, 2, 3, 4]
		
		
		//create map
		intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
		Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
		System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}
		
		
		
		//create set
		intStream = Stream.of(1,2,3,4);
		System.out.println(intStream.collect(Collectors.toSet()));
		
		
		
		//array
		intStream = Stream.of(1,2,3,4);
		Integer[] intArray = intStream.toArray(Integer[]::new);
	}

}


