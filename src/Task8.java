package Project1;

public class Task8 {
    public static void main(String[] args) {
        // 8.)Write a Java Program to print the first 10 numbers of Fibonacci series
        int num1=0;
        int num2=1;
        int counter=0;
        int N=10;

        while(counter<N){
            System.out.println(num1 + " ");

            int num3=num2+num1;
            num1=num2;
            num2=num3;
            counter=counter+1;

        }




    }
}
