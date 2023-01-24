package Project1;

public class Task7 {
    public static void main(String[] args) {
        //7. // Write a java program to check whether a given number is prime or not?

        int number = 14;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(" Given number is a Prime");
        } else {
            System.out.println("Given number is Not a prime number");
        }
    }
}