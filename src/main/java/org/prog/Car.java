package org.prog;
import java.util.Objects;

public class Car implements ITransport {

    private String color;
    private int mileage = 0;

    public void goTo() {
        mileage += 10;
        goTo("somewhere");
    }

    public void goTo(String destination) {
        goTo("current city", destination);
    }

    public void goTo(String from, String destination) {
        goTo(from, destination, "nowhere");
    }

    public void goTo(String from, String destination, String passingThrough) {
        System.out.println("Car is going from " + from + " to "
                + destination + " stopping at " + passingThrough);
    }

    public void turn(String direction) {
        System.out.println(color + " car turns " + direction);
    }

    public void stopAt(String stop) {
        System.out.println(color + " car stops at " + stop);
    }

    public void setColor(String newColor) {
        if (newColor != null) {
            color = newColor;
        }
    }

    public String getColor() {
        return color;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            return this.color.equals(car.color) && mileage == car.mileage;
        }
    return false;
    }

    @Override
    public int hashCode() {
    return (color + mileage).hashCode();
}


}