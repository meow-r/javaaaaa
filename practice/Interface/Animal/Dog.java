package Animal;

public class Dog extends Animal{
    public Dog (){}

    @Override
    public void makeSound(){
        Bark();
    }

    private void Bark(){
        System.out.println("汪汪汪");
    }
}
