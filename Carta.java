package S2.AC3;

public class Carta extends Correo{

    private String formato;
    private double precioVenta;

    public Carta(int peso, boolean esExpress, String direccion, boolean esNoValido, String formato, double precioVenta) {
        super(peso, esExpress, direccion, esNoValido);
        this.formato = formato;
        this.precioVenta = precioVenta;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public double calculateImporteTotal() {
        double total = 0;
        switch (formato) {
            case "A3":
            total += (getPrecioVenta()+10);
                break;
            case "A4":
            total += (getPrecioVenta()+20);
                break;
            case "A5":
            total += (getPrecioVenta()+30);
                break;
            default:
                break;
        }
        return total;
    }

    @Override
    public void verDetalle() {
        System.out.println("\nDetalle de carta:");
        System.out.println("Peso: " + getPeso());
        System.out.println("Es Express: " + isEsExpress());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Validez: " + isEsNoValido());
        System.out.println("Dirección: " + getFormato());
        System.out.println("Dirección: " + getPrecioVenta());
    }

}
