package app;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Assignment1 task = new Assignment1();
        System.out.print("Enter a number for task 1 ");
        int num = sc.nextInt();
        task.printDigits(num);
    }
}
