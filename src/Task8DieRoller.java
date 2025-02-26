import java.util.Random;
import java.util.Scanner;

public class Task8DieRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userScanner = new Scanner(System.in);
        boolean throwUntil = true;

        while (throwUntil) {
            int rollAttempt = 1;

            System.out.println("Roll Die1 Die2 Die3 Sum");
            System.out.println("------------------------");

            while (true) {
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%d %4d %4d %4d %4d\n", rollAttempt, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
                rollAttempt++;
            }

            System.out.print("Would you like to attempt a roll again? (yes/no): ");
            String userResponse = userScanner.next().toLowerCase();
            if (!userResponse.equals("yes")) {
                throwUntil = false;
            }
        }
        userScanner.close();
    }
}
