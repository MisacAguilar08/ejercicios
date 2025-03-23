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
}
