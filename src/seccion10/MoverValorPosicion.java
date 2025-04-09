package seccion10;

public class MoverValorPosicion {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int numeroInsertar = 100;
        int posicion = 5;

        for (int i = nums.length-2; i >= posicion; i--) {
            nums[i+1] = nums[i];
        }
        nums[posicion] = numeroInsertar;
        
        for(int num: nums){
            System.out.println("num = " + num);
        }
    }
}
