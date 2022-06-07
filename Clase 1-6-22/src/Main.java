import java.util.Scanner;

public class Main {
    public static String PalabraTerminada = "";
    public static String fin = "";
    public static void main(String[] args) {

        System.out.println("Ingrese una oracion en ingles: ");
        Scanner sc = new Scanner(System.in);
        //hello
        String texto = sc.nextLine();
        
        // h, e, l , l, o
        char[] caracteres = texto.toCharArray();
        // vamos a usar este arreglo para pasar los caracteres a un arreglo de string
        String[] textoArreglo = new String[caracteres.length];
        for (int i = 0; i <caracteres.length ; i++) {
            textoArreglo[i] = String.valueOf(caracteres[i]);
        }


        //hacemos un arreglo de vocales
        String[] vocales = {"a","e","i","o","u"};

        //verificamos si la primer letra del texto es igual a alguna vocal del arreglo de vocales
        boolean verificacion = false;
        for (int i = 0; i <vocales.length ; i++) {
            if( textoArreglo[0].equals(vocales[i]) ){
                verificacion = true;
            }
        }




        // h, e, l , l, o
        // recorrer al revez o, l, l , e, h
        //ellohay
        //ohay
        String[] palabraCambiada = new String[textoArreglo.length+2];
        int posicion = 0;
        String palabra ="";
        if(verificacion == false){
            PalabraTerminada += textoArreglo[0];
            textoArreglo[0] = "";
            System.out.println("la primer letra es consonante");



            for (int i = textoArreglo.length-1; i >=0 ; i--) {
                for (int j = 0; j <vocales.length ; j++) {
                    if( textoArreglo[i].equals(vocales[j]) ){

                        palabra = vocales[j]+textoArreglo[0]+"ay";
                        textoArreglo[0] = "";
                        posicion = i;
                        break;
                    }
                }
                break;
            }
            String textoTerminado = "";
        for (int i=0; i<posicion ; i++) {
            textoTerminado += textoArreglo[i];
        }
        textoTerminado+=palabra;

            System.out.println(textoTerminado);

        }else{
            System.out.println("la primer letra es vocal");
        }



        //hola
        //olahay

        //hello
        //ellohay

        //yard
        //ardyay
        //ardyay

    }

    //METODOS O FUNCIONES
    public static boolean verificarsiesVocal(String[] arreglo1, String[] vocales){

        for (int i = 0; i <vocales.length ; i++) {
            if( arreglo1[0].equals(vocales[i]) ){
                return true;
            }
        }

        return false;
    }

}