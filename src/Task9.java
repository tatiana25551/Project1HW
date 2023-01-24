package Project1;

public class Task9 {
    public static void main(String[] args) {
   // 9.Maximum and minimum number in the array?

        int[] nums={22,8,77,96,4};
        int maximum=nums[0];
        int minimum=nums[0];

        for (int i=0;i<nums.length;i++){

            if(nums[i]>maximum){
                maximum=nums[i];
            }
            if(nums[i]<maximum){
                minimum=nums[i];
            }
        }
        System.out.println("The maximum number from array is " + maximum);
        System.out.println("The minimum number from array is " +minimum);




    }
}
