package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean cheeseAdded;

    private Boolean toppingsAdded;

    private Boolean bagAdded;

    private Boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill ="";
        if(this.isVeg==true){
            this.price += 300;
            this.bill += "Base Price Of The Pizza: 300\n";
        } else {
            this.price += 400;
            this.bill += "Base Price Of The Pizza: 400\n";
        }
        cheeseAdded = false;
        toppingsAdded = false;
        bagAdded = false;
        billGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
          this.price += 80;
          this.bill += "Extra Cheese Added: 80\n";
          cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            if(isVeg){
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
            toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            this.price += 20;
            this.bill +="Paperbag Added: 20\n";
            bagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!billGenerated){
            this.bill += "Total Bill: "+this.price+"\n";
        }
        return this.bill;
    }
}
