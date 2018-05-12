public class Calculate {
    public static void main(String[] args) {

        double number1, number2;

        number1 = 22.11;
        number2 = -2;

        Calculator start = new Calculator();

        start.add(number1, number2);
        System.out.println("Sum is " + start.sum);

        start.subtract(number1, number2);
        System.out.println("Diff is " + start.sub);

        start.divide(number1, number2);
        System.out.println("Div is " + start.div);

        start.multiply(number1, number2);
        System.out.println("Mult is " + start.mult);


    }
}
