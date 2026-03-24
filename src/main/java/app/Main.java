package app;

public class Main {
    public static void main(String[] args) {
        Assignment1 task = new Assignment1();

        System.out.println(" Task1");
        task.printDigits(5481);

        System.out.println("\nTask2 ");
        int[] arr2 = {3, 2, 4, 1};
        System.out.println(task.calculateSum(arr2, 4) / 4);

        System.out.println("\nTask3");
        System.out.println("7 is: " + (task.isPrime(7, 2) ? "Prime" : "Composite"));
        System.out.println("10 is: " + (task.isPrime(10, 2) ? "Prime" : "Composite"));

        System.out.println("\nTask4");
        System.out.println(task.factorial(5));

        System.out.println("\nTask5");
        System.out.println("F5: " + task.fibonacci(5));
        System.out.println("F17: " + task.fibonacci(17));

        System.out.println("\nTask6");
        System.out.println(task.power(2, 10));

        System.out.println("\nTask7");
        int[] arr7 = {1, 4, 6, 2};
        task.reversePrint(arr7, 4);
        System.out.println();

        System.out.println("\n Task8");
        System.out.println("123456: " + (task.isNumeric("123456") ? "Yes" : "No"));
        System.out.println("123a12: " + (task.isNumeric("123a12") ? "Yes" : "No"));

        System.out.println("\nTask9");
        System.out.println("hello: " + task.countChars("hello"));
        System.out.println("recursion: " + task.countChars("recursion"));

        System.out.println("\nTask10");
        System.out.println("GCD(32, 48): " + task.gcd(32, 48));
        System.out.println("GCD(10, 7): " + task.gcd(10, 7));
    }
}
