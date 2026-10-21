public class BucleWhile {
    public static void main(String[] args) {
        sumarNumeros1AN(5);
    }

    public static void sumarNumeros1AN(int numero) { // 5
        int suma = 0;
        int i = 1;
        while (i <= numero) {
            suma = suma + i; 
            i += 1;
        }
        System.out.println(suma);
    }
}