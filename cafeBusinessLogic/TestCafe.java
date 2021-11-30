import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args) {
        
    CafeUtil appTest = new CafeUtil();
    	
        /* ============ App Test Cases ============= */
        int numWeeks = 10;
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week %1$d: %2$s \n\n", numWeeks, appTest.getStreakGoal(numWeeks));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        menu.addAll(loadMenu);
        price.add(1.99);   
        price.add(2.99);   
        price.add(3.99);   
        price.add(4.99);

        appTest.displayMenu(menu);
        appTest.displayMenu(menu, price);
    


        System.out.println("\n----- Print Price Chart Test-----");
            appTest.printPriceCharc("grapes", 2.22, 5);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
            appTest.addCustomer(customers);
            System.out.println("\n");
        
    }
}
