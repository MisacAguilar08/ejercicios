package seccion11;

public class MatrixSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}};


        boolean isSimetric = true;

        int i,j;
        i =0;
        salir: while (i < matriz.length){
            j=0;
            while(j< matriz[i].length){
                if (matriz[i][j] != matriz[j][i]) {
                    isSimetric = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        System.out.println("isSimetric = " + isSimetric);
    }
    
}
