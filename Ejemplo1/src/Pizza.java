public class Pizza {
    private String tamaño;
    private String especialidad;
    private String ingredienteExtra;
    private int precio;

    //constructor
    public Pizza (String tamaño, String especialidad, String ingredienteExtra, int precio){
        this.tamaño = tamaño;
        this.especialidad = especialidad;
        this.ingredienteExtra = ingredienteExtra;
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getIngredienteExtra() {
        return ingredienteExtra;
    }

    public void setIngredienteExtra(String ingredienteExtra) {
        this.ingredienteExtra = ingredienteExtra;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
