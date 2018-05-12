import java.util.Random;

public class MathOperators {

    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        System.out.println("x:" + x);
        System.out.println("y:" + y);

        System.out.print("Is x greater than y? ");
        boolean result = x > y;
        System.out.println(result);

        System.out.print("If x is multiplied by 2 is greater than y? ");
        result = 2 * x > y;
        System.out.println(result);

        System.out.print("Is y less than the sum of x + 3 and at the same time greater than x minus 2? ");
        result = y < (x + 3) && y > (x - 2);
        System.out.println(result);

        System.out.print("Is the product of x and y numbers even?? ");
        result = (x * y) % 2 == 0;
        System.out.println(result);

    }


}
