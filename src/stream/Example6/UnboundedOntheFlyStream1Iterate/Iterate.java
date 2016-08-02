package stream.Example6.UnboundedOntheFlyStream1Iterate;






import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;





public class Iterate {
	public static void main(String[] args) {
		
		
		//iterate(seed,function that is expanded)
		Stream.iterate("good news", p -> p + "!").limit(10).skip(2).forEach(p->System.out.println(p));
		
	
		//multiply by 2
		Stream.iterate(1, p -> p * 2  ).limit(10).skip(2).forEach(p->System.out.println(p));
		
		
		
		//what about fibonacchi? it needs previous 2 variables it cant be done with iterate		
		
	}
	
	
	
}
