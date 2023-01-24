package Project1;

public class Task10 {
    public static void main(String[] args) {
        // 10.Write a java program to find the second largest number in the array?

        int[]nums={25,18,8,14,16};

        int largest=0;
        int secondL=0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondL = largest;
                largest = nums[i];
            } else if (nums[i] > secondL) {
                secondL= nums [i];
            }
        }
        System.out.println("The second largest number is "+secondL);

    }
}
