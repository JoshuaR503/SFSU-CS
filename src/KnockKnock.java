import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {

        final String[] responses = {
                "Knock! Knock!",
                "Voodoo",
                "Voodoo you think you are, asking all these questions?"
        };

        final String[] expectedAnswer = {
                "Who's there?",
                "Voodoo who?",
        };

        for (int i = 0; i < responses.length; i++) {
            if (i < 2) {
                System.out.println(responses[i]);

                final Scanner scanner = new Scanner(System.in);
                final String userResponse = scanner.nextLine();

                if (!expectedAnswer[i].equals(userResponse)) {
                    return;
                }

            } else {
                System.out.println(responses[i]);
                return;
            }
        }
    }
}
