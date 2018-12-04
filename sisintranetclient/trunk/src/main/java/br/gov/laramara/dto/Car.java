package br.gov.laramara.dto;
/*
* @autor Rubens Leme 
*/

public class Car {
 
    private String id;
    private int year;
    private String color;
    private String brand;

    public Car() {
    }
    
    
    public Car(String randomId,String randomBrand, int randomYear,String randomColor) {
      
        this.id = randomId;
        this.year = randomYear;
        this.brand = randomBrand;
        this.color =  randomColor;
        
    }

    public String getId() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
