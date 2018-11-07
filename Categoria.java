public class Categoria {
  
    String nombCategoria;
    int valorHora;

    public Categoria(String nombCategoria, int valorHora) {
        this.nombCategoria = nombCategoria;
        this.valorHora = valorHora;
    }

    public String getNombCategoria() {
        return nombCategoria;
    }

    public void setNombCategoria(String nombCategoria) {
        this.nombCategoria = nombCategoria;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    
}