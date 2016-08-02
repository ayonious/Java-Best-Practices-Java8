package stream.Example6.UnboundedOntheFlyStream1Iterate2;






import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;





public class Iterate {
	public static void main(String[] args) {
		
		
		
		MyClass m=new MyClass();
		m.a0=-1;
		m.a1=1;
		
		
		//multiply by 2
		Stream.iterate(m, p -> {  int i=p.a0; p.a0=p.a1; p.a1 = (p.a0+i); return p; }  ).limit(10).skip(2).forEach(p->System.out.println(p.a1));
		
		
		
		
		
	}
	
	
	
}
