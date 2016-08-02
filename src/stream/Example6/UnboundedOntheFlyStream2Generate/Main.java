package stream.Example6.UnboundedOntheFlyStream2Generate;






import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main {
	public static void main(String[] args) {
		
		//this  can handle multiple previous variables
		FibMaker f_gen=new FibMaker(Long.valueOf(-1),Long.valueOf(1));
		Stream.generate(f_gen).limit(10).forEach(System.out::println);
		
		
		
		
	}
	
	
	
}
