package Animal;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        this.Meow();
    }

    private void Meow(){
        System.out.println("meow");
    }
}
