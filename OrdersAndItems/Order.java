import java.util.ArrayList;

public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<String> items = new ArrayList<String>();

    public Order addToOrder(Item item){
        this.items.add(item.name);
        this.total += item.price;
        System.out.printf(this.name + "'s order: " + this.items + " | Total = " + "$%.2f%n", this.total);
        return this;
    }

    public void changeStatus(){
        this.ready = !this.ready;
        if(this.ready){
            System.out.println(this.name + ", your order is ready!");
        } else{System.out.println(this.name + "We're still working on your order!");}
    }
}