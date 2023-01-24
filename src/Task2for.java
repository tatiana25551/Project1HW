package Project1;
import java.util.Arrays;
import java.util.Scanner;
public class Task2for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 countries");
        //  String[] countries=new String[5];
        // String[] capitals=new  String[5];

        String[] countries = {"Italy", "Ukraine", "Canada", "France", "India"};
        String[] capitals = {"Rome", "Kiev", "Ottawa", "Paris", "New Delphi"};

        for (int i = 0; i < countries.length; i++) {
            countries[i] = scan.nextLine();

            System.out.println(Arrays.toString(capitals));


        }
    }
}
