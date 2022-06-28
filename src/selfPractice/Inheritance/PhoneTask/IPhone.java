package selfPractice.Inheritance.PhoneTask;

public class IPhone extends Phones{

    // how to call the constructor of a parent class use a super keyword
    public IPhone(String model, String size, double price, String color){
        super("Apple", model, size, price, color);

    }

    public static boolean hasApplePay;

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);

    }
    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);
    }
    public void call(long phoneNumber){

    }
    static{
        hasApplePay = true;
    }
}
/*
1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement
 */