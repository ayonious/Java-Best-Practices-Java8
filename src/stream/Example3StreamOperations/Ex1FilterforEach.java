package stream.Example3StreamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Ex1FilterforEach 
{
	public static void main(String[] args) 
	{
		//create a dumb list
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		
		
		//filter foreach
		Stream<Integer> highNums = myList.stream().filter(p -> p > 90); //filter numbers greater than 90
		System.out.print("High Nums greater than 90=");
		highNums.forEach(p -> System.out.print(p+" "));
		//prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "
		System.out.println("");
		
		
		
		
	}

}


