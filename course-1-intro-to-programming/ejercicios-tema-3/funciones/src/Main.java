public class Main {
    public static void main(String[] args) {
        int value1 = 20;
        int value2 = 10;
        int value3 = 50;

        // Primera Parte
        var sumatoria = suma(5,6,2);
        System.out.println("El resultado de la suma es: " + sumatoria);

        // Segunda Parte
        Coche miCoche = new Coche();
        miCoche.ponerPuertas();
        System.out.println("Mi coche ahora tiene: " + miCoche.puertas + " puertas.");

    }

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 3;

    public void ponerPuertas () {
        this.puertas++;
    }
}