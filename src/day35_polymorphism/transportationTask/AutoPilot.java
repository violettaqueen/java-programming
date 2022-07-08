package day35_polymorphism.transportationTask;

public interface AutoPilot extends AutoPark{

    @Override
    default void autoPark() {

    }
}
