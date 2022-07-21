package day28_oop_Encapsulation.Encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {

        if (name == null){  // checking if null object exist
            System.err.println("Name has not been set");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false; // if any digit occur, set condition to true;
        boolean hasSpecialChar = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) {
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }

        this.name = name;
    }

// GETTER : READ ONLY

    public int getAge() {

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1); // something went wrong with code
        }
        return age;
    }

    // SETTER : WRITE ONLY

    public void setAge(int age) {

        if (age < 1 && age > 100) {
            System.err.println("Invalid age: " + age);
            System.exit(0); // program gets terminated
        }
        this.age = age;
    }
}
