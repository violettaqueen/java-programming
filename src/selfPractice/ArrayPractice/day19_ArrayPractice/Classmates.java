package selfPractice.ArrayPractice.day19_ArrayPractice;

public class Classmates {

    public static void main(String[] args) {

        String[] classmates = {"Jon Queen", "Elizabeth Queen", "Emily Brown", "Inna Trey", "Yelena Brown",
                "Marina Velitskaya", "Inna Kruger", "Keith Brown", "Lizzy Queen", "Sofia Badurashvili"};


        for (int i = 0; i < classmates.length; i++) {
            String names = classmates[i];
            names.split(" ");
            names = names.substring(0, 1) + "." + names.substring(names.indexOf(" ")+1, names.lastIndexOf(" ") + 2);

            System.out.println(names);
        }
        System.out.println();

        // Muhtar's solution:

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(  classmates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */