import java.util.Scanner;

public class Auxiliary {
    static Scanner scan = new Scanner(System.in);

    // Clear terminal screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Ask something, returning the type you want
    public static String ask(String phrase) {
        System.out.print(phrase);
        return scan.nextLine();
    }

    // Create a header, a description and list some options
    public static int title(String header, String description, String[] options) {
        while (true) {
            // Header
            clearScreen();
            System.out.printf("#  %s  #\n", header);

            // Description
            if (description != "") {
                String[] splitted = description.split("\n");
                for (String line : splitted) {
                    System.out.printf("  %s\n", line);
                }
                System.out.println();
            }

            // Show Options
            if (options.length > 0) {
                int i = 0;
                for (String option : options) {
                    System.out.printf("%d -> %s\n", i + 1, option);
                    i++;
                }
                System.out.println();

                // Input
                int input = Integer.parseInt(ask(">> "));
                System.out.println();

                // Validate Input
                if (input >= 1 && input <= options.length) {
                    return input;
                }
            } else {
                return 0; // Quit if hasn't options
            }
        }
    }
}
