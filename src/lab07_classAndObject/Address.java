package lab07_classAndObject;

public class Address {

    public String buildingNumber, street, city, state, zipCode;

    public void setInfo(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return buildingNumber + " "+ street + "\n" + city + ", " + state + " " + zipCode;
    }
}
