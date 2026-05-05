import java.time.LocalDateTime;

public class Main {
    public static void main (String[] args) {
            LocalDateTime dt = LocalDateTime.now();
            System.out.println(dt);
            System.out.println ("Dan: "+ dt.getDayOfMonth());
            System.out.println ("Mjesec: "+ dt.getMonth());
            System.out.println ("Sat: "+ dt.getHour());
            System.out.println ("Sekunde: "+ dt.getSecond());
            System.out.println ("Vrijeme ukupno: "+ dt());  
            System.out.println ("Završni redak");
    }
}
