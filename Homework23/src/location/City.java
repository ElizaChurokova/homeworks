package location;

public class City extends AbstractLocality {

    public City() {
    }

    public City(String name, String status, String administrator, int population) {
        super(name, status, administrator, population);

    }

    City bishkek = new City("Bishkek", "city", "Mr administrator of Bishkek", 1000000);
    City osh = new City("Osh", "city", "Mr. admiistrator of Osh", 257000);
    City djalalAbad = new City("Djalal-Abad", "city", "Mr administrator of Djalal-Abad", 114000);

    City[] cities = {bishkek, osh, djalalAbad};


    @Override
    public void findAdministrator() {
        System.out.println("The administrator of Bishkek is Mr admin of Bishkek");
        System.out.println("The administrator of Osh is Mr admin of Osh");
        System.out.println("The administrator of Djalal-Abad is Mr admin of Djalal-Abad");



    }
}
