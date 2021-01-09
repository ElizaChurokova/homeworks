import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Flyable[] flyers = new Flyable[6];
		for (int i = 0; i < flyers.length; i++) {
			if (i < 2) flyers[i] = new Airplane();
			else if (i < 4) flyers[i] = new Duck();
			else flyers[i] = new Parrot();

			flyers[i].fly();
		}
		System.out.println("***************");

		Runnable[] runners = new Runnable[4];
		for (int r = 0; r < runners.length; r++) {
			if (r < 2) runners[r] = new Cat();
			else if (r < 4) runners[r] = new Person();

			runners[r].run();
		}
		System.out.println("**************");

		Swimmable[] swimmers = new Swimmable[8];
		for (int s = 0; s < swimmers.length; s++) {
			if (s < 2) swimmers[s] = new Duck();
			else if (s < 4) swimmers[s] = new Shark();
			else if (s < 6) swimmers[s] = new Ship();
			else swimmers[s] = new Whale();

			swimmers[s].swim();
		}
		System.out.println("*****************");

		for (int i = 0; i < flyers.length; i++) {
			if (flyers[i] instanceof Airplane)
				((Airplane) flyers[i]).transfer();
			else if (flyers[i] instanceof Duck)
				((Duck) flyers[i]).makeSound();
			else if (flyers[i] instanceof Parrot)
				((Parrot) flyers[i]).talk();
		}

		System.out.println("*****************");
		for (int r = 0; r < runners.length; r++) {
			if (runners[r] instanceof Cat)
				((Cat) runners[r]).isAfraid();
			else if (runners[r] instanceof Person)
				((Person) runners[r]).make();
		}

		System.out.println("******************");
		for (int s = 0; s < swimmers.length; s++) {
			if (swimmers[s] instanceof Duck)
				((Duck) swimmers[s]).bite();
			else if (swimmers[s] instanceof Shark)
				((Shark) swimmers[s]).hunt();
			else if (swimmers[s] instanceof Ship)
				((Ship) swimmers[s]).sink();
			else if (swimmers[s] instanceof Whale)
				((Whale) swimmers[s]).eat();
		}
		System.out.println("******************");
		Airplane[] airplanes = new Airplane[2];
		Cat[] cats = new Cat[2];
		Duck[] ducks = new Duck[2];
		Parrot[] parrots = new Parrot[2];
		Person[] persons = new Person[2];
		Shark[] sharks = new Shark[2];
		Ship[] ships = new Ship[2];
		Whale[] whales = new Whale[2];
		int iAirplane = 0, iCat = 0, iDuck = 0, iParrot = 0,
				iPerson = 0, iShark = 0, iShip = 0,
				iWhale = 0;
		for (Flyable flying : flyers) {
			if (flying instanceof Airplane)
				airplanes[iAirplane++] = (Airplane) flying;
			else if (flying instanceof Duck)
				ducks[iDuck++] = (Duck) flying;
			else if (flying instanceof Parrot)
				parrots[iParrot++] = (Parrot) flying;
		}
		for (Runnable running : runners) {
			if (running instanceof Cat)
				cats[iCat++] = (Cat) running;
			else if (running instanceof Person)
				persons[iPerson++] = (Person) running;
		}
		for (Swimmable swimming : swimmers) {
			if (swimming instanceof Duck)
				ducks[iDuck++] = (Duck) swimming;
			else if (swimming instanceof Shark)
				sharks[iShark++] = (Shark) swimming;
			else if (swimming instanceof Ship)
				ships[iShip++] = (Ship) swimming;
			else if (swimming instanceof Whale)
				whales[iWhale] = (Whale) swimming;

		}


	}

}
