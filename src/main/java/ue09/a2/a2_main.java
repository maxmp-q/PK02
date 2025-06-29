package ue09.a2;

import java.util.ArrayList;

public class a2_main {
    ArrayList<Food> pantry = new ArrayList<>();

    public void clean(){
        pantry.removeIf(Food::isFoul);
    }

    public void addFood(Food f){
        if(!f.isFoul()){
            pantry.add(f);
        }
    }

    public void display(){
        pantry.forEach(food-> System.out.println(food.getType()));
    }

    public static void main(String[] args) {
        a2_main main = new a2_main();

        main.addFood(new Food("Banane", false));
        main.addFood(new Food("Joghurt", true));
        main.pantry.add(new Food("Chips", true));
        main.display();
        main.clean();
        System.out.println("Nach dem Reinigen:");
        main.display();
    }

}
