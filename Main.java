package QueSkip;

public class Main {
    public static void main(String[] args) {

        //Menu Items
        MenuItem chickenBurger = new MenuItem(
                "Chicken Burger",
                "Our delicious crispy chicken burger with house sauce, topped with a fresh slice of lettuice.",
                6.99,
                true
        );

        MenuItem chickenBurgerMeal = new MenuItem(
                "Chicken Burger Meal",
                "Our delicious crispy chicken burger with house sauce, topped with a fresh slice of lettuice. Comes with fries and a drink.",
                9.99,
                true
        );

        MenuItem fries = new MenuItem(
                "Fries",
                "Crispy fires served with a sauce of your choice.",
                2.99,
                true
        );

        MenuItem milkshake= new MenuItem(
                "Milkshake",
                "Delicious thick milkshake.",
                4.49,
                true
        );

        //Businesses
        Business adamsKitchen = new Business(
                "Adam's Chicken",
                "Highcross Shopping Centre, Leicester"
        );


// adds the menu items to the restaurants array list
        adamsKitchen.addMenuItem(milkshake);
        adamsKitchen.updateMenuItem(fries,3.49);
        adamsKitchen.changeAvailability(chickenBurgerMeal,false);
        adamsKitchen.removeMenuItem(fries);



        System.out.println("Adam's Kitchen");
        System.out.println("---------------");

        for (MenuItem item: adamsKitchen.getMenu()) {
            System.out.println(item.getName());
            System.out.println("£" + item.getPrice());
            System.out.println("---------------");
        }



        }
    }

