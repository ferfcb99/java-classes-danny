public class EjerciciosTarea {
    public static void main(String[] args) {
        System.out.println(contarNumerosImpares());
    }

    public static void imprimirNumeros1A10() {
        for (int i = 1; i <= 10; i += 1) { // i, j, k
            System.out.println(i);
        }
    }

    public static void numerosParesVersion1() {
        for (int i = 1; i <= 100000; i += 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void numerosParesVersion2() {
        for (int i = 2; i <= 100000; i += 2) {
            System.out.println(i);
        }
    }

    public static void validarNumeroParImpar() {
        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.println("es Par: " + numero);

            } else {
                System.out.println("es Impar: " + numero);
            }
        }
    }

    public static void tablaDeMultiplicar(int inicio, int numero, int limite) {
        for (int i = inicio; i <= limite; i += 1) {
            System.out.println(numero + " x " + i + " = " + (numero * i)); // 5 x 1 = 5
        }
    }

    public static int contarNumerosImpares() {
        int cuenta = 0;
        for (int i = 1; i <= 50; i++) { // 1 2 3 4 5
            if (i % 2 != 0) { // 1%2 != 0, 2%2 != 0, 3%2!=0 4%2 != 0, 5%2!=0
                cuenta = cuenta + 1; // 1 2 3
            }
        }
        return cuenta;
    }



}
