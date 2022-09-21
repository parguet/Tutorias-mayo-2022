public class Cliente {
    //ATRIBUTOS (caracteristicas)
    private String nombre;
    private int edad;
    private String correo;
    private int dinero;

    //CONSTRUCTOR
    //metodo principal de la clase que nos ayuda a crear un nuevo objeto
    public Cliente(String nombre, int edad, String correo, int dinero){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.dinero = dinero;
    }

    //METODOS Y FUNCIONES (acciones)
    public void presentarse (){
        System.out.println("HOLA MI NOMBRE ES "+ this.nombre);
    }

    public void despedirse(){
        System.out.println("ADIOS");
    }

    //GETTERS AND SETTERS
    //OBTENER Y ENVIAR


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public void comprarPizza(String tamaño){
        for (int i = 0; i <Main.arreglodePizzas.length; i++) {
            if(Main.arreglodePizzas[i].getTamaño().equals(tamaño)){
                Pizza PizzaVendida =  Main.arreglodePizzas[i];
                Main.arreglodePizzas[i]=null;
            }
        }
    }
}
