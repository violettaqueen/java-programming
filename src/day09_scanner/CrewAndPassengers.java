package day09_scanner;
/*
1. Create a class named CrewAndPassangers1
        Given a number of people on the ship (int number)
        determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

        Solution1: Use ternary. Do not use more than one println()
        Solution2: Use switch statement. Do not use more than one println()
*/

public class CrewAndPassengers {

    public static void main(String[] args) {

        int people = 80; //ternary: num of ? == to : , скобки можно убрать
        String type = (people >= 50 && people < 75) ? "20 crew, 30 passengers"
                : (people < 99) ? "25 crew, 50 passengers" : (people == 100) ?
                "30 crew, 70 passengers" : "Invalid";
        System.out.println(type);

        System.out.println("--------------------------------------------");
// Switch
        String type2;
        switch (people) {
            case 50:
                System.out.println("20 crew, 30 passengers");
                break;
            case 75:
                System.out.println("25 crew, 50 passengers");
                break;
            case 100:
                System.out.println("30 crew, 70 passengers");
            default:
                System.out.println("Invalid");
        }
    }
}
