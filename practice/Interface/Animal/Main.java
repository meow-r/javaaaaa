package Animal;

import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Animal> arr = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 5; i ++){
            int index = rand.nextInt(1,4);
            arr.add(switch(index){
                    case 1 -> new Dog();
                    case 2 -> new Cat();
                    case 3 -> new Cow();
                    default -> throw new IllegalStateException("Unexpected: " + index);
                }
            );
        }

        for(int i = 0; i < 5; i ++){
            arr.get(i).makeSound();
        }
    }
}
