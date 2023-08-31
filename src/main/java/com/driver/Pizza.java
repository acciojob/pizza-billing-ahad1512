package com.driver;

public class Pizza {

    private int price = 0;
    private Boolean isVeg,cheese = false,toppings = false,bag=false,billg=false;
    private String bill;
    private int  extraCheese = 80, extraToppings,paperBag=20,basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            basePrice = 300;
            extraToppings =70;
        }
        else{
            basePrice = 400;
            extraToppings = 120;
        }
        this.price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheese) {
            this.price += extraCheese;
            cheese = true;
        }
    }

    public void addExtraToppings(){
        if(!toppings) {
            this.price += extraToppings;
            toppings = true;
        }
    }

    public void addTakeaway(){
        if(!bag) {
            this.price += paperBag;
            bag=true;
        }
    }

    public String getBill(){
        if(!billg){
            this.bill = "Base Price Of The Pizza: "+this.basePrice+"\n";
            if(cheese){
                this.bill = this.bill + "Extra Cheese Added: "+this.extraCheese+"\n";
            }
            if(toppings){
                this.bill = this.bill + "Extra Toppings Added: "+this.extraToppings+"\n";
            }
            if(bag){
                this.bill= bill + "Paperbag Added: "+this.paperBag+"\n";
            }
            this.bill = this.bill + "Total Price: " + this.price+"\n";
            billg = true;
        }
        return this.bill;
    }
}