package stream.Example1CreatingStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Lesson1CreatingStream 
{
	public static void main(String[] args) 
	{
		//create a dummy list
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		
		
		
		
		
		//We can use Stream.of() to create a stream from similar type of data. 
		//For example, we can create Stream of integers from a group of int or Integer objects.
		Stream<Integer> stream = Stream.of(1,2,3,4);
		
		
		//works fine
		stream = Stream.of(new Integer[]{1,2,3,4}); 
		
		//Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>
		//stream1 = Stream.of(new int[]{1,2,3,4}); 
		
		
		
		
		
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		System.out.println(sequentialStream.filter(p->p<10).collect(Collectors.toList()));
		
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		
		
		
	}

}


