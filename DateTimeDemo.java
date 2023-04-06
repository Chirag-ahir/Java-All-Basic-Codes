package java_dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Current date is: " + localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Current time is: " + localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current date time is: " + localDateTime);
		
		System.out.println();
		System.out.println("================= TIME DIFFERENCE ========================");
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = localTime.plus(55L,ChronoUnit.SECONDS);
		Duration duration = Duration.between(localTime1, localTime2);
		System.out.println("Difference between two time is: " + duration);
		
		System.out.println();
		System.out.println("================= DATE DIFFERENCE ========================");
		
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = localDate1.plusDays(20);
		Period period = Period.between(localDate1, localDate2);
		System.out.println("Difference between two date is: " + period);
		
		System.out.println();
		System.out.println("================= GET CURRENT TIMEZONE ========================");
		
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone.getZone());
		
		System.out.println();
		System.out.println("================= GET INDIA TIMEZONE ========================");
		
		LocalDateTime indiaZone = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(indiaZone);
		
		LocalDate date = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(date);

		
	}

}
