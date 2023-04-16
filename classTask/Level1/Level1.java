package classTask.Level1;

import java.util.Scanner;

public class Level1 {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        printHelloWorld();
        printSemicolon();
        printVentures();
        System.out.println(secondLargest(2, 4, 70, 12, 55, 90, 532, 45, 12)); // prints 90
        findOccurrences(); // 4 occurrences each
        System.out.println(sumDivisibleBy3()); // prints 165
        guessBirthDate();
        infiniteSeries();
    }

    // number 0
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    // number 1
    public static int secondLargest(int... numbers){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > highest) {
                secondHighest = highest;
                highest = number;
            }
        }
        return secondHighest;
    }

    // number 2
    public static void printSemicolon() {
        String semicolon = "SEMICOLON";
        for (int i = 0; i < semicolon.length(); i++) {
            System.out.println(semicolon.charAt(i));
        }
    }

    // number 3
    public static void printVentures() {
        String ventures = "VENTURES";
        for (int i = 0; i < ventures.length(); i++) {
            System.out.println(ventures.charAt(i) + " " + ventures.charAt(++i));
        }
    }

    // number 4
    public static void findOccurrences() {
        String word = "Mississippi";
        int countForS = 0;
        int countForI = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 's') {
                countForS++;
            } else if (word.charAt(i) == 'i') {
                countForI++;
            }
        }
        System.out.println("Number of 's': " + countForS);
        System.out.println("Number of 'i': " + countForI);

    }

    // number 5
    public static int sumDivisibleBy3() {
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) sum += i;
        }
        return sum;
    }

    // number 6
    public static void guessBirthDate() {
        int birthday = 15;
        int answer = 0;
        while (answer != birthday) {
            System.out.println("Enter a guess: ");
            answer = scanner.nextInt();
            if (answer != birthday) System.out.println("Incorrect Guess!");
        }
        System.out.println("Correct Guess!");
    }

    // number 7
    public static void infiniteSeries() {
        double pie = 4.0;
        double denominator = 3.0;
        boolean found = false;
        int terms = 1;

        while (!found) {
            if (terms % 2 == 0) {
                pie += 4.0 / denominator;
            } else {
                pie -= 4.0 / denominator;
            }
            denominator += 2.0;
            System.out.printf("%-10d%.7f%n", terms, pie);
            terms++;

            if (String.format("%.7f", pie).equals("3.14159")) {
                found = true;
            }
        }

        System.out.println("Pie: " + pie);
        System.out.println("Number of terms: " + terms);
    }

}
