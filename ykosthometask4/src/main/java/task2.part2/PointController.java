package task2.part2;

import task2.Point;

public class PointController {


    public int addX(Point point) {

        return point.getX() + 1;
    }

    public int minusX(Point point) {
        return point.getX() - 1;
    }

    public int addY(Point point) {
        return point.getY() + 1;
    }

    public int minusY(Point point) {
        return point.getY() - 1;
    }


}
