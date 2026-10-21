public class CuadradosInvertidos {
    public static void main(String[] args) {
        mostrarNumerosQueCumplenRegla(10, 1000);
    }

    public static int elevarCuadrado(int numero) {
        return numero * numero;
    }

    public static int invertirNumero(int numero) { // 4784
        int numeroInvertido = 0; // 0
        while (numero > 0) { // 4784>0, 478>0, 47, 4>0, 0>0
            numeroInvertido = numeroInvertido * 10 + (numero % 10);
            // 0*10 + 4 = 4
            // 4*10 + 8 = 48
            // 48*10 + 7 = 487
            // 487*10 + 4 = 4874
            numero = numero / 10; // 478, 47, 4, 0
        }
        return numeroInvertido;
    }

    public static boolean cumpleRegla(int numero) { // 12
        int cuadrado = elevarCuadrado(numero); // 144
        int numeroInvertido = invertirNumero(numero); // 21
        int cuadradoNumeroInvertido = elevarCuadrado(numeroInvertido); // 441

        if(cuadrado == invertirNumero(cuadradoNumeroInvertido)){
                return true;
        }        
        return false;

    }

    public static void muestraNumero(int numero) {
        if (cumpleRegla(numero) == true) {
            System.out.println(numero + "^2 = " + elevarCuadrado(numero) + " y " + invertirNumero(numero) + "^2 = "
                    + elevarCuadrado(invertirNumero(numero)));
        }
    }

    public static void mostrarNumerosQueCumplenRegla(int inicio, int limite) {
        for (int i = inicio; i <= limite; i++) {
            muestraNumero(i);
        }
    }

}
// Variables
// metodos, funciones
// bucles
// condicionales