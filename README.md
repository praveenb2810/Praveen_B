Java Programs Repository Project Title

Java Basic Programs – A collection of simple Java programs demonstrating arithmetic operations, series generation, and array processing.

Description This repository contains Java programs: Object-Oriented Programming (OOP) principles Loops and conditional statements Working with arrays and collections (Map) Exception handling and input validation Each program includes comments and examples so anyone can understand the flow of logic, even without prior experience.

Features Perform arithmetic operations using a Calculator class Generate first x odd numbers Generate odd numbers up to a given number Count how many numbers in an array are divisible by 1–9 Beginner-friendly, commented code Error handling for invalid operations (like division by zero)

Installation / Setup Instructions

Install Java JDK Download JDK: https://www.oracle.com/java/technologies/javase-jdk17-downloads.html Install following your OS instructions (Windows/macOS/Linux) Verify installation: java -version javac -version

Install an IDE (Optional) Eclipse: https://www.eclipse.org/downloads/ IntelliJ IDEA Community Edition: https://www.jetbrains.com/idea/download/ VS Code with Java Extension Pack: https://code.visualstudio.com/

Download the Repository Using Git: git clone https://github.com/your-username/repo-name.git Or Download ZIP from GitHub and extract it.

Programs Included

Calculator Program (Program_1.java) Description: Performs basic arithmetic operations (addition, subtraction, multiplication, division) on two numbers using a Calculator class. Supports both word-based (add) and symbol-based (+) input.
Features: Encapsulation with private variables (a, b, operation) Constructor to initialize numbers and operation calculate() method with switch-case to perform the chosen operation Handles division by zero and invalid operations with exceptions

How it Works: The user inputs two numbers (a and b) and an operation. The program creates a Calculator object. The calculate() method performs the operation using a switch statement. The result is displayed, or an error is shown if the input is invalid.

Example Run: Enter first number (a): 10 Enter second number (b): 5 Enter operation (+, -, *, /): * Result: 50.0

First X Odd Numbers (Program_2.java) Description: Generates and prints the first x odd numbers, separated by commas.
Features: Loops from 1 to x Calculates odd numbers using the formula 2*i - 1 Handles comma placement to avoid trailing commas

How it Works: User enters the number x. Loop from 1 to x. For each i, calculate the odd number using 2*i - 1. Print the number with commas between numbers.

Example Run: Enter a number (x): 5 1, 3, 5, 7, 9

Odd Numbers up to a Given Number (Program_3.java) Description: Prints all odd numbers up to a given number a. If a is even, the program reduces it by 1 to ensure the largest number printed is odd.
Features: Conditional check to adjust even input Uses formula 2*i - 1 to generate odd numbers Proper comma-separated output

How it Works: User inputs a number a. Check if a is even. If yes, reduce a by 1. Loop from 1 to a (adjusted). Calculate odd numbers and print them in sequence.

Example Run: Enter a number (a): 8 1, 3, 5, 7

Count Multiples in Array (Program_4.java) Description: Counts how many numbers in a predefined array are divisible by numbers 1 through 9 and stores the results in a map.
Features: Loops through divisors 1–9 Uses modulus operator % to check divisibility Stores counts in a HashMap Displays results in {divisor=count} format

How it Works: Define an array of numbers. Loop through each divisor from 1 to 9. For each number in the array, check if it is divisible by the current divisor. Store the count in a Map and print the results.

Example Run: {1=11, 2=8, 3=4, 4=4, 5=3, 6=3, 7=0, 8=2, 9=2}

Usage Compile a Program javac Program_1.java Run a Program java Program_1

Repeat for other programs by replacing Program_1 with Program_2, Program_3, or Program_4.
