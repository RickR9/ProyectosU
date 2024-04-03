package S2.AC3;

public abstract class Correo {

    private int peso;
    private boolean esExpress;
    private String direccion;
    private boolean esNoValido;
    
    public Correo(int peso, boolean esExpress, String direccion, boolean esNoValido) {
        this.peso = peso;
        this.esExpress = esExpress;
        this.direccion = direccion;
        this.esNoValido = esNoValido;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEsExpress(boolean esExpress) {
        this.esExpress = esExpress;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isEsExpress() {
        return esExpress;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isEsNoValido() {
        return esNoValido;
    }

    public abstract double calculateImporteTotal();
    public abstract void verDetalle();
}