import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        scanner.close();
        
        double result = 1.0 / (p * p * (1 - p));
        System.out.printf("%.4f%n", result);
    }
}