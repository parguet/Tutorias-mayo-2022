package com.company;

public class Main {

    public static void main(String[] args) {
        // numeros = int
        // cadenas de texto = String
        // verdadero o falso = boolean
        // decimal = double
        // tipo de la variable - el nombre - ;
        int numero1;
        numero1 = 50;
        System.out.println(numero1);

        int numero2;
        numero2 = 86;
        System.out.println(numero2);
        // + - / *
        int multiplicacion = 50 * 49;
        int multiplicacion2 = numero1 * numero2;

        int suma = numero1 + numero2;
        String cadena1 = "hola ";
        String cadena2 = "mucha";
        String sumaCadenas = cadena1 + cadena2;
        System.out.println(sumaCadenas);

        String CadenaTexto;
        CadenaTexto = "hola mucha como estan ";
        boolean boleano = false;


        // sentencias -if-else
        if (numero1 + numero2 == 100 ){
            System.out.println("si es 100");
        } else if (numero1 + numero2 == 50){
            System.out.println("si es 50");
        }else if(numero1 + numero2 == 80){
            System.out.println("si es 80");
        }else{
            System.out.println("ninguna de las dos");
        }

        // CICLOS Y BUCLES
        // CICLO - algo que se repite cierta cantidad de veces
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);

        }
        //10    1 2 3 4 5 6 7 8 9 10
        //10    0 1 2 3 4 5 6 7 8 9


        // BUCLE - algo que se repite siempre
        int contador = 1;
        while (contador < 11){
            System.out.println("hola "+contador);
            contador++;

        }


        int contador2 = 1;
        do {
            System.out.println("adios "+contador2);
            contador2++;
        }while (contador2 < 11);


        // ciclos bucles anidados

        int contador3 = 1;
        while (contador3 < 11){
            System.out.println("hola "+contador3);
            for (int i = 0; i < 10; i++) {
                System.out.println(i+1);
            }
            contador3++;
        }


        int contar = 0;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(contar+1);
                contar++;
            }
        }


        // ARREGLOS Y VECTORES/MATRIZ -----------------------------------------

        //ARREGLO - SERIE DE ESPACIOS DE MEMORIA PARA GUARDAR VARIOS VALORES
        //[10, 3, 5, 100, 110]

        int variable;
        variable = 0;

        int[] arreglo1;
        arreglo1 = new int[5];
        //[0, 0, 0, 0, 0]
        arreglo1[0] = 10;
        arreglo1[1] = 3;
        arreglo1[2] = 5;
        arreglo1[3] = 100;
        arreglo1[4] = 110;
        System.out.println("-----ARREGLO-------");
        System.out.println(arreglo1[4]);
        for (int i = 0; i <5 ; i++) {
            arreglo1[i] = 10;
        }


        //ARREGLO MULTIDIMENSIONAL
        //   [10, 0, 0, 0, 0]
        //   [0, 0, 0, 0, 0]
        //   [0, 0, 0, 0, 0]
        //   [0, 0, 0, 0, 0]
        //   [0, 0, 0, 0, 0]
        int[][] matriz;
        matriz = new int[5][5];
        matriz[0][0] = 10;
        matriz[4][1] = 80;
        matriz[4][4] = 65;

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                matriz[i][j] = 20;
            }
        }





    }
}
