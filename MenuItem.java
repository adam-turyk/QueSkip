package QueSkip;

public class MenuItem {
//Variables
   private String name;
   private String description;
   private double price;
   private boolean available;

//Constructors
    public MenuItem(String name, String description, double price, boolean available) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }

//Setters
   public void setName(String name) {
        this.name = name;
   }

   public void setDescription(String description) {
        this.description = description;
   }

   public void setPrice(double price) {
        this.price = price;
   }

   public void setAvailable( boolean available) {
        this.available = available;
   }
}

