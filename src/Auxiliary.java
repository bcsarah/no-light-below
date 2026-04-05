import java.io.IOException;
import java.util.Scanner;
import com.github.lalyos.jfiglet.FigletFont;

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
        return scan.nextLine().strip();
    }

    // Transform a string to Integer, handling possible errors
    public static int toInteger(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Create a Ascii Art
    public static String turnAscii(String text) {
        try {
            return FigletFont.convertOneLine(text);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    // Create a header, a description and list some options
    public static int title(String header, String description, String[] options) {
        while (true) {
            // Header
            clearScreen();
            System.out.print(turnAscii(header));

            // Description
            if (description != null) {
                String[] splitted = description.split("\n");
                for (String line : splitted) {
                    System.out.printf("  %s\n", line);
                }
                System.out.println();
            }

            // Options
            if (options != null) {
                // Show Options
                int i = 0;
                for (String option : options) {
                    System.out.printf("%d -> %s\n", i + 1, option);
                    i++;
                }
                System.out.println();

                // Input
                int input = toInteger(ask(">> "));
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
