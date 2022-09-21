public class Bebida {
    private String sabor;
    private String tamaño;
    private String marca;
    private int precio;

    //constructor
    public Bebida(String sabor, String tamaño, String marca, int precio){
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.marca = marca;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
