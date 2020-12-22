package location;

public abstract class AbstractLocality {
    private String name;
    private String status;
    private String administrator;
    private int population;

public AbstractLocality(){}

    public AbstractLocality(String name, String status, String administrator, int population) {
        this.name = name;
        this.status = status;
        this.administrator = administrator;
        this.population = population;
    }

    public abstract void findAdministrator();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
