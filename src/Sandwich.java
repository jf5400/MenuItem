public class Sandwich implements MenuItem {
    private String name;
    private double price;
    public Sandwich(double price, String name){
        this.price=price;
        this.name=name;
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
}
