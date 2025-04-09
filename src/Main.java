import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funciones func = new Funciones();
//        System.out.println(func.isPar(8));
//        System.out.println(func.isPositivo(0));
//        func.diaSemana(2);
//        func.isVocal('o');
//        func.sumaPares(10);
//        func.impNumInvertidos(100,40);
//        func.tablaMultiplicar();
//        func.triangulo(2);
//        func.trianguloSpace(2);
//        func.rectangulo(5,9);
//        func.doWhilenumeroMayor();
//        func.doWhileImparPar();
//        func.whileSuma(5);
//        System.out.println(func.whileFactorial(6));
//        func.whileFactoerialScenner();
//        func.verificarMayor(15,56);
//        func.validarEdadPrestamo(18, 1000);
//        func.isGoodClimax(155, 25);
//        func.ATM();

        List<Integer> list = Arrays.asList(14,2,5,6,4,8,0,9);
        List<String> listString = Arrays.asList("14","2","5","6","4","8","0","9");
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        for (int num : list) {
            System.out.println("num = " + num);
        }
        list.stream().sorted().forEach(System.out::println);
        listString.stream().mapToInt(Integer::parseInt).sorted().forEach(System.out::println);
    }
}