public class Person implements Runnable {
    @Override
    public void run(){
        System.out.println("Person runs 20 km an hour");
    }

    public void make(){
        System.out.println("Person constructs airplanes and ships");
    }
}
