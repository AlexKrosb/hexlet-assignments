package exercise;

// BEGIN

public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat (double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public Flat () {

    }
    public double getThisArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public void setBalconyArea(double balconyArea) {
        this.balconyArea = balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getArea() {
        double result = area + balconyArea;
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "Квартира площадью " +
                + getArea() + " метров" +
                " на " + floor +
                " этаже";
    }

    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        }
        if (getArea() < another.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

// END
