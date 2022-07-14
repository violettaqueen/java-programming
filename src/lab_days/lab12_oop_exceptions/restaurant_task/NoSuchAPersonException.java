package lab_days.lab12_oop_exceptions.restaurant_task;

public class NoSuchAPersonException extends RuntimeException{

public NoSuchAPersonException(String message){
    super(message);
}
}
/*
Create a sub class of RuntimeException named NoSuchAPersonException

			add a constructor with string argument that can display the specified string as an exception message
 */