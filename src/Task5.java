package Project1;

public class Task5 {
    public static void main(String[] args) {
        //5.Create a 2D array of integers. Develop a program which will calculate
        // the sum of  even and odd numbers for that array.

        int [][] numbers={{13,24,18},
                          { 25,8,14}};

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0)
                    sumEven += numbers[i][j];
                else if (numbers[i][j] % 2 != 0)
                    sumOdd += numbers[i][j];

            }
        }
        System.out.println("The sum of the even numbers is " + sumEven);
        System.out.println("The sum of the odd numbers is " + sumOdd);
    }
}
