import java.util.Scanner;

public class PrimeNumberMethod {
    public boolean isPrime(int x) {
    	// For loop to check prime number if x have a remainder of i which equals 0 or not. Return false or true
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    	// Print the value of n according to user input and wheter that input is a prime or composite number.
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        PrimeNumberMethod numberMethod = new PrimeNumberMethod();
        n = scanner.nextInt();
        if (numberMethod.isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is a composite number.");
        }
    }
}