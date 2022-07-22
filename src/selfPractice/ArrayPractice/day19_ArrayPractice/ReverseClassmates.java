package selfPractice.ArrayPractice.day19_ArrayPractice;

public class ReverseClassmates {

    public static void main(String[] args) {

        String[] classmates = {"Jon Queen", "Elizabeth Queen", "Emily Brown", "Inna Trey", "Yelena Brown",
                "Marina Velitskaya", "Inna Kruger", "Keith Brown", "Lizzy Queen", "Sofia Badurashvili"};



        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0 ; j--) {
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);



        }

    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */