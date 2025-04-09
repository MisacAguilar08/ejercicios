package seccion10;

public class MoverValorOrdenada {
    public static void main(String[] args) {
        int[] nums = {15,17,19,23,25,27,0};
        
        int numeroInsertar = 18;
//        boolean isChange = false;
//        for (int i = nums.length-2; i >=0; i--) {
//            if(numeroInsertar > nums[i]){
//                nums[i+1] = numeroInsertar;
//                isChange = true;
//                break;
//            }else{
//                nums[i+1] = nums[i];
//            }
//
//        }
//
//        if(!isChange){
//            nums[0] = numeroInsertar;
//        }


        int posicion = 0;
        while(posicion < 6 && numeroInsertar > nums[posicion]){
            posicion++;
        }

        for (int i = nums.length-2; i >= posicion; i--) {
            nums[i+1] = nums[i];
        }
        nums[posicion] = numeroInsertar;
        
        for(int num: nums){
            System.out.println("num = " + num);
        }
    }
}
