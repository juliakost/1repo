package task1;

public class CalcTest {
    public static void main(String[] args) {
        Calculator test = new Calculator();

        System.out.println(test.add(5, 6));
        System.out.println(test.add(1.5, 3.5, 0.8));

        System.out.println(test.subtract(5, 6));
        System.out.println(test.subtract(1.5, 3.5, 0.8));

    }

}
