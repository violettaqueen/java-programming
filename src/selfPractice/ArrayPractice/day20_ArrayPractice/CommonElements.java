package selfPractice.ArrayPractice.day20_ArrayPractice;

public class CommonElements {

    public static void main(String[] args) {

        int []  arr1 = {1,2,3,4,5};
        int []  arr2 = {4,5,6,7,8};

        String common1 = "";
        String common2 = "";

        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if(each1 == each2){
                    common1 += each1 + " ";

                }
            }
            }
        System.out.println(common1);
        }


    }

/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */