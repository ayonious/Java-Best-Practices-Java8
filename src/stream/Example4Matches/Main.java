package stream.Example4Matches;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;





public class Main {
	public static void main(String[] args) {
		List<Person> list=Person.createShortList();
		
		
		//there are 3 people with age 16,17,18
		
		
		//anyone having age 18+
		boolean ret=list.stream().anyMatch(p -> p.getAge()>18 );
		System.out.println(ret);//false
		
		//anyone 17+
		ret=list.stream().anyMatch(p -> p.getAge()>17 );
		System.out.println(ret);//true
		
		
		
		//everyone 10+
		ret=list.stream().allMatch(p -> p.getAge()>10 );
		System.out.println(ret);//true
		
		
		
		
		//how many 16+ 
		long val=list.stream().filter(p -> p.getAge()>16 ).count();
		System.out.println(val);//2
		
		
		
		
		
		
		
		
	}
}
