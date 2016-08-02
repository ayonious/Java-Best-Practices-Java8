package stream.Example3StreamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
 *remove first n elements skip(n) 
 *take first n elemnts limit(n) 
 */



public class Ex6SkipLimit 
{
	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("ab","b","c","d","e");
		
		System.out.println(list.stream().skip(2).collect(Collectors.toList()));
		//output: [c,d,e]
		
		System.out.println(list.stream().limit(3).collect(Collectors.toList()));
		//output: [ab, b, c]
		
		
		
		
			
	}
	
	
	

}


