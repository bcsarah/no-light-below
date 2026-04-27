import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class Auxiliary {
    // Globals
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static String textColor = "\033[31m";
    static boolean debugMode = true;
    static boolean showRolls = true;

    // Clear terminal screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print(textColor);
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
        System.out.print(text);
        scan.nextLine();
    }

    // Create a header, a description and list some options
    public static int title(String header, String description, Map<String, Runnable> options) {
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
                System.out.print(">> ");
                int input = toInteger(scan.nextLine());
                System.out.println();
                List<String> keys = new ArrayList<>(options.keySet()); // Transform options in list

                // Validate Input
                if (input >= 1 && input <= keys.size()) {
                    String key = keys.get(input - 1); // Select the right key
                    Runnable function = options.get(key); // Select the function
                    if (function == null)
                    return input;
                    function.run(); // Run the function
                }
            } else {
                return 0;
            }
        }
    }

    // Roll
    public static int roll(int dices, int faces, int modifier) {
        List<Integer> rolls = new ArrayList<>();

        for (int i = 0; i < dices; i++) {
            int roll = random.nextInt(1, faces + 1);
            rolls.add(roll);
        }
        int maxRoll = Collections.max(rolls);
        int modifiedMaxRoll = maxRoll + modifier;

        if (showRolls)
            Auxiliary.say(maxRoll + " <- " + rolls + " + " + modifier);
        return modifiedMaxRoll;
    }

    public static int rollMin2Max(int min, int max, int modifier) {
        int roll = random.nextInt(min, max + 1);
        int modifiedRoll = roll + modifier;

        if (showRolls)
            Auxiliary.say(modifiedRoll + " (" + roll + " + " + modifier + ")" + " <- " + min + " - " + max);
        return modifiedRoll;
    }

    // Debug
    public static void debug(String text) {
        if (debugMode == true)
            System.out.println(text);
    }
}
