import java.text.NumberFormat;
import java.util.Scanner;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // get a series of test scores from the user
        while (testScore != 999) {
            // get the input from the user
            System.out.print("Enter score: ");
            String input = sc.nextLine();
            testScore = Integer.parseInt(input);
            

            // accumulate score count and score total
            if (testScore <= 100) {
                scoreCount ++;
                scoreTotal += testScore;

                max = Math.max(max, testScore);
                min = Math.min(min, testScore);
            }
            else {
                System.out.println("Invalid entry; not counted");
            }
        }

        // display the score count, score total, and average score
        double averageScore = 0.0;
        if (scoreCount > 0) {
            averageScore = (double) scoreTotal / scoreCount;
            
        }
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(1);
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + number.format(averageScore) + "\n"
                + "Maximum score: " + max + "\n"
                + "Minimum score: " + min + "\n";
        System.out.println(message);
    }
}