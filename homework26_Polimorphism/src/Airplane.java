public class Airplane implements Flyable{

    @Override
    public void fly(){
        System.out.println("Airplane flies by pilot's control");
    }

    public void transfer(){
        System.out.println("Airplane transfers people and goods");
    }
}
