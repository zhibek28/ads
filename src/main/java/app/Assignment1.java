package app;

public class Assignment1 {

    //Task1
    public void printDigits(int n) {
        if (n == 0) return; //base case
        printDigits(n / 10); //recursive call
        System.out.println(n % 10);
    }

    //Task2
    public double calculateSum(int[] arr, int n) {
        if (n <= 0) return 0; //base case
        return arr[n - 1] + calculateSum(arr, n - 1); //recursive call
    }

    // Task3
    public boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2); //base case
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1); //recursive call
    }

    //Task4
    public int factorial(int n) {
        if (n <= 1) return 1; //base case
        return n * factorial(n - 1); //recursive call
    }

    // Task5
    public int fibonacci(int n) {
        if (n <= 1) return n; //base case
        return fibonacci(n - 1) + fibonacci(n - 2); //recursive call
    }

    //Task6
    public int power(int a, int n) {
        if (n == 0) return 1; //base case
        return a * power(a, n - 1); //recursive call
    }

    //Task7
    public void reversePrint(int[] arr, int n) {
        if (n <= 0) return; //base case
        System.out.print(arr[n - 1] + " ");
        reversePrint(arr, n - 1); //recursive call
    }

    //Task8
    public boolean isNumeric(String s) {
        if (s.length() == 0) return true; // Base case
        if (!Character.isDigit(s.charAt(0))) return false; // Base case
        return isNumeric(s.substring(1)); // Recursive call
    }

    //Task9
    public int countChars(String s) {
        if (s.equals("")) return 0; // Base case
        return 1 + countChars(s.substring(1)); // Recursive call
    }

    //Task10
    public int gcd(int a, int b) {
        if (b == 0) return a; //bse case
        return gcd(b, a % b); //recursive call
    }
}