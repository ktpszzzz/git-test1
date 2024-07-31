
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int counter = 0 ;
        int randomNumber = (int) Math.round(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
         Instant start = Instant.now();
         System.out.println("Start");
        
        while (counter != 5) { 
            counter++;
            System.out.println("Counter = " + counter );
            System.out.println("Please enter your number");
        int myNumber = scanner.nextInt();
        if (myNumber == randomNumber ) {
            System.out.println("Your number is correct");
            
        } else if (myNumber > randomNumber ){
            System.out.println("Too hihg");
        } else{
            System.out.println("Too low");
            
        }
     }       Instant end = Instant.now();
             scanner.nextLine();
             Duration playTime = Duration.between(start, end);
             long minutesPlayed = playTime.toSeconds();
             System.out.println("You played for: " + minutesPlayed + " Seconds");
     }
}
