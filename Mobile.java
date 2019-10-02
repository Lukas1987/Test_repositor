package sk.itsovy.family.lukas;

public class Mobile {
    private String brand;
    private String model;
    private String phoneNumber;

    public Mobile() { // Bezparametricky konstruktor

    }

    public Mobile ( String brand, String model, String phoneNumber) {
        this.brand=brand;
        this.model=model;
        this.phoneNumber=phoneNumber;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
