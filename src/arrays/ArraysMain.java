package arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        System.out.println(nums[0]);
        
        String[] names = {"Juan","Pedro","Maria"};
        System.out.println("names[2] = " + names[2]);

        int[] ages = {25, 30, 35, 40, 45};
        for (int age : ages) {
            System.out.println("edad = " + age);
        }


    }
}
