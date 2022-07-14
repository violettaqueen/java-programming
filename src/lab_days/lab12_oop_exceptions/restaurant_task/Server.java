package lab_days.lab12_oop_exceptions.restaurant_task;

public class Server extends Employee{

    public Server(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, "Server", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is serving the customers");
    }
    public void takeOrder(){
        System.out.println(getName() + " is taking the order");
    }
    public void cleanTable(){
        System.out.println(getName() + " is cleaning the table");
    }
    /*
    Create a subclass of employee named Server

			extra methods:
				takeOrder()
				cleanTable()

     */
}
