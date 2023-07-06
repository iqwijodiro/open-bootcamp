public class Main {
    public static void main(String[] args) {
        int numeroIf = -3;
        if ( numeroIf > 0 ) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero es cero: " + numeroIf);
        }
        // Ciclo/bucle While
        int numeroWhile = 2;
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El numero es: " + numeroWhile);
        }

        // Ciclo o Bucle do While
        int numeroDoWhile = 3;
        do {
            numeroWhile++;
            System.out.println("El numero es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //Ciclo For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
            System.out.println("Numero For: " + numeroFor);
        }

        // Switch
        String estacion = "Verano";
        switch (estacion) {
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Primavera":
                System.out.println("La estación es primavera");
                break;
            case "Otoño":
                System.out.println("La estación es otoño");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            default:
                System.out.println("Entonces estamos en el invierno de Juego de Tronos");
        }
    }
}
