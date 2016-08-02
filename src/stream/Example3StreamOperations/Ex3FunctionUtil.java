package stream.Example3StreamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Ex3FunctionUtil 
{
	public static void main(String[] args) 
	{
		
		//using the function util
		Function<String,String> tuper= p -> {
			
			int i;
			String ret="";
			for(i=0;i<p.length();i++)
			{
				ret+=(char)(p.charAt(i)+'A'-'a');
			}
			return ret;
		};
		
		Stream<String>names = Stream.of("abc", "d", "ef");
		System.out.println(names.map(tuper).collect(Collectors.toList()));
		//prints [ABC, D, EF]
		
		
	}

}


