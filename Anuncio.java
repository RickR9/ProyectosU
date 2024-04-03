package S2.AC3;

public class Anuncio extends Correo{

    private double precioVenta;

    public Anuncio(int peso, boolean esExpress, String direccion, boolean esNoValido, double precioVenta) {
        super(peso, esExpress, direccion, esNoValido);
        this.precioVenta = precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public double calculateImporteTotal() {
        double respuesta = 0;
        respuesta += getPrecioVenta();
        return respuesta;
    }

    @Override
    public void verDetalle() {
        System.out.println("\nDetalle de anuncio:");
        System.out.println("Peso: " + getPeso());
        System.out.println("Es Express: " + isEsExpress());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Validez: " + isEsNoValido());
        System.out.println("Dirección: " + getPrecioVenta());
    }
}
