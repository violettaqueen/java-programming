package lab08_SplitterApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // intro:

        System.out.println("Welcome to Budget Planner!");

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
                System.out.println(optionList[i] + ":" + (i + 1));

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
                    for (User user : userList) { // show all users: id: 0 name Ozzy
                        System.out.println("id: " + userList.indexOf(user) + "name: " + user.name);
                    }

                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;

                    //
                    expenseList.add(expense);

                    break;
                case 1:
                    // 1: List specific person expense
                    System.out.println("Please provide user name that you would like to search");
                    String username = scanner.next();

                    User myUser = null;

                    for (User chosenUser : userList) {

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

                            userExpenseAmount += expenseList.get(i).amount;
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

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);


                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }


    public static ArrayList<User> prepareUserLists(Scanner scanner) {

        ArrayList<User> userList = new ArrayList<>();
        int userCount = scanner.nextInt();


        for (int i = 0; i < userCount; i++) { //in a loop I ask about users, iterate userCount

            // how to make a program create users without hard coding?
            // String userName1 = " ozzy"; no need to hardcode this
            // how to save this user info: create a user custom class(blueprint), and create instance objects
            // create class, create object
            User user = new User(); // create an object, as many objects as defines in loop

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
