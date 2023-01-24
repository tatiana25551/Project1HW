package Project1;

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 integers numbers");

        int[] numbers=new int[5];
        int sum=0;
        numbers[0]=18;
        numbers[1]=14;
        numbers[2]=8;
        numbers[3]=25;
        numbers[4]=91;

        System.out.println(Arrays.toString(numbers));

        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
