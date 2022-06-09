package day06_ifstatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println(5 + 2 * 3);
        // * executed first, + is second

        System.out.println(7 + 3 - 2 / 2);
//: / is first             7 + 3 - ( 1 )

        System.out.println(-5 + 3);
        // - operator has a higher order
        System.out.println(!true == false);
        // !true executed first
        System.out.println(10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
//                          true  ==  false && "Java" == "Python" || 'a' == 'A'
        //                        false     &&        False       ||    false
        //                                 false                  ||    false

        System.out.println(100 >= 20 && 40 * 2 > 60);
        //                  100 >= 20 &&  80 > 60
        //                   true && true

        int a = 20;
        a += 10 + 2 * 3;
        // a += 10 + 6
        // a += 16
//         a = 36
        System.out.println(a);

    }

}
