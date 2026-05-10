package Animal;

public class Cow extends Animal{
    private void Moo(){
        System.out.println("Moo");
    }

    @Override
    public void makeSound(){
        this.Moo();
    }
}
