package seccion10;

public class Burbuja {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 4, 3};
        boolean swapped;
        int sizeNums = nums.length;

        for(int n: nums){
            System.out.print(n + " ");
        }

        for (int i = 0; i < sizeNums-1; i++) {
            swapped = false;
            for (int j = 0; j < sizeNums - 1 -i; j++) {

                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
        System.out.println();
        for(int n: nums){
            System.out.print(n + " ");
        }
    }
}