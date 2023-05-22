public class Laptop {
    String brand;
    String model;
    String color;
    Integer ozu;
    Integer zmd;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", ozu=" + ozu +
                ", zmd=" + zmd +
                '}';
    }

    public Laptop(String brand, String model, String color, Integer ozu, Integer zmd) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ozu = ozu;
        this.zmd = zmd;
    }
}
