package Java8Features;

import java.util.ArrayList;

interface greeting{
	void greet();
}

public class Lambda {

	public static void main(String[] args) {
	greeting g=() ->System.out.println("Hello Good morning");
	g.greet();
	
	ArrayList<String> arr = new ArrayList<>();
	arr.add("1");
	arr.add("2");
	arr.add("3");
	
	for(String n:arr) {
		System.out.println(n);
	}
	
	}

}
