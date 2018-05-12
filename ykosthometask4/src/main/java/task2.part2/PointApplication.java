package task2.part2;

import task2.Point;

public class PointApplication {

    private static final int ADD_X = 1;
    private static final int ADD_Y = 2;
    private static final int MINUS_X = 3;
    private static final int MINUS_Y = 4;

    public static void main(String[] args) {

        Point point = new Point(4, 6);

        PointController pointController = new PointController();

        System.out.println("x + 1 = " + pointController.addX(point));
        System.out.println("y + 1 = " + pointController.addY(point));

        System.out.println("x - 1 = " + pointController.minusX(point));
        System.out.println("y - 1 = " + pointController.minusY(point));


        int value = 1;
        switch (value) {
            case ADD_X:
                System.out.println(pointController.addX(point));
                break;
            case ADD_Y:
                System.out.println(pointController.addY(point));
                break;
            case MINUS_X:
                System.out.println(pointController.addX(point));
                break;
            case MINUS_Y:
                System.out.println(pointController.addY(point));
                break;


        }


    }
}
