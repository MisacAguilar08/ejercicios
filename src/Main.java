
public class Main {
    public static void main(String[] args) {
        Funciones func = new Funciones();
        System.out.println(func.isPar(8));
        System.out.println(func.isPositivo(0));
        func.diaSemana(2);
        func.isVocal('o');
        func.sumaPares(10);
        func.impNumInvertidos(100,40);
        func.tablaMultiplicar();
        func.triangulo(2);
        func.trianguloSpace(2);
        func.rectangulo(5,9);
        func.doWhilenumeroMayor();
        func.doWhileImparPar();
        func.whileSuma(5);
        System.out.println(func.whileFactorial(6));
        func.whileFactoerialScenner();

    }
}