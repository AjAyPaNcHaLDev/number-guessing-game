import java.util.Scanner;

class Main {
    static final String WELCOME_MESSAGE = "Welcome to the Number Guessing Game! \nI'm thinking of a number between 0 and 100. \nYou have limited chances to guess the correct number. \nPlease select the difficulty level:\n1. Easy (10 chances) \n2. Medium (5 chances) \n3. Hard (3 chances)";
    static final int EASY_CHANCES = 10;
    static final int MEDIUM_CHANCES = 5;
    static final int HARD_CHANCES = 3;

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get difficulty level
        int level = getInput(scanner, "Enter a level (1, 2, or 3): ");
        int chances = getChancesByLevel(level);

        // If invalid level, exit the program
        if (chances == -1) {
            System.out.println("Invalid level! Please restart the game and choose 1, 2, or 3.");
            scanner.close();
            return;
        }

        // Generate a random number
        int systemGuessedNumber = generateRandomNumber(0, 100);

        // Play the guessing game
        boolean guessedCorrectly = playGuessingGame(scanner, systemGuessedNumber, chances);

        // Display result
        if (!guessedCorrectly) {
            System.out.println("Sorry! You've used all your chances. The correct number was " + systemGuessedNumber + ".");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Prompts the user for input and ensures it is an integer.
     */
    private static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Determines the number of chances based on the difficulty level.
     */
    private static int getChancesByLevel(int level) {
        switch (level) {
            case 1:
                System.out.println("Great! You have selected the Easy difficulty level.");
                return EASY_CHANCES;
            case 2:
                System.out.println("Great! You have selected the Medium difficulty level.");
                return MEDIUM_CHANCES;
            case 3:
                System.out.println("Great! You have selected the Hard difficulty level.");
                return HARD_CHANCES;
            default:
                return -1; // Invalid level
        }
    }

    /**
     * Generates a random number between the given bounds (inclusive).
     */
    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     * Handles the guessing game logic.
     */
    private static boolean playGuessingGame(Scanner scanner, int systemGuessedNumber, int chances) {
        for (int i = 1; i <= chances; i++) {
            int userGuess = getInput(scanner, "Attempt " + i + "/" + chances + " - Enter your guess: ");
            if (userGuess == systemGuessedNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                return true;
            } else if (userGuess < systemGuessedNumber) {
                System.out.println("Incorrect! The number is greater than " + userGuess);
            } else {
                System.out.println("Incorrect! The number is less than " + userGuess);
            }
        }
        return false; // Player failed to guess correctly
    }
}
