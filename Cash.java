package Semana3;

public class Cash extends Payment {
    private double cashAmount;
    private double deduction;

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }


    public double getDeduction() {
        return deduction;
    }


    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public float calculateTotalAmount(){
        System.out.println("estoy pagando en efectivo.");
        return 0;
    }

    public String toString(){
        return "Efectivo disponible: s/."+ cashAmount + "\ndeduccion: s/."+ deduction;
    }
}
