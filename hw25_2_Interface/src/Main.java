public class Main {

    public static void main(String[] args) {
	Monkey monkey = new Monkey();
	monkey.carryOnBack();
	monkey.climb();
	monkey.eatFruits();

        System.out.println("******************");
	Climbable littleMonkey = new LittleMonkey();
	littleMonkey.climb();

        System.out.println("**************");

	CarryableOnBack monkey1 = new Monkey();
	ActingAsMonkey actingAsMonkey = new Monkey();
    monkey.setClimbable(littleMonkey);
    monkey.print();






    }
}
