public class Bread implements Bakable {
    private String type;
    private double price;


    public Bread(String type, double price) {
        this.type = type;
        this.price = price;
    }
    @Override
    public void bake(){
        System.out.println("Bread is baked");
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
