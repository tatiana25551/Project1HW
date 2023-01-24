package Project1;

public class Task6 {
    public static void main(String[] args) {
        //6. Write a program to swap 2 numbers without a temporary variable?
         int number1=15;
         int number2=30;

        System.out.println("The value of number1 is " +number1);
        System.out.println("The value of number2 is " +number2);

        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("After swap the value of number1 is " +number1);
        System.out.println("After swap the value of number2 is " +number2);




    }
}
