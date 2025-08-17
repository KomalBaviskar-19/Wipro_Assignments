package Java8Features;

interface meeting{
	void meet();
	
	default void schedule_meet(){
		System.out.println("Meeting is already Scheduled");
	}
}

public class Functional_Interface {

	public static void main(String[] args) {
		meeting m=()->System.out.println("Meeting is going on");
		m.meet();
	}

}
