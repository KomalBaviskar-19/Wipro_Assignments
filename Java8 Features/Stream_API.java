package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
 
public class Stream_API{
 
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(4,5,6,1,0,7,15);
		Stream<Integer> data=nums.stream();
		
		nums.stream()
		.sorted()
		.map(n->n*4)
		.forEach(n->System.out.println(n));
	}
}