package com.driver;

public class Pizza {

    private int price =0;
    final private Boolean isVeg;
    private String bill;

    private Boolean cheeseAdded = false;

    private Boolean toppingsAdded = false;

    private Boolean bagAdded = false;

    private Boolean BillGenerated = false;

    private  int extraCheese=80, extraToppings, paperBag =20,basePrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(this.isVeg){
            basePrice = 300;
            extraToppings =70;
        } else {
            basePrice = 400;
            extraToppings = 120;
        }
        this.price = basePrice;
        bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
          this.price += extraCheese;
          cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
                this.price += extraToppings;
            toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            this.price += paperBag;
            bagAdded = true;
        }
    }

    public String getBill(){
      //  bill ="";
        if(!BillGenerated) {
                bill += "Base Price Of The Pizza: "+this.basePrice+"\n";
                if (cheeseAdded) {
                    bill += "Extra Cheese Added: "+this.extraCheese+"\n";
                }
                if (toppingsAdded) {
                    bill += "Extra Toppings Added: "+this.extraToppings+"\n";
                }
                if (bagAdded) {
                    bill += "Paperbag Added: "+this.paperBag+"\n";
                }
            this.bill += "Total Bill: " + this.price + "\n";
            BillGenerated = true;
        }
      return this.bill;
    }
}
