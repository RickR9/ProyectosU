package S2.AC3;

public abstract class Correo {

    private int peso;
    private boolean esExpress;
    private String direccion;
    private boolean esNoValido;
    private Anuncio anuncio;
    private Carta carta;
    private Paquete paquete;
    
    public Correo(int peso, boolean esExpress, String direccion) {
        this.peso = peso;
        this.esExpress = esExpress;
        this.direccion = direccion;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
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

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public Carta getCarta() {
        return carta;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public abstract double calculateImporteTotal();
    public abstract void verDetalle();
}