public class Ship implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Ship swims by shipman's control");
    }

    public void sink(){
        System.out.println("Ship sinks if smth goes wrong");
    }
}
