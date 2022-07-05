package day33_abstraction.ShapeTask;

public abstract class Shapes {

    private String name;

    public Shapes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        setName(name);
    }
    public abstract double area();
    public abstract double perimeter();
    public abstract void draw();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                '}';
    }
}
