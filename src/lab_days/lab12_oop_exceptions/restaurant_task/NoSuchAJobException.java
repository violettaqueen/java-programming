package lab_days.lab12_oop_exceptions.restaurant_task;

public class NoSuchAJobException extends RuntimeException{

    public NoSuchAJobException(String exceptionMsg){
        super(exceptionMsg);  //displays the specified message as an exception message
        //  System.out.println(exceptionMsg);
    }

    /*
    public static void main(String[] args) {
       // throw new RuntimeException("Something went wrong!");
      //  throw new NoSuchJobException("Invalid Job");
    }
     */
    }





/*
 Create a subclass of RuntimeException named NoSuchAJobException

			add a constructor with string argument that can display the specified string as an exception
			 message
 */