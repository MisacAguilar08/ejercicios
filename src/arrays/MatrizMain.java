package arrays;

public class MatrizMain {
    public static void main(String[] args) {
        String[][] tabla = new String[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String result = String.valueOf((i+1) * (j+1));
                tabla[i][j] = result.length() == 1 ? "0"+result:result;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

    }
}
