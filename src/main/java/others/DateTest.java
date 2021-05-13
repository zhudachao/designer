package others;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//可以使用 Instant 代替 Date，LocalDateTime 代替 Calendar，DateTimeFormatter 代替 SimpleDateFormat
public class DateTest {

	public static void main(String[] args) {
		LocalDateTime lt = LocalDateTime.now();
		
		Instant ins = Instant.now();
		DateTimeFormatter sf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    
		System.out.println(sf.format(lt));
//      Thread.currentThread().getContextClassLoader().getResource("").toURI().getPath();
		
	}
}
