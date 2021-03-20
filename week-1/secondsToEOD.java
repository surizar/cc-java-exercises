/*
https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html
Duration.between: Obtains a Duration representing the duration between two temporal objects. 
between(Temporal startInclusive, Temporal endExclusive)
*/
import java.time.Duration;

// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
import java.time.LocalDateTime;

public class secondsToEOD {

    private static final long daySeconds = 24*60*60;

    public static void main (String[] args){
    LocalDateTime date = LocalDateTime.now();
    long seconds = Duration.between(date.withSecond(0).withMinute(0).withHour(0), date).getSeconds();
    System.out.println( daySeconds -seconds );
    }
}