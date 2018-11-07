public class Empleado {
  
    String nombre;
    String categoria;
    int cedula;
    
    public Empleado(String nombre, String categoria, int cedula) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
   
}
