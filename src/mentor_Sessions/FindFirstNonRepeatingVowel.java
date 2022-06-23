package mentor_Sessions;

public class FindFirstNonRepeatingVowel {

    public static void main(String[] args) {
        String name = "adelina"; // 2

        FindFirstNonRepeatingVowel obj = new FindFirstNonRepeatingVowel();

        System.out.println("obj.findfirstvowel(name) = " + obj.findFirstVowel(name));
    }
    public  int findFirstVowel(String word) {

//adelina //2
//        kadifa  a2  i1  --> 3
//       Check each chars one by one if it is vowel
        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'u' || currentChar == 'o') {

                // check others from beginning if there is same
                int counter = 0;

                for (int j = 0; j < word.length(); j++) {
                    //       If there is same vowel count them
                    if (currentChar == word.charAt(j)) {
                        counter++;
                    }
                }
//                Count==1 return its index

                if (counter == 1) {
                    return i;
                }
            }
        }


//


        return -1;
    }


}

