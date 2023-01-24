package Project1;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //2.Using Scanner create an array of countries. When an array is created, retrieve all values
// from it and while retrieving those values print capital for each country. (use 2 different loops).

           Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 countries");

        String[] countries = new String[5];

        countries[0]= scan.nextLine();
        countries[1]= scan.nextLine();
        countries[2]= scan.nextLine();
        countries[3]= scan.nextLine();
        countries[4]= scan.nextLine();

        int i=0;
        while (i< countries.length){
            if(countries[i].equals("Italy")){
                System.out.println("The capital is Rome");
            }else if(countries[i].equals("Ukraine")){
                System.out.println("The capital is Kiev");
            }else if (countries[i].equals("Canada")){
                System.out.println("The Capital is Ottawa");
            }else if(countries[i].equals("France")){
                System.out.println("The capital is Paris");
            }else if(countries[i].equals("India")){
                System.out.println("The capital is New Delphi");
            }else {
                System.out.println("Invalid country");
            }

            i++;

        }
    }
}
