public class Ejercicios{
    public static void main(String[] args) throws Exception {

        
    }
    
    
    // para el calculo del area de un rectangulo la formula A=b×h
   
    public static int multiplicarDosNumeros(int base, int altura){
        return base * altura;
    }
    
    //Para el calculo de la suma de 3 numeros y sacar el promedio es la siguiente a + b + c / 3
    public static double sumarTresNumeros(double num1, double num2, double num3){
        
        return (num1 + num2 + num3) / 3;
    
    }
    
    // 2000 * 10 = 200 -> 1800 
    // 2000, 0.10 -> 1800
    public static double precioFinal(double precioSinDescuento, double porcentajeDescuento){
        
        //      2000                  200
        return precioSinDescuento - (precioSinDescuento * porcentajeDescuento);
               
    }

    // crear una funcion que reciba una cadena de texto que represente un nombre, y las iniciales de dicho nombre
    // se debera retornar la cadena nombre : iniciales todo en mayusculas
    // presentarInformacionPersonal("fernando munguia", "FM") = FERNANDO MUNGUIA : FM
    //                                                  fer                 f
    public static String presentarInformacionPersonal(String nombre, String iniciales){
                            //  fer       :       f
        String cadenaFinal = nombre + " : " + iniciales;
        cadenaFinal = cadenaFinal.toUpperCase();
        
        return cadenaFinal;
    }
    
    public static int sumaNUnidadesANumero(int numero, int cantidadASumar){// 8,4 -> 12
        int resultado = numero + cantidadASumar;
        return resultado;
    }
}