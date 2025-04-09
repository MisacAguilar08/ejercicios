package seccion10;

public class EliminarElementoOrdenar {
    public static void main(String[] args) {
        int[] nums = {15,17,19,23,25,27,30};
        
        int numeroEliminar = 19;

        int i = 0;
        for (; i <nums.length && nums[i] != numeroEliminar; i++) {}

        for (int j = i; j < nums.length-1; j++) {
            nums[i] = nums[j+1];
        }

        int[] b = new int[nums.length-1];
        System.arraycopy(nums, 0, b,0, b.length);

        nums =b;
        for(int num: nums){
            System.out.println("num = " + num);
        }
    }
}
