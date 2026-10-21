public class EjerciciosIf {

    public static void main(String[] args) {
        System.out.println(evaluaMultiplo(27));
        System.out.println(evaluaMultiplo(25));

        System.out.println(evaluaMultiplo(42));
        System.out.println(evaluaMultiplo(23));
    }

    public static boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esSumaMayorQueCantidad(int numero1, int numero2, int numero3, int aMedir) {
        int suma = numero1 + numero2 + numero3;
        if (suma > aMedir) {
            return true;
        } else {
            return false;
        }
    }

    // Crear una funcion que diga si un numero positivo o negativo
    public static boolean numeroEsPositivoNegativo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // crear una funcion que diga si un numero es par o impar
    // Los numeros pares son los que se pueden dividir entre 2 sin que sobre nada
    // siempre terminan en 0, 2, 4, 6 u 8.
    // Los numeros impares son los que al dividirlos entre 2 sobra 1. Siempre
    // terminan en 1, 3, 5, 7 u 9
    public static boolean numeroEsParImpar(int elemento) {

        if (elemento % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }

    // crear una funcion que reciba 2 numeros X e Y y diga si X es mayor o menor que
    // Y
    public static boolean numerosXY(int x, int y) {// calcularMayorDeXY
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }

    // crear una function que reciba 2 numeros y calcules si el producto es mayor
    // que otro numero K
    public static boolean productoNumeros(int numeroProducto1, int numeroProducto2, int numeroK) {
        int producto = numeroProducto1 * numeroProducto2;
        if (producto > numeroK) {
            return true;
        } else {
            return false;
        }
    }

    // crear una funcion que diga si 2 numeros son iguales
    public static boolean numerosIgualesNoIguales(int primerNumero, int segundoNumero) {
        if (primerNumero == segundoNumero) {
            return true;
        } else {
            return false;
        }
    }

    // crear una funcion que diga si un numero tiene tiene 3 digitos como maximo
    public static boolean maximoTresDigitos(int numero) {
        if (numero <= 999) {
            return true;
        } else {
            return false;
        }
    }

    // crear una funcion que diga si un numero es multiplo de 3 o multiplo de 5 o
    // multiplo de 7
    public static String evaluaMultiplo(int numero) {
        if (numero % 3 == 0) {
            return "Es multiplo de 3";
        } else if (numero % 5 == 0) {
            return "Es multiplo de 5";
        } else if (numero % 7 == 0) {
            return "Es multiplo de 7";
        } else {
            return "El numero no es valido";
        }
    }


    

}