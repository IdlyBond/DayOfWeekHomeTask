import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DayCounter {
    private Scanner scr = new Scanner(System.in);

    public DayOfWeek getDay(LocalDate date){
        return date.getDayOfWeek();
    }

    public LocalDate getDate(){
        System.out.println("Enter date");
        while (true)
            try {
                return LocalDate.parse(scr.nextLine());

            } catch (DateTimeParseException e){
                System.out.println("Wrong Date");
            }
    }
}
