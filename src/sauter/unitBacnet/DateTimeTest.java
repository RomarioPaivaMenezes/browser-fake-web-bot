package sauter.unitBacnet;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeTest {

	public static void main(String[] args) {
		System.out.println("ldt " + LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		System.out.println("ctm " + System.currentTimeMillis());
		
		Date date = new Date(1674499753426L);
		
	
	}
}
