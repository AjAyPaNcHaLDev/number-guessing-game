# Number Guessing Game

Welcome to the **Number Guessing Game**! This is a simple console-based game where the computer generates a random number, and you have to guess it within a limited number of attempts based on your chosen difficulty level.

---

## Features

- **Three Difficulty Levels:**
  - Easy: 10 chances to guess the number.
  - Medium: 5 chances to guess the number.
  - Hard: 3 chances to guess the number.
- **Random Number Range:** The number is randomly generated between **0 and 100** (inclusive).
- **Input Validation:** Ensures users enter valid integers.
- **Feedback on Guesses:**
  - Tells if the guessed number is too high or too low.
  - Displays the correct answer if all attempts are exhausted.

---

## How to Play

1. Run the program in a Java-enabled environment.
2. The game will display a welcome message and ask you to select a difficulty level:
   - Enter **1** for Easy (10 attempts).
   - Enter **2** for Medium (5 attempts).
   - Enter **3** for Hard (3 attempts).
3. After selecting the difficulty level, the game will generate a random number between 0 and 100.
4. Guess the number:
   - If your guess is incorrect, the game will inform you if the number is greater or less than your guess.
   - If you guess correctly, you win!
5. If you exhaust all attempts, the correct number will be revealed.

---

## Code Overview

### Main Features:

1. **Welcome Message:**
   Displays instructions and difficulty levels.

2. **Difficulty Selection:**

   - Prompts the user to select a level.
   - Assigns the corresponding number of attempts.

3. **Random Number Generation:**

   - Uses `Math.random()` to generate a number between 0 and 100.

4. **Guessing Logic:**

   - Prompts the user to input guesses.
   - Provides feedback after each guess (higher or lower).

5. **Endgame Scenarios:**

   - Displays a success message if the user guesses correctly.
   - Reveals the correct number if all attempts are used.

---

## Prerequisites

- **Java Development Kit (JDK)** installed on your system.
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) to edit and run the code.

---

## How to Run

1. Copy the code into a file named `Main.java`.
2. Open a terminal or IDE and navigate to the directory containing the `Main.java` file.
3. Compile the code using the following command:
   ```
   javac Main.java
   ```
4. Run the compiled program:
   ```
   java Main
   ```
5. Follow the instructions displayed in the console to play the game.

---

## Example Gameplay

### Easy Level (10 chances)

```plaintext
Welcome to the Number Guessing Game!
I'm thinking of a number between 0 and 100.
You have limited chances to guess the correct number.
Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
Enter a level (1, 2, or 3): 1
Great! You have selected the Easy difficulty level.
Attempt 1/10 - Enter your guess: 50
Incorrect! The number is greater than 50.
Attempt 2/10 - Enter your guess: 75
Congratulations! You guessed the correct number in 2 attempts.
```

### Hard Level (3 chances)

```plaintext
Welcome to the Number Guessing Game!
I'm thinking of a number between 0 and 100.
You have limited chances to guess the correct number.
Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
Enter a level (1, 2, or 3): 3
Great! You have selected the Hard difficulty level.
Attempt 1/3 - Enter your guess: 25
Incorrect! The number is greater than 25.
Attempt 2/3 - Enter your guess: 50
Incorrect! The number is less than 50.
Attempt 3/3 - Enter your guess: 40
Sorry! You've used all your chances. The correct number was 45.
```

---

## Author

**Ajay**

---

## License

This project is licensed under the MIT License. Feel free to modify and share!
