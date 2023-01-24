package Project1;

public class Task11 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String[] cities = {"Paris", "London", "Miami", "NYC", "Paris", "Miami"};

        for (int i = 0; i < cities.length; i++) {

            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].equals(cities[j])) {
                    System.out.println(cities[i]);
                }
            }


        }
    }
}
