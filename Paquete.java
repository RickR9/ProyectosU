package S2.AC3;

public class Paquete extends Correo{

    private double precioVenta;
    private double volumen;


    public Paquete(int peso, boolean esExpress, String direccion, boolean esNoValido, double precioVenta, double volumen) {
        super(peso, esExpress, direccion, esNoValido);
        this.precioVenta = precioVenta;
        this.volumen = volumen;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public double calculateImporteTotal() {
        double venta = 0;
        venta += (getPrecioVenta()*getVolumen());
        return venta;
    }

    @Override
    public void verDetalle() {
        System.out.println("\nDetalle de paquete:");
        System.out.println("Peso: " + getPeso());
        System.out.println("Es Express: " + isEsExpress());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Validez: " + isEsNoValido());
        System.out.println("Precio: " + getPrecioVenta());
        System.out.println("Volumen: " + getVolumen() + " cm^3");
        }

    }
