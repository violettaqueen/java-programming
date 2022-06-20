package lab_Days.lab08_SplitterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // intro:

        System.out.println("Welcome to Budget Planner!"); // greetings message

        // ask how many users included in budget group:

        // can you add  these people:

        System.out.println("How many people will split the budget?");


        // create users:
        ArrayList<User> userList = prepareUserLists(scanner);

        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count: " + userList.size());

        // create selections, split, options, use if statements
        // 0 : make expenses
        // 1: List specific person expense
        // 2: List all expenses
        // 3. Make split
        // 4. List all users
        // 5: Close the budget

        // create 1 Array and keep option in Array elements

        // String[] optionList = {"Make Expense", "List Specific Person Expense", "list All Expences", "Make Split",
        //"list All Users", "Close The Budget"};
        String[] optionList = prepareOptionList();

        while (true) {

            System.out.println("What would you like to do? ");

            for (int i = 0; i < optionList.length; i++) { // arrays method size
                System.out.println(optionList[i] + ":" + (i + 1)); //1 represent the expense for user istead index number 0

            }
            int request = scanner.nextInt();

            switch (request - 1) { // for Java keep these numbers, but for user can show start from 1
                case 0:
                    // ask expense name, amount, expense user
                    // create an expense object
                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense amount: ");
                    expense.amount = scanner.nextInt();

                    System.out.println("Which user made this expense? Just type user ID: ");
                    // I want ot print user from system, show all users
                    for (User user : userList) { // show all users: id: 0 name Ozzy, providing a list of names to select
                        System.out.println("id: " + userList.indexOf(user) + "name: " + user.name);
                    }

                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;//0zzy or index0

                    //
                    expenseList.add(expense); //have to save this info in the ArrayList

                    break;
                case 1:
                    // 1: List specific person expense
                    System.out.println("Please provide user name that you would like to search");
                    String username = scanner.next(); // any name but we will compare this name

                    User myUser = null;

                    for (User chosenUser : userList) { //retrieve objects from userList one by one

                        if (chosenUser.name.equals(username)) {
                            myUser = chosenUser;
                            break;
                        }

                    }
                    if (myUser == null) {
                        System.out.println("User not exists!");
                        break;
                    }
                    // list specific person expense
                    //0 - expense amount : 100, expense by : Ozzy
                    //1 - expense amount : 100, expense by : Ozzy
                    //ozzy spent $200
                    int userExpenseAmount = 0;
                    int expenseCount = 0;

                    for (int i = 0; i < expenseList.size(); i++) { //check each expense, that what loop does

                        if (expenseList.get(i).user.equals(username)) {

                            userExpenseAmount += expenseList.get(i).amount;//i is for ozzy
                            expenseCount++;

                            System.out.println(i + " - expense amount: " + expenseList.get(i).amount + ", expense by: "
                                    + expenseList.get(i).user);


                        }
                    }
                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);


                    break;
                case 2:

                    for (int i = 0; i < expenseList.size(); i++) {
                        System.out.println(i + " - expense amount: " + expenseList.get(i).amount + ", expense by: "
                                + expenseList.get(i).user); //expense object
                    }
                    break;
                case 3:
                    double totalAmount = 0;

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for (Split split : splitList) {
                        totalAmount += split.amount;
                    }
                    makeSplit(totalAmount, splitList);


                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount /splitList.size();

        // total 300
        //each person 100

        for (Split split : splitList) {
            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " needs to give back " + (-1 *(split.amount - amount)));
            }
        }
    }


    public static ArrayList<User> prepareUserLists(Scanner scanner) {

        ArrayList<User> userList = new ArrayList<>(); // to collect users
        int userCount = scanner.nextInt();


        for (int i = 0; i < userCount; i++) { //in a loop I ask about how many users, iterate userCount, i = 0, initial value to i
// condition, if loop start or not
            // how to make a program create users without hard coding?
            // String userName1 = " ozzy"; no need to hardcode this
            // how to save this user info: create a user custom class(blueprint), and create instance objects
            // create class, create object
            User user = new User(); // create an object, as many objects as defines in loop, we put new object inside the loop to create many objects otherwise

            System.out.println("Name: ");  //need to save user object in one variable: array, arrayList
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user); // trying to save object
        }
        return userList;

    }

    public static String[] prepareOptionList() {

        String[] optionList = {"Make Expense", "List Specific Person Expense", "list All Expenses", "Make Split",
                "list All Users", "Close The Budget"};
        return optionList;
    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList();

        for (Expense expense : expenseList) {

            // 2 questions come to mind:
            Split split = existSplitList(expense.user,splitList);

            if(split != null){
                split.amount += expense.amount;
            }else{
                Split willBeAdded = new Split();
                willBeAdded.userName = expense.user;
                willBeAdded.amount = expense.amount;
                splitList.add(willBeAdded);
            }


        }
return splitList;
    }

    public static Split existSplitList(String username, ArrayList<Split> splitList){

        for(Split split: splitList){
            if(split.userName.equals(username)){
                return split;
            }

        }
        return null;//
    }
}
