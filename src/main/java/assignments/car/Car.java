package assignments.car;

public class Car extends Vehicle {
    private int speed;
    private String color;
    private String brand;

    public Car(){}
    public Car(String s){}

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int value){
        speed=value;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String value){
        color=value;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String value){
        brand=value;
    }
}
