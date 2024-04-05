package Semana3;

import java.util.Date;
import java.util.List;

public class Order {

    private int id;
    private Date date;
    private String status;
    private List<OrderDetails> details;
    
    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderDetails> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetails> details) {
        this.details = details;
    }

    public double calcSubTotal() {
        double subtotal = 0.0;
        for (OrderDetails detail : details) {
            subtotal += detail.calcSubTotal();
        }
        return subtotal;
    }

    public double calcTax() {
        double impuestos = 0;
        for (OrderDetails detail : details) {
            impuestos += ((detail.calcSubTotal()*detail.getIGV())/100);
        }
        return impuestos;
    }

    public double calcTotal() {
        double total = 0;
            total += calcSubTotal() + calcTax(); 
            // En el diagrama de clase indica que el importe y el impuesto se suman, yo los iba a restar en un inicio.
            return total;
    }

    public double calcTotalWeight(){
        double peso = 0;
        for (OrderDetails detail : details) {
            peso += detail.CalcWeight() ;
        }
        return peso;
    }
}

