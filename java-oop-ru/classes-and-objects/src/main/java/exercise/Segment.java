package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;
    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        Integer x1 = getBeginPoint().getX();
        Integer x2 = getEndPoint().getX();
        Integer x3 = (x1 + x2) / 2;
        Integer y1 = getBeginPoint().getY();
        Integer y2 = getEndPoint().getY();
        Integer y3 = (y1 + y2) / 2;
        return new Point(x3, y3);
    }
}
// END
