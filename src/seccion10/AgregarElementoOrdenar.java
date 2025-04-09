package seccion10;

public class AgregarElementoOrdenar {
    public static void main(String[] args) {
        int[] nums = {15,17,19,23,25,27,30};
        
        int numeroInsertar = 21;

        int posicion = 0;
        while(posicion < 6 && numeroInsertar > nums[posicion]){
            posicion++;
        }

        int ultimo = nums[nums.length-1];

        int[] b = new int[nums.length+1];
        System.arraycopy(nums, 0, b,0, nums.length);
        nums =b;
        int next = nums[posicion];
        nums[posicion] = numeroInsertar;

        for (int i = posicion+1; i < nums.length-1; i++) {
            int temp = nums[i];
            nums[i] = next;
            next = temp;
        }

        nums[nums.length-1] = ultimo;

        for(int num: nums){
            System.out.println("num = " + num);
        }
    }
}
