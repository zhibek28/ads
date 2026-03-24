package app;

public class Assignment1 {
    public void printDigits(int n) {
        if(n==0){
            return;
        }
        printDigits(n/10);
        System.out.println(n % 10);
    }



}
