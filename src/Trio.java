public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich=sandwich;
        this.salad=salad;
        this.drink=drink;
    }
    public String getName(){
       return sandwich.getName()+"/"+salad.getName()+"/"+drink.getName()+" Trio";
    }
    public double getPrice(){
        if(sandwich.getPrice()>drink.getPrice() && salad.getPrice()>drink.getPrice()){
            return sandwich.getPrice()+salad.getPrice();
        }
        else if(sandwich.getPrice()>salad.getPrice() && drink.getPrice()>salad.getPrice()){
            return sandwich.getPrice()+drink.getPrice();
        }
        else{
            return drink.getPrice()+salad.getPrice();
        }
    }
}
