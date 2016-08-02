package stream.Example3StreamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Ex7Sort 
{
	public static void main(String[] args) 
	{
		
		List<Integer> list=Arrays.asList(10,12,451-4,-8,10);
		
		System.out.println(list.stream().sorted( (p1,p2) -> p1-p2 ).collect(Collectors.toList()));
		//output:[-8, 10, 10, 12, 447]
		
		System.out.println(list.stream().sorted( (p1,p2) -> { int ret=p1-p2;
		return ret;} ).collect(Collectors.toList()));
		//output:[-8, 10, 10, 12, 447]
		

	}
	
	
	

}


