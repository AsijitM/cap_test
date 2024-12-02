package tricks;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {

        // Parsing dates from string
        String dateStr = "2024-12-01";
        LocalDate date = LocalDate.parse(dateStr);
        String timeStr = "15:30";
        LocalTime time = LocalTime.parse(timeStr);
        String dateTimeStr = "2024-12-01T15:30:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);

        // Custom Parsing with DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate customDate = LocalDate.parse("01-12-2024", formatter);

        // Formatting dates
        String formattedDate = date.format(formatter);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(timeFormatter);

        // Getting current date and time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Manipulating dates and times
        LocalDate futureDate = date.plusDays(10);
        LocalDate pastDate = date.minusMonths(2);
        LocalTime newTime = time.plusHours(5);

        // Add/Subtract using ChronoUnit
        LocalDateTime futureDateTime = dateTime.plus(2, ChronoUnit.WEEKS);
        LocalDateTime pastDateTime = dateTime.minus(3, ChronoUnit.DAYS);

        // Finding the difference between dates
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 1);
        Period period = Period.between(startDate, endDate);
        System.out.println("Difference in months: " + period.getMonths() + ", days: " + period.getDays());

        // Finding the difference in time
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(15, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration.toHours() + " hours and " + duration.toMinutes() % 60 + " minutes");

        // Comparing dates
        boolean isBefore = startDate.isBefore(endDate);
        boolean isAfter = startDate.isAfter(endDate);
        boolean isEqual = startDate.isEqual(endDate);

        // Combining LocalDate and LocalTime to LocalDateTime
        LocalDateTime combinedDateTime = LocalDateTime.of(currentDate, currentTime);

        // Accessing specific components
        int year = currentDateTime.getYear();
        int month = currentDateTime.getMonthValue();
        int day = currentDateTime.getDayOfMonth();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();

        // Leap year check
        boolean isLeapYear = date.isLeapYear();

        // Converting Date (java.util.Date) to LocalDate
        Date oldDate = new Date();
        LocalDate localDate = oldDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Converting LocalDate to Date
        Date dateFromLocalDate = Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Output results
        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);
        System.out.println("Future Date: " + futureDate);
        System.out.println("Past Date: " + pastDate);
        System.out.println("Duration: " + duration.toHours() + " hours");
        System.out.println("Is Before: " + isBefore);
        System.out.println("Is After: " + isAfter);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Combined DateTime: " + combinedDateTime);
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
        System.out.println("Leap Year: " + isLeapYear);
    }
}
