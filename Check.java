package Semana3;

public class Check extends Payment {
    private String name;
    private String bankId;
    private boolean authorized;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBankId() {
        return bankId;
    }
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
    public boolean isAuthorized() {
        return authorized;
    }
    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    public float calculateTotalAmount(){

        System.out.println("Estoy pagando con cheque.");
        return 0;
    }
    
    public String toString() {
        String resultado;
        if(authorized==false){
            resultado = "No autorizado";
        } else {resultado = "autorizado";}

        return "Datos del cheque: "+"\nombre: "+name+" \nbanco: "+bankId+"\nauthorizado: "+resultado;
    }
}
