import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class Auxiliary {
    static Scanner scan = new Scanner(System.in);

    // Clear terminal screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Ask something, returning the type you want
    public static String ask(String text) {
        System.out.print(text);
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
            return "";
        }
    }

    // Print something and wait for a key to press
    public static void say(String text) {
        try {
            Terminal terminal = TerminalBuilder.builder().system(true).build();
            System.out.println(text);
            terminal.enterRawMode();
            terminal.reader().read();
            terminal.close();
        } catch (IOException e) {
            return;
        }

    }

    // Create a header, a description and list some options
    public static void title(String header, String description, Map<String, Runnable> options) {
        while (true) {
            // Header
            clearScreen();
            System.out.print(turnAscii(header));

            // Description
            if (description != null) {
                String[] splitted = description.split("\n");
                for (String line : splitted) {
                    System.out.printf("  %s\n", line); // Print line per line
                }
                System.out.println();
            }

            // Options
            if (options != null) {
                // Show Options
                int i = 1;
                for (String option : options.keySet()) {
                    System.out.printf("%d -> %s\n", i++, option);
                }

                // Input
                int input = toInteger(ask(">> "));
                System.out.println();
                List<String> keys = new ArrayList<>(options.keySet()); // Transform options in list

                // Validate Input
                if (input >= 1 && input <= keys.size()) {
                    String key = keys.get(input - 1); // Select the right key
                    Runnable function = options.get(key); // Select the function
                    function.run(); // Run the function
                    break;
                }
            } else {
                break;
            }
        }
    }
}
