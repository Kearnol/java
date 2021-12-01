import java.util.ArrayList;
public class TestOrders{
    public static void main(String[] args){
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item1.price = 3.99;

        item2.name = "latte";
        item2.price = 3.60;

        item3.name = "drip coffee";
        item3.price = 2.60;

        item4.name = "capuccino";
        item4.price = 4.15;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        



        // Application Simulations
        System.out.println("Order 1: \n" + order1);
        order2.addToOrder(item1).addToOrder(item2);
        order3.addToOrder(item4);
        order4.addToOrder(item2);
        order1.changeStatus();
        order4.addToOrder(item2).addToOrder(item2);
        order2.changeStatus();
    }
}

