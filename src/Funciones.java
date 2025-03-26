enum dias{
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

public class Funciones {

    public String isPar(int numero){
        if(numero % 2 == 0) return "Es par";
        return "No es par";
    }

    public String isPositivo(int numuro){
        if(numuro > 0) return "Es positivo";
        if(numuro == 0) return "Es cero";
       return "Es negativo";
    }

    public void diaSemana(int number) {
        switch (number) {
            case 1:
                System.out.println(dias.LUNES);
                break;
            case 2:
                System.out.println(dias.MARTES);
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }

    public void isVocal(char letra){
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }
    }

    public void sumaPares(int limite){
        int suma = 0;
        for (int i = 0; i <= limite ; i+=2) {
            suma += i;
        }
        System.out.println(suma);
    }

    public void impNumInvertidos(int lim_sup, int lim_inferior){
        if(lim_inferior>lim_sup){
            throw new IllegalArgumentException("El límite inferior debe ser menor o igual que el límite superior");
        }

        for(int i = lim_sup; i >= lim_inferior; i--) {
            System.out.println("i = " + i);
        }
    }

    public void tablaMultiplicar(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void triangulo(int nivel){
        for (int i = 0; i <= nivel; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void trianguloSpace(int nvl){
        for (int i = 0; i <= nvl ; i++) {

            for (int j = 0; j <= nvl -i; j++) {
                System.out.print(" ");
            }
            for (int y = 1; y <=i; y++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
