package Semana3;

import java.util.List;

public class Customer {
    private String DNI;
    private String name;
    private String surname;
    private String address;
    private int age;
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String dNI, String name, String surname) {
        DNI = dNI;
        this.name = name;
        this.surname = surname;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrderlist() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String toString() {
        return "Informacion del cliente: "+ "\nDNI" + DNI + "\nNombres: " + name + "\nApellidos" + surname + "\nDireccion: " + address + "\nEdad: " + age + "\nPedidos: "+ orders;
    }

    public Order getOrder(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        System.out.println("No se encontró ninguna orden de un producto.");
        return null;
    }
}
