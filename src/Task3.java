package Project1;
 import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //3. Create a 2D array of integer values.Print the sum of all numbers

        int[][] numbers = {
                {25, 18, 14,},
                {8, 29, 30},
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}