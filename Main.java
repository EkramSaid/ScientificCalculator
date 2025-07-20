import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    // --- Constants (if needed) ---
    static final double PI = Math.PI;
    static final double E = Math.E;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Scientific Calculator!");

        // Main calculator loop
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1: performAddition(scanner); break;
                    case 2: performSubtraction(scanner); break;
                    case 3: performMultiplication(scanner); break;
                    case 4: performDivision(scanner); break;
                    case 5: performPower(scanner); break;
                    case 6: performSquareRoot(scanner); break;
                    case 7: performSine(scanner); break;
                    case 8: performCosine(scanner); break;
                    case 9: performTangent(scanner); break;
                    case 10: performLog(scanner); break;
                    case 11:
                        System.out.println("Thank you for using the calculator!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    // --- Menu Display ---
    public static void displayMenu() {
        System.out.println("\n----- Menu -----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power (x^y)");
        System.out.println("6. Square Root");
        System.out.println("7. Sine (degrees)");
        System.out.println("8. Cosine (degrees)");
        System.out.println("9. Tangent (degrees)");
        System.out.println("10. Logarithm (base 10)");
        System.out.println("11. Exit");
    }

    // --- Arithmetic Methods ---
    public static double add(double num1, double num2) { return num1 + num2; }
    public static double subtract(double num1, double num2) { return num1 - num2; }
    public static double multiply(double num1, double num2) { return num1 * num2; }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    // --- Scientific Methods ---
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot take square root of negative number.");
        }
        return Math.sqrt(number);
    }

    public static double sine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double cosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double tangent(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }

    public static double log10(double number) {
        if (number <= 0) {
            throw new ArithmeticException("Logarithm undefined for zero or negative number.");
        }
        return Math.log10(number);
    }

    // --- Helper Methods for Input & Output ---
    private static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter two numbers: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Result = " + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
            scanner.nextLine();
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter two numbers: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Result = " + subtract(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter two numbers: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Result = " + multiply(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter two numbers: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Result = " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter base and exponent: ");
            double base = scanner.nextDouble();
            double exp = scanner.nextDouble();
            System.out.println("Result = " + power(base, exp));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            System.out.println("Result = " + squareRoot(num));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result = " + sine(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result = " + cosine(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result = " + tangent(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static void performLog(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            System.out.println("Result = " + log10(num));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }
}


