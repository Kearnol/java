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
        boolean exit = false;
        while(exit == false){
            System.out.println("Enter customer name or press \"q\" to finalize");
            String userName = System.console().readLine();
            if(userName.equals("q")){
                exit = true;
                break;
            }
            System.out.println("Hello " + userName + " there are " + customers.size() + " customers in front of you.");
            customers.add(userName);
            System.out.println(customers);
        }
        return customers;
    }

    public void printPriceCharc(String product, double price, int maxQuantity){
        System.out.println(product);
        double priceMult = 0;
        for(int i = 1; i <= maxQuantity; i++){
            priceMult = i * price - (i * .50);
            System.out.printf(i + " -- " + "$%.2f%n", priceMult);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf(i + " " + menuItems.get(i) + " -- $%.2f%n", prices.get(i));
        }
        return true;
    }

}

