import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 0; i < numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        int sum = 0;
        for(int i = 0; i < lineItems.length; i++){
            sum += lineItems[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu){
        for(int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }
    }

    public ArrayList<String> addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + " there are " + customers.size() + " customers in front of you.");
        customers.add(userName);
        System.out.println(customers);
        return customers;
    }

}

