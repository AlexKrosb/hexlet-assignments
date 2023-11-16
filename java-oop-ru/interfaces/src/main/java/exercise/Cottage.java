package exercise;

// BEGIN
public class Cottage implements Home{
    private double area;
    private int floor;

    public Cottage(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    @Override
    public double getArea() {
        return area;
    }

    @Override
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

    @Override
    public String toString() {
        return getFloor() + " этажный коттедж площадью " +  getArea() + " метров";
    }
}

// END
