package day30_Inheritance.Types_of_Inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person{

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate date_Of_birth, LocalDate electedDate) {
        super(name, gender, date_Of_birth);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }
    public void lie(){
        System.out.println(getName() + " is lying");
    }
}
