package seccion10;

public class BusquedaValor {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 4, 3, 8};
        int num = 81;
        int i = 0;
        for (; i <nums.length && nums[i] != num; i++) {}


        if(i == nums.length){
            System.out.println("Valor no encontrado");
        } else if (nums[i] == num) {
            System.out.println("Valor encontrado en la posicion = " + i);
        }
    }
}
