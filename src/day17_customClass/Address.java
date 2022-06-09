package day17_customClass;

public class Address {

    public String buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    public void setInfo(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber +" "+ street + "\n" + city + " " + state +", " + zipCode;

    }
}
