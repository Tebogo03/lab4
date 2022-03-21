package Com.Task;

 class Car {
    private String model;
    private String brand;
    private String color;
    private int year;
    private int price;
    private int quantity;

    public Car(String model,String brand,String color,int year,int price,int quantity){
        this.model =model;
        this.brand= brand;
        this.color = color;
        this.year= year;
        this.price= price;
        this.quantity= quantity;
    }
    void sell(int sold){
     quantity -= sold;
    }

    void delivery (int delivery) {
        quantity += delivery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
public class CarDemo{

    public static void main(String[] args) {
        Car car1 = new Car("GLE","Toyota","blue",2018,20000,3);
        System.out.println(car1.toString());
        System.out.println(car1.getColor());
        car1.sell(1);
        car1.delivery(2);
        int year = car1.getYear();
        car1.setColor("red");
        System.out.println(car1.toString());

     }

}
