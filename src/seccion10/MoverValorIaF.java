package seccion10;

public class MoverValorIaF {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

//        int next = nums[0];
//        for (int i = 0; i < nums.length-1; i++) {
//            int temp  = nums[i+1];
//            nums[i+1] = next;
//            next = temp;
//        }
//
//        nums[0] = next;


        int next = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--) {
            nums[i+1] = nums[i];
        }
        nums[0] = next;


        
        for(int num: nums){
            System.out.println("num = " + num);
        }
    }
}
