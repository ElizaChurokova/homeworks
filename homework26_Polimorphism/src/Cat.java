public class Cat implements Runnable {

    @Override
    public void run(){
        System.out.println("Can runs fast");
    }
    public void isAfraid(){
        System.out.println("Cat is afraid of water");
    }
}
