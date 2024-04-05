package Semana3;

import java.util.List;

public class OrderDetails {
    private int id;
    private String taxStatus;
    private List<Product> products;
    private double IGV = 0.18;

    public OrderDetails(int id, String taxStatus, List<Product> products) {
        this.id = id;
        this.taxStatus = taxStatus;
        this.products = products;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double iGV) {
        IGV = iGV;
    }

    public double calcSubTotal() {
        double subtotal = 0.0;
        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity();
        }
        return subtotal;
    }
    
    public double CalcWeight(){
        double pesoTotal= 0.0;
        for (Product product : products) {
            pesoTotal= (product.getWeight()* product.getQuantity());
        }
        return pesoTotal;
    }

    public String getTaxStatus() {
        String resultado = "No aprobado";
        for (Product product : products) {
            if (taxStatus == "aprobado" || taxStatus == "Aprobado") { 
                resultado = "Aprobado";
                break;
            }
        }
        return resultado;
    }
    
}
