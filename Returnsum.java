 import java.util.Scanner;

public class Returnsum{
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int result = sum(firstNumber, secondNumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + result);
        scanner.close();
    }
}
 
