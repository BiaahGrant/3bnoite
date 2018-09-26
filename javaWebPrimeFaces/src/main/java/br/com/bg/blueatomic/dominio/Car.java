package br.com.bg.blueatomic.dominio;

public class Car {

    private String id;
    private String brand;
    private int year;
    private String color;

    public Car() {
    }
    

    public Car(String id, String randomBrand, int randomYear, String randomColor) {
        this.id = id;
        this.brand = randomBrand;
        this.year = randomYear;
        this.color = randomColor;
    }

    Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        this.id = id;
        this.brand = randomBrand;
        this.year = randomYear;
        this.color = randomColor;
    }

    

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand=" + brand + ", year=" + year + ", color=" + color + '}';
    }
    

}