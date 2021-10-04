package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        // Prompt the user to ask a question
        // When the user asks a question, generate a random number between
        // 1 and 4 and feed it into the Magic8Ball
        // Print the response

        while(true) {
            System.out.println("What's your question? Type \"exit\" to exit.");

            Scanner scan = new Scanner(System.in);

            Random rand = new Random();

            String dontCare = scan.nextLine();

            if (dontCare.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye.");

                break;
            }

            System.out.println(Magic8Ball.getResponse(rand.nextInt(4)));
        }



    }
}
