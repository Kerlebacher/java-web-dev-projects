package org.launchcode;

public class Restaurant {

    public static void main(String[] args) {
        // Create 5 items
        MenuItem item1 = new MenuItem("Sirloin", "10 oz bone-in steak", 16.99,"main course");
        MenuItem item2 = new MenuItem("Steak and Chicken", "6 oz Ribeye and monterey chicken breast", 14.99,"main course");
        MenuItem item3 = new MenuItem("Steak and Shrimp", "6 oz Ribeye and four fried shrimp", 14.99,"main course");
        MenuItem item4 = new MenuItem("Dinner Salad", "Garden salad including mixed lettuce, carrot and tomato", 3.30,"appetizer");
        MenuItem item5 = new MenuItem("Cheese Cake", "Cheese Cake plain or w/ Cherries", 4.50,"dessert");

        // print first item
        System.out.println(item1.isNew());
        //create menu

        //add items to menu and print it

        //remove an item and print menu

        //test equals method

        //attempt to add a duplicate iem and print menu
    }
}
