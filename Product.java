package Semana3;

public class Product {
    private int idProduct;
    private String description;
    private int quantity;
    private double weight;
    private double price;
    
    public Product(int idProduct, String description, int quantity, double weight, double price) {
        this.idProduct = idProduct;
        this.description = description;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }
    
    public double getProdPrice() {
        return price;
    }

    public double setProdPrice() {
        return price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        double resultado;
        resultado = (getProdPrice()*getQuantity());
        return resultado;
    }

    public boolean inStock() {

        if (getQuantity()>0){
            return true;
        } else {return false;}
    }

    public String toString() {
        return "Datos del producto: "+"\nid del producto"+idProduct+" \ndescripcion: "+description+"\nCantidad: "+quantity+"\nPeso del producto: "+weight;
    }
}
