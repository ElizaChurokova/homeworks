package location;

public class Village extends AbstractLocality{
    public Village() {
    }

    public Village(String name, String status, String administrator, int population) {
        super(name, status, administrator, population);
    }
    Village belovodskoe = new Village("Belovodskoe", "village", "Mr administrator of Belovodskoe", 210000);
    Village kokJar = new Village("Kok-Jar", "village", "Mr administrator of Kok-Jar", 200);

    @Override
    public void findAdministrator(){
        System.out.println("The administrator of Bishkek: " + getAdministrator());
    }
}
