package stream.Example5ParallelStream;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;






public class Main 
{
	public static void timingTest(Stream<Person> teststream)
	{
		long start=System.nanoTime();
		teststream.forEach(p -> p.doSlowOp());
		long end=System.nanoTime();
		System.out.println(deltaSecond(end-start));
	}

	public static double deltaSecond(long val)
	{
		return val/1000000000;
	}

	public static void main(String[] args) {

		int processors=Runtime.getRuntime().availableProcessors();
		
		
		//sequential stream
		Stream<Person> sequentialStream = Person.createShortList().stream();
		System.out.println("time taken for serial version on "+processors+" core machine ");
		timingTest(sequentialStream );
		
		
		
		
		//parallel stream
		Stream<Person> parallelStream = Person.createShortList().parallelStream();
		System.out.println("time taken for paralel version on "+processors+" core machine ");
		timingTest(parallelStream );
		
		
		


	}



}
