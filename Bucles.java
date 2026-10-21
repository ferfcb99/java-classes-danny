public class Bucles {

    public static void main(String[] args) {
        System.out.println(sumaGaussiana());
    }

    public static void imprimirNumeros1A5() {
        for (int i = 1; i <= 5; i++) { // 1
            System.out.println(i); //
        }
    }

    public static void imprimirNumeros1A5Parametrizado(int numero) {
        for (int i = 1; i <= numero; i++) { // 1, 2, 3, 4, 5, 6
            System.out.println(i); // 1 2 3 4 5
        }
    }

    public static int sumaGaussiana() {
        int suma = 0;
        for (int i = 1; i <= 5; i += 1) {
            suma = suma + i; // 0 + 1 = 0
                             // 1 + 2 = 3
                             // 3 + 3 = 6
                             // 6 + 4 = 10
                             // 10 + 5 = 15
        }
        return suma;
    }
}