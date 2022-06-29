package selfPractice.Inheritance.BookTask;

public class TestBookObjects {

    public static void main(String[] args) {

        EBook eBook1 = new EBook("Hello", "Drama", "Smith", 34, "large", 120);

        AudioBook audioBook1 = new AudioBook("Kiev", "History", "Shevchenko", 23, 56, "Ivanov");

        eBook1.readBook();

        System.out.println(eBook1);
        System.out.println(audioBook1);

    }
}
