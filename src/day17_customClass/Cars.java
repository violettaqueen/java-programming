package day17_customClass;

public class Cars {

    public String model;
    public int year;
    public String color;
    public String transmission;
    public int millage;

    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", millage=" + millage +
                '}';
    }

    public void setInfo(String model, int year, String color, String transmission, int millage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.transmission = transmission;
        this.millage = millage;
    }
        public void driving(){
            System.out.println(model + " is driving");
        }
    }

