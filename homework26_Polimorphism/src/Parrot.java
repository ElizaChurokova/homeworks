public class Parrot implements Flyable {
    @Override
    public void fly(){
        System.out.println("Parrot flies in close distance in a low level");
    }

    public void talk(){
        System.out.println("Parrot repeats the heard sounds");
    }
}
