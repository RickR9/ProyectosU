package Semana3;

public class CreditCard {
    private String name;
    private String type;
    private String expDate;
    private boolean authorized;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public boolean isAuthorized() {
        return authorized;
    }
    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public float calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de credito");
        return 0;
    }

    public String toString() {
        String resultado;
        if(authorized==false){
            resultado = "No autorizado";
        } else {resultado = "autorizado";}

        return "Datos de la tarjeta: "+"\nombre: "+name+" \ntipo de tarjeta: "+type+"\nFecha de expiracion: "+expDate+"\nauthorizado: "+resultado;
    }

}
