public class CafeJava {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = " , your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mocahPrice = 3.5;
        double lattePrice = 4.20;
        double dripCoffeePrice = 2.99;
        double cappuccinoPrice = 4.89;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        
        System.out.println(generalGreeting + customer1);

        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }else{System.out.println(customer4 + pendingMessage);}

        System.out.println( customer2 + "," + displayTotalMessage + (lattePrice*2) );
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }else{System.out.println(customer2 + pendingMessage);}
        
        isReadyOrder2 = !isReadyOrder2;

        System.out.println(customer3 + ", your new total is $" + (lattePrice - dripCoffeePrice));

        
    }
}