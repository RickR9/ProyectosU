package S2.AC3;

public class Carta extends Correo{

    private String formato;
    private double precioVenta;
    private int peso;
    private boolean esExpress;
    private String direccion;

    public Carta(int peso, boolean esExpress, String direccion) {
        super(peso, esExpress, direccion);
        this.peso = peso;
        this.esExpress = esExpress;
        this.direccion = direccion;
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

    public String getFormato() {
        return formato;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getPeso() {
        return peso;
    }

    public boolean getEsExpress() {
        return esExpress;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public double calculateImporteTotal() {
        return 0;
    }

    @Override
    public void verDetalle() {
        System.out.println("Detalle de carta:");
        System.out.println("Peso: " + getPeso());
        System.out.println("Es Express: " + isEsExpress());
        System.out.println("Dirección: " + getDireccion());
    }

}
