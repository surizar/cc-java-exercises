/*
https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html
Duration.between: Obtains a Duration representing the duration between two temporal objects. 
between(Temporal startInclusive, Temporal endExclusive)
*/
import java.time.Duration;

// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
import java.time.LocalDateTime;

public class eodPercentage {

    private static final int hours = 24;

    public static void main (String[] args){
    LocalDateTime date = LocalDateTime.now();
    long seconds = Duration.between(date.withSecond(0).withMinute(0).withHour(0), date).getSeconds();
    float hours = seconds/3600;
    float percentage = 100*(hours/24);
    System.out.printf("%.2f%%", percentage);
    }
}