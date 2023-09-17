package Tinkoff_Digital_Interview;


import java.util.Scanner;

public class Main {

    // String to help avoid numbers in the code
    // The length of the string is equal to the string name
    private static String zero = "";
    private static String two = "  ";
    private static String seven = "       ";
    private static String nine = "         ";
    private static String twelvePlusThree = "               ";
    private static String seventy = "          " +
                                    "          " +
                                    "          " +
                                    "          " +
                                    "          " +
                                    "          " +
                                    "          ";

    public static void main(String[] args) {

        // Duck is required for the challenge
        // 🦆

        Scanner scanner = new Scanner(System.in);

        //Enter a number
        String line = scanner.nextLine();

        int number = Integer.parseInt(line); // Преобразование строки в объект Integer

        // Decompose the number
        Decompose(number);
    }

    private static void display(int counter, int splitter) {

        // Checking how much has printed F
        String output = counter >= splitter  ? "Exit": "Continue";

        // Exit from recursion
        switch (output){
            case "Exit":
                return;
        }

        // print F using unicode 70
        int unicode = seventy.length();
        char letter = (char) unicode;

        System.out.print(letter + " ");

        counter++;
        display(counter, splitter);
    }

    private static void Decompose(int number) {

        int copyNumber;
        int divisionResult;
        int residue;

        copyNumber = number;
        divisionResult = copyNumber / twelvePlusThree.length();
        residue = copyNumber % twelvePlusThree.length();

        // These two lines add a seven and a two to the output and add negative numbers
        System.out.print(seven.length() + " " + two.length() + " ");
        System.out.print(-two.length() + " " + -seven.length() + " ");

        String output = (residue < twelvePlusThree.length() && residue > nine.length()) ? "exception": "noException";

        switch (output) {
            case "exception":
                residue = residue % nine.length();
                System.out.print(residue + " " + nine.length() + " ");
                break;
            case "noException":
                System.out.print(residue + " ");
        }

        int counter = zero.length();

        display(counter, divisionResult);
    }
}
