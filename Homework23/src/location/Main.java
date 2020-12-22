package location;

public class Main {

    public static void main(String[] args) {

        AbstractLocality city = new City();
         city.findAdministrator();


        AbstractLocality village = new Village();
        village.findAdministrator();
    }
}
