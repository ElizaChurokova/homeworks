public class Duck implements Flyable, Swimmable {

    @Override
    public void fly(){
        System.out.println("Duck flies out to warm place");
    }

    @Override
    public void swim(){
        System.out.println("Duck swims in close distance");
    }

    public void makeSound(){
        System.out.println("Duck says quack");
    }
    public void bite(){
        System.out.println("Duck bites");
    }
}
