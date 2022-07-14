package mentor_Sessions.HousePackage;

import java.text.DecimalFormat;

public abstract class House {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House(String name) {
        this.name = name;
    }

    public abstract double areaOfHouse();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getClass().getSimpleName()+ "{" +
                " name='" + name + '\'' +
                " area='" + areaOfHouse() + '\'' +
                '}';
    }
}
