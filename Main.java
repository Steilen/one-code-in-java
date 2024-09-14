class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int maxSpeed;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Tesla");
        car1.setModel("Model S");
        car1.setYear(2022);
        car1.setColor("Red");
        car1.setMaxSpeed(250);
        car1.setPrice(79999.99);

        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setModel("M3");
        car2.setYear(2021);
        car2.setColor("Blue");
        car2.setMaxSpeed(240);
        car2.setPrice(69999.99);

        System.out.println("Car 1:");
        car1.showCarInfo();
        System.out.println("\nCar 2:");
        car2.showCarInfo();
    }
}
