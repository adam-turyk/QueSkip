package QueSkip;
import java.util.ArrayList;

public class Business {

    //Variables
    private String businessName;
    private String businessAddress;
     private ArrayList<MenuItem> menu;

    //Constructors
    public Business(String businessName, String businessAddress) {

        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.menu = new ArrayList<>();
    }

    //Getters
    public String getBusinessName(){
        return businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public ArrayList<MenuItem> getMenu() {
        return  new ArrayList<>(menu);
    }

    //Setters
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }


//Methods
    public void addMenuItem(MenuItem item){
        menu.add(item);
    }

    public void removeMenuItem(MenuItem item){
        menu.remove(item);
    }

    public void updateMenuItem(MenuItem item, double price){
        item.setPrice(price);
    }

    public void changeAvailability(MenuItem item, boolean available){
        item.setAvailable(available);
    }



    public void printMenu() {

        for(MenuItem item : menu) {
            System.out.println( item.getName() + " £" + item.getPrice());
        }
    }
}
