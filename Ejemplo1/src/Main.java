import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static Cliente[] arreglodeClientes = new Cliente[10];
    public static Pizza[] arreglodePizzas = new Pizza[30];
    public static Bebida[] arreglodeBebidas = new Bebida[50];
    public static void main(String[] args) {
        // 1 practica consola utilizando matriz y arreglos
        // 1 proyecto matrices, arreglos POO

        // EJEMPLO 1
        // OBJETO
        //     ATRIBUTOS (caracteristicas)
        //     METODOS   (acciones)

        //clientes
        Cliente cliente1 = new Cliente("juan",17,"juanito@gmail.com", 200);
        Cliente cliente2 = new Cliente("pedro",20, "pedrito@gmail.com", 100);
        Cliente cliente3 = new Cliente("david", 23,"david123@gmail.com", 400);
        //agregando los clientes al arreglo
        agregarCliente(cliente1);
        agregarCliente(cliente2);
        //cliente1.comprarPizza("grande");


        //pizzas
        //Scanner sc = new Scanner(System.in);
        //String tamaño = sc.nextLine();
        //Scanner sc2 = new Scanner(System.in);
        //int precio = sc2.nextInt();
        //String especialidad = sc.nextLine();

        Pizza pizza1 = new Pizza("grande","peperoni","no",100);
        Pizza pizza2 = new Pizza("pequeña", "piña", "piña", 40);
        Pizza pizza3 = new Pizza("mediana", "jamon", "piña", 80);

        for (int i = 0; i <10 ; i++) {
            arreglodePizzas[i] = pizza1;
        }
        for (int i = 10; i <20 ; i++) {
            arreglodePizzas[i] = pizza2;
        }
        for (int i = 20; i <30 ; i++) {
            arreglodePizzas[i] = pizza3;
        }



        //BEBIDAS
        Bebida bebida1 = new Bebida("cocacola","mediana","cocacola",10);
        Bebida bebida2 = new Bebida("piña","mediana","cocacola",10);
        Bebida bebida3 = new Bebida("naranja","mediana","mirinda",10);
        for (int i = 0; i <10 ; i++) {
            agregarBebidas(bebida1);
            agregarBebidas(bebida2);
            agregarBebidas(bebida3);
        }







        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(cliente1.getNombre());
        System.out.println(cliente2.getNombre());

        cliente1.setNombre("daniel");
        System.out.println(cliente1.getNombre());




        arreglodeClientes[0] = cliente1;

    }



    public static void agregarCliente(Cliente cliente){
        for (int i = 0; i < arreglodeClientes.length ; i++) {
            if(arreglodeClientes[i]==null){
                arreglodeClientes[i] = cliente;
            }
        }
    }
    public static void agregarBebidas(Bebida bebida){
        for (int i = 0; i < arreglodeBebidas.length ; i++) {
            if(arreglodeBebidas[i]==null){
                arreglodeBebidas[i] = bebida;
            }
        }
    }




}