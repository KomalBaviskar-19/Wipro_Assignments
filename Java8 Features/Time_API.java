package Java8Features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Time_API {

	public static void main(String[] args) {
		LocalTime today = LocalTime.now();
		System.out.println(today);
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
	
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate birthday = LocalDate.of(2002,2,9);
		Period ageDiff = Period.between(birthday, d);
		System.out.println(ageDiff.getYears());
		
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(8,45);
		Duration d1 = Duration.between(start, end);
		System.out.println(d1);
		
		
	}

}
