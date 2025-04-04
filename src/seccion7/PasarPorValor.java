package seccion7;

public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finalizamos el main con el valor de i se mantiene igual= " + i);
    }

    public static void test(int i){
        System.out.println("iniciamos test i = " + i);
        i =35;
        System.out.println("finalizamos test i = " + i);
    }
}
